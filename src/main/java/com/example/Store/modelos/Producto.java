package com.example.Store.modelos;

import com.example.Store.helpers.ValidacionProducto;
import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ValidacionProducto validacion = new ValidacionProducto();
    @Column(name ="nombreProducto",nullable = false, length = 60)
    private String nombreProducto; //no vacio solo letras y espacios long 60
    @Column(name ="referencia",nullable = false, length = 14)
    private String referencia; //no vacio long 14
    @Column(name ="talla",nullable = false, length = 10)
    private String talla; //maximo 3 caracteres
    @Column(name ="cantidadBodega",nullable = false)
    private Integer cantidadBodega; //solo numeros positivos
    @Column(name ="precioUnitario",nullable = false)
    private Integer precioUnitario; //solo numeros positivos
    @Column(name ="descripcion",nullable = false, length = 100)
    private String descripcion; //long 100
    @Column(name ="fotografia",nullable = false, length = 254)
    private String fotografia; //no vacio max 250 caracteres

    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String referencia, String talla, Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        try{
            this.validacion.validarNombreProducto(nombreProducto);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        try{
            this.validacion.validarReferencia(referencia);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        try{
            this.validacion.validarTalla(talla);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(String cantidadBodega) {
        try{
            this.validacion.validarCantidadBodega(cantidadBodega);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        try{
            this.validacion.validarPrecioUnitario(precioUnitario);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try{
            this.validacion.validarDescripcion(descripcion);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        try{
            this.validacion.validarFotografia(fotografia);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
