package com.progII;

import com.progII.model.Persona;

import java.util.Optional;

//evita las excepciones NullPointerException
//
public class _Optionals {
    public static void main(String[] args) {

        String cadena = null;
        //Optional<String> msg = Optional.of(cadena); OF se usa cuando si o si hay datos
        Optional<String> msg = Optional.ofNullable(cadena); // OFNULLABLE es cuando puede ser nulo

        System.out.println("Is empty (vacio)? " + msg.isEmpty());

        System.out.println("Is present (lleno)? " + msg.isPresent());

        System.out.println(msg.orElse("mensaje  GENERICO"));

//IF-PRESENT-OR-ELSE realiza la primera instruccion o sino se cumple, realiza la segunda

        msg.ifPresentOrElse(m -> System.out.println(m), () -> System.out.println("mensaje GENERICO"));


    }//cierra main
}//cierra clase
