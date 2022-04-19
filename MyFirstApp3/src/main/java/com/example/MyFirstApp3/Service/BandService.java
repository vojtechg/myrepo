package com.example.MyFirstApp3.Service;


import com.example.MyFirstApp3.Entity.Band;
import com.example.MyFirstApp3.Entity.Song;
import com.example.MyFirstApp3.Repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BandService implements BandServiceT {

    private final BandRepository bandRepository;


    @Autowired
    public BandService(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    @Override
    public Band findBandById(Integer id) {
        return bandRepository.getById(id);
    }

    @Override
    public void saveBand(Band band){
        band.setId(0);
        bandRepository.save(band);
    }

    @Override
    public List<Band> getAllBands(){
        return bandRepository.findAll();
    }

    @Override
    public void deleteBand(int id){
        bandRepository.deleteById(id);
    }

    public List<Band> findAllByName(String name){
        List<Band> band = bandRepository.findAllByName(name);
        return band;
    }

}
