package com.cotizador.demo.services;

import com.cotizador.demo.models.Region;
import com.cotizador.demo.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RegionService {
    @Autowired
    RegionRepository regionRepository;

    public ArrayList<Region> obtenerRegiones(){
        return (ArrayList<Region>) regionRepository.findAll();
    }

    public Region guardarRegion(Region region){
        return regionRepository.save(region);
    }

    public Optional<Region> obtenerPorId(Long id){
        return regionRepository.findById(id);
    }

    public boolean eliminarRegion(Long id) {
        try{
            regionRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
