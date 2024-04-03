package com.example.Store.modelos;

import com.example.Store.helpers.ValidacionTipoPrenda;
import jakarta.persistence.*;

@Entity
@Table(name = "tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ValidacionTipoPrenda validacion = new ValidacionTipoPrenda();
    @Column(name ="nombre",nullable = false, length = 80)
    private String nombre; //no vacio solo letras y espacios y longitud 80 max

    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            this.validacion.validarNombre(nombre);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
