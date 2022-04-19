package com.example.MyFirstApp3.Configuration;


import com.example.MyFirstApp3.Entity.Band;
import com.example.MyFirstApp3.Entity.Song;
import com.example.MyFirstApp3.Entity.Style;
import com.example.MyFirstApp3.Repository.BandRepository;
import com.example.MyFirstApp3.Repository.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.plaf.metal.MetalBorders;

@Configuration
public class BandConfig {

   @Bean
    CommandLineRunner commandLineRunner(BandRepository bandRepository) {
        return strings -> {
            bandRepository.save(new Band( "Slipknot", Style.HARDROCK));
            bandRepository.save(new Band("Iron Maiden", Style.METAL));
            bandRepository.save(new Band("Metallica", Style.METAL));
            bandRepository.save(new Band("As i lay dying", Style.ROCK));
            bandRepository.save(new Band("Motorhead", Style.HARDROCK));
            bandRepository.save(new Band("Black label society", Style.ROCK));
            bandRepository.save(new Band("Sepultura", Style.METAL));
            bandRepository.save(new Band("Kabat", Style.HARDROCK));
            bandRepository.save(new Band("Doga", Style.HARDROCK));



        };


    }





}
