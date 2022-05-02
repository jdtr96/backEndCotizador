package com.cotizador.demo.services;

import com.cotizador.demo.models.Descuento;
import com.cotizador.demo.models.Pais;
import com.cotizador.demo.repositories.DescuentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DescuentoService {

    @Autowired
    DescuentoRepository descuentoRepository;

    public ArrayList<Descuento> obtenerDescuentos(){
        return (ArrayList<Descuento>) descuentoRepository.findAll();
    }

    public Descuento guardarDescuento(Descuento descuento){
        return descuentoRepository.save(descuento);
    }

    public Optional<Descuento> obtenerPorId(Long id){
        return descuentoRepository.findById(id);
    }

    public boolean eliminarDescuento(Long id) {
        try{
            descuentoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public Descuento buscarPorCodigoDescuento(String codigo){
        return (Descuento) descuentoRepository.findByCodigoDescuentp(codigo);
    }


}
