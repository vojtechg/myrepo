package com.example.MyFirstApp3.Controller;

import com.example.MyFirstApp3.Entity.Band;
import com.example.MyFirstApp3.Service.BandServiceT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BandController {

    @Autowired
    private BandServiceT bandServiceT;

    @GetMapping("Bands")
    public List<Band> showAllBands(){
        List<Band> allBands = bandServiceT.getAllBands();
        return allBands;
    }

    @GetMapping("band/id")
    public Band showBand(@PathVariable int id) {
        Band band = bandServiceT.findBandById(id);

        return band;
    }

    @PostMapping("band")
    public Band addNewband(@RequestBody Band band){
        bandServiceT.saveBand(band);
        return band;

    }

    @PutMapping("/bands")
    public Band updateBand(@RequestBody Band band){
        bandServiceT.saveBand(band);
        return band;
    }

    @DeleteMapping("/bands/{id}")
    public String deleteBand(@PathVariable int id){
        Band band = bandServiceT.findBandById(id);
        bandServiceT.deleteBand(id);
        return "band" + id + "was deleted";
    }

    /*@GetMapping
    public List<Band> showAllBandsByName(@PathVariable String name){
        List<Band> bands = bandServiceT.findAllByName(name);
        return bands;
    }*/
















}
