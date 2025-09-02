import java.util.Scanner;
import java.util.Random;

public class EjerciciosVectores {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }

    // Ejercicio 1
    public static void ejercicio1() {
        System.out.println("=== EJERCICIO 1 ===");
        int[] vectorNumeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = random.nextInt(10) + 1; // números entre 1 y 10
        }

        for (int numero : vectorNumeros) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println("Número: " + numero + " | Cuadrado: " + cuadrado + " | Cubo: " + cubo);
        }
        System.out.println();
    }

    // Ejercicio 2
    public static void ejercicio2() {
        System.out.println("=== EJERCICIO 2 ===");
        Scanner sc = new Scanner(System.in);
        String[] vector = new String[5];
        String[] vectorInvertido = new String[5];

        System.out.println("Ingrese 5 palabras:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sc.nextLine();
        }

        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
        }

        System.out.println("Vector invertido:");
        for (String palabra : vectorInvertido) {
            System.out.println(palabra);
        }
        System.out.println();
    }

    // Ejercicio 3
    public static void ejercicio3() {
        System.out.println("=== EJERCICIO 3 ===");
        Scanner sc = new Scanner(System.in);

        String[] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMes = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        System.out.print("Ingrese un número de mes (1-12): ");
        int numeroMes = sc.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            System.out.println("Mes: " + meses[numeroMes - 1] + " | Días: " + diasMes[numeroMes - 1]);
        } else {
            System.out.println("Número de mes inválido.");
        }
    }
}
