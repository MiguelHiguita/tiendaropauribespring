package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="nombres",nullable = false, length = 50)
    private String nombres; //no vacio-solo letras y espacios-long max 50 caracteres
    @Column(name ="apellidos",nullable = false, length = 20)
    private String apellidos; //no valida nada
    @Column(name ="cedula",nullable = false, length = 10)
    private String cedula; //solo numeros sin espacios, no vacio, long 10
    @Column(name ="correo",nullable = false, length = 30)
    private String correo; //no vacio y formato convencional de correo
    @Column(name ="direccion",nullable = false, length = 15)
    private String direccion; //no valida nada
    @Column(name ="sexo",nullable = false, length = 20)
    private String sexo; //solo debe contener las palabras (masculino/femenino)
    @Column(name ="mediopago",nullable = false, length = 15)
    private String medioPago; //no se valida
    @Column(name ="pais",nullable = false, length = 50)
    private String pais; //no se valida
    @Column(name ="departamento",nullable = false, length = 50)
    private String departamento; //no valida
    @Column(name ="municipio",nullable = false, length = 50)
    private String municipio; //no valida
    @Column(name ="codigoPostal",nullable = false, length = 50)
    private String codigoPostal; ////no vacio y solo numeros, long 6

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String apellidos, String cedula, String correo, String direccion, String sexo, String medioPago, String pais, String departamento, String municipio, String codigoPostal) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.direccion = direccion;
        this.sexo = sexo;
        this.medioPago = medioPago;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigoPostal = codigoPostal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
