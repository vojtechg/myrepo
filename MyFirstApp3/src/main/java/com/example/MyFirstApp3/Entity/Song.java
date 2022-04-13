package com.example.MyFirstApp3.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String nameOfBand;
    private Integer score;

    public Song( String name, String nameOfBand, Integer score) {

        this.name = name;
        this.nameOfBand = nameOfBand;
        this.score = score;
    }

    public Song(){


    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nameOfBand='" + nameOfBand + '\'' +
                ", score=" + score +
                '}';
    }
}
