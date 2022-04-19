package com.example.MyFirstApp3.Service;

import com.example.MyFirstApp3.Entity.Band;
import com.example.MyFirstApp3.Entity.Song;
import com.example.MyFirstApp3.Entity.Style;
import com.example.MyFirstApp3.Repository.BandRepository;
import com.example.MyFirstApp3.Repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SongService implements SongT {

    private final SongRepository songRepository;




    @Autowired
    public SongService(SongRepository songRepository){
        this.songRepository = songRepository;

    }




    @Override
    public Song addSong(Song song){
        song.setId(0);
        return songRepository.save(song);
    }

    @Override
    public List<Song>findAllSongs(){
        return songRepository.findAll();
    }

    @Override
    public Song updateSong(Song song){
        return songRepository.save(song);
    }

    @Override
    public Song findSongById(Integer id) {
        return songRepository.findSongById(id).get();
    }
    @Override
    public void deleteSong(Integer id){
        songRepository.deleteById(id);
    }


}
