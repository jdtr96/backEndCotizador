package com.cotizador.demo.controllers;

import com.cotizador.demo.models.Region;
import com.cotizador.demo.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/region")
public class RegionController {
    @Autowired
    RegionService regionService;

    @GetMapping()
    public ArrayList<Region> obtenerRegion(){
        return regionService.obtenerRegiones();
    }

    @PostMapping()
    public Region guardarRegion(@RequestBody Region region){
        return this.regionService.guardarRegion(region);
    }

    @GetMapping( path = "/{id}")
    public Optional<Region> obtenerRegionPorId(@PathVariable("id") Long id) {
        return this.regionService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.regionService.eliminarRegion(id);
        if (ok){
            return "Se eliminó la region con id " + id;
        }else{
            return "No se pudo eliminar la region con id" + id;
        }
    }
}
