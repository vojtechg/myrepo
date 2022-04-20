package com.example.MyFirstApp3.Repository;

import com.example.MyFirstApp3.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

    void deleteRatingById(Integer id);

    Optional<Rating> findRatingById(Long id);

    Optional<Rating> findRatingByUserIdAndSongId(Integer userId, Integer songId);

    List<Rating> findAllRatingsBySongId(Integer songId);
}
