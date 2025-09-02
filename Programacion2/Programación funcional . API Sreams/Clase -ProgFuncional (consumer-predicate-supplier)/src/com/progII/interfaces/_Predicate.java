package com.progII.interfaces;

import java.util.function.Predicate;

public class _Predicate {
    //reciben un argumento que evalua y devuelven true o false
    public static void main(String[] args) {

        System.out.println("tel +543482112233");
        System.out.println(telValido.test("+543482112233"));

        System.out.println("tel +5434");
        System.out.println(telValido.test("+5434"));

    }//cierra main
    static Predicate<String> telValido = (tel) -> tel.startsWith("+54")&&tel.length()==13;


}//cierra clase
