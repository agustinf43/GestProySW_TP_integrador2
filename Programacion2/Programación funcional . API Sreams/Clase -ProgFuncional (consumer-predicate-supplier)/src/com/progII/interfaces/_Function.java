package com.progII.interfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    //Function <T,R> es una interfaz funcional que representa una funcion
    //que toma un argumento de tipo T y devuelve un resultado tipo R
    //recibe un argumento y devuelve un argumento
    public static void main(String[] args) {

        int nro = incrementarEnUno(5);
        System.out.println("El nro incrementado en uno es: " + nro);

        int resultado = incrementarEnUnoFunction.apply(10);
        System.out.println("incrementarEnUnoFunction: " + resultado);

        resultado = calcularDoble.apply(9);
        System.out.println("doble: " + resultado);

        resultado=calcularDobleySumar1.apply(22);
        System.out.println("Resultsdo de calcularDobleySumar1: "+resultado);
        System.out.println(sumarMostrar.apply(5,9));

    }//cierra main

    static int incrementarEnUno(int nro) {
        nro++;
        return nro;}
    static Function<Integer, Integer> incrementarEnUnoFunction = (nro) -> ++nro;
    static Function<Integer, Integer> calcularDoble = (nro) -> nro * 2;
    static Function<Integer, Integer> calcularDobleySumar1 = incrementarEnUnoFunction.andThen(calcularDoble);

    static BiFunction<Integer, Integer,String> sumarMostrar =
            (nro1,nro2) ->"La suma de "+ nro1+" y " +nro2+" es: "+(nro1+nro2);

}//cierra clase
