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

}
