package com.cotizador.demo.controllers;

import com.cotizador.demo.models.Pais;
import com.cotizador.demo.models.Paises;
import com.cotizador.demo.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pais")
public class PaisController {
    @Autowired
    PaisService paisService;

    @GetMapping()
    public ArrayList<Pais> obtenerPais(){
        return paisService.obtenerPaises();
    }

    @PostMapping()
    public Pais guardarPais(@RequestBody Pais pais){
        return this.paisService.guardarPais(pais);
    }

    @GetMapping( path = "/{id}")
    public Optional<Pais> obtenerPaisPorId(@PathVariable("id") Long id) {
        return this.paisService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.paisService.eliminarPais(id);
        if (ok){
            return "Se eliminó el pais con id " + id;
        }else{
            return "No se pudo eliminar el pais con id" + id;
        }
    }

    @GetMapping( path = "/buscarporregion/{id}")
    public ArrayList<Pais> obtenerPaisesPorRegion(@PathVariable Integer id) {
        return this.paisService.buscarPorRegion(id);
    }


}
