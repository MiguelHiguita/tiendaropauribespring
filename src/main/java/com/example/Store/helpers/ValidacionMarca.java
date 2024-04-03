package com.example.Store.helpers;

public class ValidacionMarca {


    public EvaluarPatron evaluarCoincidencias = new EvaluarPatron();

    public boolean validarNombreMarca(String NombreMarca)throws Exception{
        if (NombreMarca.length()>50){
            throw new Exception("El nombre ingresado es demasiado largo");
        }
        return true;
    }

    public boolean validarNit(String nit)throws Exception{
        String regex = "\\d{10}";

        if (!this.evaluarCoincidencias.evaluarPatron(nit,regex)){
            throw new Exception("El numero ingresado es invalido");
        }
        return true;
    }

    public boolean validarAnoCreacion(String anoCreacion)throws Exception{
        String expresionRegular = "\\d{2}/\\d{2}/\\d{4}";

        if (!this.evaluarCoincidencias.evaluarPatron(anoCreacion,expresionRegular)){
            throw new Exception("Verifique la fecha");
        }
        return true;
    }

}
