package com.example.MyFirstApp3.Service;

import com.example.MyFirstApp3.Entity.Band;

import java.util.List;

public interface BandServiceT {

    public List<Band> getAllBands();
    Band findBandById(Integer id);
    public void saveBand(Band band);
    public void deleteBand(int id);
    public List<Band>findAllByName(String name);
}
