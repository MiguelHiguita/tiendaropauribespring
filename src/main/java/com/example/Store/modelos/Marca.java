package com.example.Store.modelos;

import com.example.Store.helpers.ValidacionMarca;
import com.example.Store.helpers.ValidacionUsuario;
import jakarta.persistence.*;

import java.awt.*;
import java.time.LocalDate;

@Entity
@Table(name = "marcas")

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ValidacionMarca validacion = new ValidacionMarca();
    @Column(name ="nombreMarca",nullable = false, length = 50)
    private String nombreMarca; //no vacio y maximo 50 caracteres
    @Column(name ="nit",nullable = false, length = 10)
    private String nit; //no vacio solo numeros y long max 10
    @Column(name ="anoCreacion",nullable = false)
    private LocalDate anoCreacion; //no vacio formato internacional
    @Column(name ="sedePrincipal",nullable = false, length = 20)
    private String sedePrincipal; //no valida

    public Marca() {
    }

    public Marca(Integer id, String nombreMarca, String nit, LocalDate anoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombreMarca = nombreMarca;
        this.nit = nit;
        this.anoCreacion = anoCreacion;
        this.sedePrincipal = sedePrincipal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        try{
            this.validacion.validarNombreMarca(nombreMarca);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        try{
            this.validacion.validarNit(nit);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(String anoCreacion) {
        try{
            this.validacion.validarAnoCreacion(anoCreacion);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getSedePrincipal() {
        return sedePrincipal;
    }

    public void setSedePrincipal(String sedePrincipal) {
        this.sedePrincipal = sedePrincipal;
    }
}
