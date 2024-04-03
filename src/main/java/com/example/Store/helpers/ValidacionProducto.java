package com.example.Store.helpers;

public class ValidacionProducto {


    public EvaluarPatron evaluarCoincidencias = new EvaluarPatron();

    public boolean validarNombreProducto(String nombreProducto)throws Exception{

        String expresionRegular = "^[a-zA-Z ]+$";

        if (!this.evaluarCoincidencias.evaluarPatron(nombreProducto,expresionRegular)){
            throw new Exception("El nombre ingresado solo puede tener letras y espacios");
        }
        if (nombreProducto.length()>60){
            throw new Exception("El nombre ingresado es demasiado largo");
        }
        return true;
    }

    public boolean validarReferencia(String referencia)throws Exception{
        String expresionRegular = "[a-zA-Z0-9]{14}";

        if (!this.evaluarCoincidencias.evaluarPatron(referencia,expresionRegular)){
            throw new Exception("El codigo de referencia deben ser 14 digitos");
        }
        return true;
    }

    public boolean validarTalla(String talla)throws Exception{
        String expresionRegular = "(XS|S|M|L|XL)([0-9]+)?";

        if (!this.evaluarCoincidencias.evaluarPatron(talla,expresionRegular)){
            throw new Exception("verifique la talla ingresada");
        }
        return true;
    }

    public boolean validarCantidadBodega(String cantidadBodega)throws Exception{
        String expresionRegular = "\\d+";

        if (!this.evaluarCoincidencias.evaluarPatron(cantidadBodega,expresionRegular)){
            throw new Exception("El numero que ingresaste es invalido");
        }
        return true;
    }

    public boolean validarPrecioUnitario(String precioUnitario)throws Exception{
        String expresionRegular = "\\d+";

        if (!this.evaluarCoincidencias.evaluarPatron(precioUnitario,expresionRegular)){
            throw new Exception("El numero que ingresaste es invalido");
        }
        return true;
    }

    public boolean validarDescripcion(String descripcion)throws Exception{
        if (descripcion.length()>100){
            throw new Exception("El texto ingresado es demasiado largo");
        }
        return true;
    }

    public boolean validarFotografia(String fotografia)throws Exception{
        if (fotografia.length()>250){
            throw new Exception("El texto ingresado es demasiado largo");
        }
        return true;
    }

}
