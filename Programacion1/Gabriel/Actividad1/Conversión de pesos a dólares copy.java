import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double COTIZACION_DOLAR = 467.0;

        System.out.print("Ingrese el importe en pesos: ");
        double pesos = sc.nextDouble();

        double dolares = pesos / COTIZACION_DOLAR;

        System.out.println("Equivale a " + dolares + " dólares.");

        sc.close();
    }
}
