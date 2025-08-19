import java.util.Scanner;

public class Ejercicio1Alt {
    public static final double COTIZACION_DOLAR = 467.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el importe en pesos: ");
        double pesos = sc.nextDouble();

        double dolares = convertirAPesos(pesos);

        System.out.printf("Equivale a %.2f dólares.%n", dolares);

        sc.close();
    }

    public static double convertirAPesos(double pesos) {
        return pesos / COTIZACION_DOLAR;
    }
}
