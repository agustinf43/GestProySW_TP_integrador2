package com.progII;

import com.progII.interfaces.Calculadora;
import com.progII.interfaces.Mensaje;
import com.progII.model.Persona;

public class Main {
    public static void main(String[] args) {

        //   > <

        //NOTA:
        // metodo estaticos se crean, acceden e implementan desde la CLASE PADRE, no desde el objeto hijo creado a partir de este
        Persona p = new Persona();


        //forma imperativa
        CalcularSuma suma = new CalcularSuma();
        suma.calcular(45, 23);

        //forma FUNCIONAL
        //PASO 1. creo la variable de tipo interfaz funcional
        Calculadora sumaLambda;

        //PASO 2. a la interfaz funcional le indico como implementar el unico metodo
        sumaLambda = (int a, int b) -> {
            System.out.println("la funcion lambda da como resultado:");
            System.out.println(a + b);
        };

        //PASO 3. usar el metodo
        sumaLambda.calcular(45, 23);

        Calculadora multiplicar;
        multiplicar = (int a, int b) -> {
            System.out.println("la funcion lambda MULTIPLICAR da como resultado:");
            System.out.println(a * b);
        };

        multiplicar.calcular(2, 2);

        Mensaje mensajeBienvenida;
        mensajeBienvenida = () -> {
            return "Hola, bienvenido a programacion funcional";
        };
        System.out.println(mensajeBienvenida.mostrarMensaje());


        mensajeBienvenida = () -> "Hola, programacion funcional." + "Este es el segundo mensage";
        System.out.println(mensajeBienvenida.mostrarMensaje());


    }//cierra MAIN
}//CIERRA CLASE