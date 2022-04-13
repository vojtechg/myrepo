package com.example.MyFirstApp3.Service;

import com.example.MyFirstApp3.Entity.Song;
import com.example.MyFirstApp3.Repository.SongRepository;

import java.util.List;

public interface SongT {
    Song addSong(Song song);
    List<Song> findAllSongs();
    Song updateSong(Song song);
    Song findSongById(Integer id);
    void deleteSong(Integer id);


}
