package com.cotizador.demo.models;

public class Paises {
    private Long id;
    private String nombre;
    private Double tarifa;
    private Integer region;

    public Paises() {
    }

    public Paises(Long id, String nombre, Double tarifa, Integer region) {
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

    public Integer getId_region() {
        return region;
    }

    public void setId_region(Integer id_region) {
        this.region = id_region;
    }
}
