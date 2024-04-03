package com.example.Store.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvaluarPatron {
    public EvaluarPatron() {
    }

    public boolean evaluarPatron(String cadena, String regex){

    Pattern patron=Pattern.compile(regex);
    Matcher coincidencia=patron.matcher(cadena);

    if (coincidencia.matches()){
        return true;
    }else{
        return false;
    }


    }
}
