package com.example.Store.helpers;

public class ValidacionTipoPrenda {


    public EvaluarPatron evaluarCoincidencias = new EvaluarPatron();

    public boolean validarNombre(String nombre)throws Exception{

        String expresionRegular = "^[a-zA-Z ]+$";

        if (!this.evaluarCoincidencias.evaluarPatron(nombre,expresionRegular)){
            throw new Exception("El nombre ingresado solo puede tener letras y espacios");
        }
        if (nombre.length()>80){
            throw new Exception("El nombre ingresado es demasiado largo");
        }
        return true;
    }

}
