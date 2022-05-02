package com.cotizador.demo.services;

import com.cotizador.demo.models.Pais;
import com.cotizador.demo.models.Paises;
import com.cotizador.demo.repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaisService {
    @Autowired
    PaisRepository paisRepository;

    public ArrayList<Pais> obtenerPaises(){
        return (ArrayList<Pais>) paisRepository.findAll();
    }

    public Pais guardarPais(Pais pais){
        return paisRepository.save(pais);
    }

    public Optional<Pais> obtenerPorId(Long id){
        return paisRepository.findById(id);
    }

    public boolean eliminarPais(Long id) {
        try{
            paisRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public ArrayList<Pais> buscarPorRegion(int id){
        return (ArrayList<Pais>) paisRepository.findByCodigo(id);
    }

}
