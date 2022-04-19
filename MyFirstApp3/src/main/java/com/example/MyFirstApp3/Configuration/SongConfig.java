package com.example.MyFirstApp3.Configuration;

import com.example.MyFirstApp3.Entity.Band;
import com.example.MyFirstApp3.Entity.Song;
import com.example.MyFirstApp3.Repository.BandRepository;
import com.example.MyFirstApp3.Repository.SongRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SongConfig {

    @Bean
    CommandLineRunner commandLineRunner1(SongRepository songRepository, BandRepository bandRepository) {
        return strings -> {



            songRepository.save(new Song("Song1",  5,bandRepository.getById(1)));
            songRepository.save(new Song("Song2",  4,bandRepository.getById(1)));
            songRepository.save(new Song("Song3",  3,bandRepository.getById(2)));
            songRepository.save(new Song("Song4",  7,bandRepository.getById(3)));
            songRepository.save(new Song("Song5",  2,bandRepository.getById(4)));
            songRepository.save(new Song("Song6",  9,bandRepository.getById(5)));
            songRepository.save(new Song("Song7",  6,bandRepository.getById(6)));
            songRepository.save(new Song("Song8",  10,bandRepository.getById(7)));
            songRepository.save(new Song("Song9",  6,bandRepository.getById(8)));



        };
    }
}
