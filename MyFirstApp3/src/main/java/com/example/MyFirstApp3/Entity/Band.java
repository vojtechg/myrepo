package com.example.MyFirstApp3.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter @Setter
public class Band {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private Style style;






    public Band( String name, Style style) {
        this.name = name;
        this.style = style;



    }

    public Band(){

    }


}
