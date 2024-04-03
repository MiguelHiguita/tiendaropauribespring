package com.example.Store.helpers;

public class ValidacionPedido {


    public EvaluarPatron evaluarCoincidencias = new EvaluarPatron();

    public boolean validarFechaYHora(String fechaYHora)throws Exception{
        String expresionRegular = "\\d{2}/\\d{2}/\\d{4}";

        if (!this.evaluarCoincidencias.evaluarPatron(fechaYHora,expresionRegular)){
            throw new Exception("Verifique la fecha");
        }
        return true;
    }

}
