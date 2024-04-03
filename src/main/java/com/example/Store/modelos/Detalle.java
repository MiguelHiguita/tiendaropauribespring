package com.example.Store.modelos;

import com.example.Store.helpers.ValidacionDetalle;
import jakarta.persistence.*;

@Entity
@Table(name = "detalle")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ValidacionDetalle validacion = new ValidacionDetalle();
    @Column(name ="costoTotal",nullable = false)
    private Integer costoTotal; //no vacio solo numeros positivos
    @Column(name ="cantidadProductos",nullable = false)
    private Integer cantidadProductos; //no vacio solo numeros positivos

    public Detalle() {
    }

    public Detalle(Integer id, Integer costoTotal, Integer cantidadProductos) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.cantidadProductos = cantidadProductos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(String costoTotal) {
        try{
            this.validacion.validarCostoTotal(costoTotal);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(String cantidadProductos) {
        try{
            this.validacion.validarCantidadProductos(cantidadProductos);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

}

