package com.example.Store.modelos;

import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="nombreMarca",nullable = false, length = 30)
    private String nombreMarca;
    @Column(name ="nit",nullable = false, length = 50)
    private String nit;
    @Column(name ="anoCreacion",nullable = false)
    private LocalDate anoCreacion;
    @Column(name ="sedePrincipal",nullable = false, length = 20)
    private String sedePrincipal;

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }
}
