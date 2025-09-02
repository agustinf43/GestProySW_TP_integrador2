package com.progII.interfaces;


import java.util.function.Supplier;

public class _Supplier {
    //no recibe nada pero si devuelve algo
    public static void main(String[] args) {

       //
        System.out.println(getCadenaConexionBD);



    }
    static Supplier<String> getCadenaConexionBD =
            () -> "jdbc:mysql://localhost:3306/mibD?";

}
