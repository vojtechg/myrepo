package com.example.MyFirstApp3.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter @Setter
public class Rating  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private float rating;
    private Integer userId;
    private Integer songId;

    public Rating(){}

    public Rating(float rating, Integer userId, Integer songId) {
        this.rating = rating;
        this.userId = userId;
        this.songId = songId;
    }


}
