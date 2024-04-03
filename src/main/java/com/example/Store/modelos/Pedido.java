package com.example.Store.modelos;

import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.helpers.ValidacionUsuario;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ValidacionPedido validacion = new ValidacionPedido();
    @Column(name ="fechaYHora",nullable = false)
    private LocalDateTime fechaYHora; //no vacio y formato internacional

    public Pedido() {
    }

    public Pedido(Integer id, LocalDateTime fechaYHora) {
        this.id = id;
        this.fechaYHora = fechaYHora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(String fechaYHora) {
        try{
            this.validacion.validarFechaYHora(fechaYHora);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
    }
}
