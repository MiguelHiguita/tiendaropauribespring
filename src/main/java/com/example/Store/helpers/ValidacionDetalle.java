package com.example.Store.helpers;

public class ValidacionDetalle {


    public EvaluarPatron evaluarCoincidencias = new EvaluarPatron();

    public boolean validarCostoTotal(String costoTotal)throws Exception{
        String regex = "\\d+";

        if (!this.evaluarCoincidencias.evaluarPatron(costoTotal,regex)){
            throw new Exception("El numero ingresado es invalido");
        }
        return true;
    }

    public boolean validarCantidadProductos(String cantidadProductos)throws Exception{
        String regex = "\\d+";

        if (!this.evaluarCoincidencias.evaluarPatron(cantidadProductos,regex)){
            throw new Exception("El numero ingresado es invalido");
        }
        return true;
    }

}
