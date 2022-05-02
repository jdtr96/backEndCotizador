package com.cotizador.demo.controllers;

import com.cotizador.demo.models.Descuento;
import com.cotizador.demo.models.Pais;
import com.cotizador.demo.services.DescuentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/descuento")
public class DescuentoController {
    @Autowired
    DescuentoService descuentoService;

    @GetMapping()
    public ArrayList<Descuento> obtenerDescuento(){
        return descuentoService.obtenerDescuentos();
    }

    @PostMapping()
    public Descuento guardarDescuento(@RequestBody Descuento descuento){
        return this.descuentoService.guardarDescuento(descuento);
    }

    @GetMapping( path = "/{id}")
    public Optional<Descuento> obtenerDescuentoPorId(@PathVariable("id") Long id) {
        return this.descuentoService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.descuentoService.eliminarDescuento(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id" + id;
        }
    }

    @GetMapping( path = "/buscarporcodigo/{codigo}")
    public Descuento obtenerDescuento(@PathVariable String codigo) {
        return this.descuentoService.buscarPorCodigoDescuento(codigo);
    }
}
