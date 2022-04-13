package com.example.MyFirstApp3.Repository;

import com.example.MyFirstApp3.Entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Integer> {

    Optional<Song> findSongById(Integer id);
}
