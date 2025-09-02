package com.progII;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListasStream {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        lista.add("Elian");
        lista.add("Gabriel");
        lista.add("Agustin");
        lista.add("Ariel");

        lista.stream()
                .filter(getNombreConA())
                .forEach(n -> System.out.println(n));


    }//cierra main

    private static Predicate<String> getNombreConA() {
        return nombre -> nombre.startsWith("A");
    }
}//cierra clase
