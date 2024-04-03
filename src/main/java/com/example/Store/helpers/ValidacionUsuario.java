package com.example.Store.helpers;

public class ValidacionUsuario {


    public EvaluarPatron evaluarCoincidencias = new EvaluarPatron();

    public boolean validarNombres(String nombres)throws Exception{

        String expresionRegular = "^[a-zA-Z ]+$";

        if (!this.evaluarCoincidencias.evaluarPatron(nombres,expresionRegular)){
            throw new Exception("El nombre ingresado solo puede tener letras y espacios");
        }
        if (nombres.length()>50){
            throw new Exception("El nombre ingresado es demasiado largo");
        }
        return true;
    }

    public boolean validarCedula(String cedula)throws Exception{
        String expresionRegular = "\\d{10}";

        if (!this.evaluarCoincidencias.evaluarPatron(cedula,expresionRegular)){
            throw new Exception("El numero de cedula deben ser solo numeros, sin espacios, y deben ser 10 digitos");
        }
        return true;
    }

    public boolean validarCorreo(String correo)throws Exception{
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        if (!this.evaluarCoincidencias.evaluarPatron(correo,expresionRegular)){
            throw new Exception("El correo ingresado es invalido, verifique por favor");
        }
        return true;
    }

    public boolean validarSexo(String sexo)throws Exception{
        String expresionRegular = "(masculino|femenino)";

        if (!this.evaluarCoincidencias.evaluarPatron(sexo,expresionRegular)){
            throw new Exception("El genero ingresado no es permitido");
        }
        return true;
    }

    public boolean validarCodigoPostal(String codigoPostal)throws Exception{
        String expresionRegular = "\\d{6}";

        if (!this.evaluarCoincidencias.evaluarPatron(codigoPostal,expresionRegular)){
            throw new Exception("El codigo postal ingresado no es permitido");
        }
        return true;
    }

}
