package com.example.MyFirstApp3.Controller;

import com.example.MyFirstApp3.Entity.Song;
import com.example.MyFirstApp3.Service.SongService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    private final SongService songService;

    public SongController(SongService songService){
        this.songService = songService;
    }

    @GetMapping("/")
    public List<Song> getAllSongs(){
        return songService.findAllSongs();

    }

    @GetMapping("/{id}")
    public Song getSongByID(@PathVariable("id") Integer id){
        return songService.findSongById(id);

    }

    @PostMapping("/")
    public Song addSong(@RequestBody Song song){
        return songService.addSong(song);

    }

    @PutMapping("/")
    public ResponseEntity<Song> updateSong(@RequestBody Song song){
        Song updateSong = songService.updateSong(song);
        return new ResponseEntity<>(updateSong, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSong(@PathVariable("id") Integer id){
        songService.deleteSong(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
