package com.example.MyFirstApp3.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Integer score;


    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;



    public Song( String name,  Integer score, Band band) {

        this.name = name;
        this.score = score;
        this.band = band;
    }

    public Song(){


    }



    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
