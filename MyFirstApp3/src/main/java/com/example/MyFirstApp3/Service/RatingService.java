package com.example.MyFirstApp3.Service;

import com.example.MyFirstApp3.Entity.Rating;
import com.example.MyFirstApp3.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Rating addRating(Rating rating){
        return ratingRepository.save(rating);
    }

    public List<Rating> findAllRatings(){
        return ratingRepository.findAll();

    }

    public List<Rating>findAllRatingsBySongId(Integer songId){
        return ratingRepository.findAllRatingsBySongId(songId);
    }

    public Rating updateRating(Rating rating){
        return ratingRepository.save(rating);
    }

    public Rating findRatingByUserIdAndSongId(Rating rating){
        return ratingRepository.findRatingByUserIdAndSongId(rating.getUserId(), rating.getSongId()).orElse(null);
    }

    public Rating getRatingByUserIdAndSongId(Integer userId, Integer songId){
        return ratingRepository.findRatingByUserIdAndSongId(userId, songId).orElse(null);
    }

    public Rating findRatingById(Integer id){
        return ratingRepository.findRatingById(id.longValue()).orElse(null);
    }




}
