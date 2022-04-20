package com.example.MyFirstApp3.Controller;

import com.example.MyFirstApp3.Entity.Rating;
import com.example.MyFirstApp3.Service.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    private static Rating ratingServiceStatic;
    private final RatingService ratingService;


    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Rating>> getAllRatings() {
        List<Rating> ratings = ratingService.findAllRatings();
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Rating> getRatingById(@PathVariable("id") Long id) {
        Rating rating = ratingService.findRatingById(ratingServiceStatic.getId());
        return new ResponseEntity<>(rating, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating) {
        Rating newRating = ratingService.addRating(rating);
        return new ResponseEntity<>(newRating, HttpStatus.CREATED);
    }

    @GetMapping("/find/user/{userId}/song/{songId}")
    public ResponseEntity<Rating> getRatingByUserIdAndSongId(@PathVariable Integer userId, @PathVariable Integer songId) {
        System.out.println("User ID: " + userId + "\nsong ID: " + songId);
        Rating rating = ratingService.getRatingByUserIdAndSongId(userId, songId);
        return new ResponseEntity<>(rating, HttpStatus.OK);
    }

    @GetMapping("/find/song/{songId}")
    public ResponseEntity<Float> getAllRatingsBySongId(@PathVariable Integer songId) {
        List<Rating> ratings = ratingService.findAllRatingsBySongId(songId);
        float sum = 0;
        int total = ratings.size();
        for (int i = 0; i < ratings.size(); i++) {
            sum += ratings.get(i).getRating();
        }
        float average = sum / total;

        return new ResponseEntity<>(average, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Rating> updateRating(@RequestBody Rating rating) {
        System.out.println(rating);
        Rating specificRating = ratingService.findRatingByUserIdAndSongId(rating);
        Rating updateRating;
        if (specificRating == null) {
            updateRating = ratingService.addRating(rating);
        } else {
            specificRating.setRating(rating.getRating());
            updateRating = ratingService.updateRating(specificRating);
        }
//        Rating updateRating = ratingService.updateRating(rating);
        return new ResponseEntity<>(updateRating, HttpStatus.OK);
    }

   /* @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRating(@PathVariable("id") Long id) {
        ratingService.deleteRating(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }*/


}
