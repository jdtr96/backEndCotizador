package com.cotizador.demo.models;

import javax.persistence.*;

@Entity
public class Descuento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String tipoC;
    private Double descuento;
    private String codigo;

    public Descuento() {
    }

    public Descuento(Long id, String tipoC, Double descuento, String codigo) {
        this.id = id;
        this.tipoC = tipoC;
        this.descuento = descuento;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



}
