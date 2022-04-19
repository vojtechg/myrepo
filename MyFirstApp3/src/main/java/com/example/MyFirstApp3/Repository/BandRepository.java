package com.example.MyFirstApp3.Repository;

import com.example.MyFirstApp3.Entity.Band;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BandRepository extends JpaRepository<Band, Integer> {


    List<Band> findAllByName(String name);


}
