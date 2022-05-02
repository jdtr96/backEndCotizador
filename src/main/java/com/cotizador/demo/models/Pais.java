package com.cotizador.demo.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pais")
public class Pais implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String nombre;

    private Double tarifa;

    @ManyToOne()
    @JoinColumn(name = "region_id")
    private Region region;

    public Pais() {
    }

    public Pais(Long id, String nombre, Double tarifa, Region region) {
        this.id = id;
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.region = region;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public Region getId_region() {
        return region;
    }

    public void setId_region(Region id_region) {
        this.region = id_region;
    }
}


