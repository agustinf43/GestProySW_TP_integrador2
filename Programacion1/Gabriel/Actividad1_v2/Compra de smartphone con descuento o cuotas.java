import java.util.Scanner;

public class Ejercicio3Alt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio de lista del equipo: ");
        double precioLista = sc.nextDouble();

        double precioEfectivo = calcularEfectivo(precioLista, 15);
        double precioCuotas = calcularCuotas(precioLista, 10, 12);

        System.out.printf("Precio pagando en efectivo: $%.2f%n", precioEfectivo);
        System.out.printf("Precio total en 12 cuotas: $%.2f%n", precioCuotas);
        System.out.printf("Valor de cada cuota: $%.2f%n", precioCuotas / 12);

        sc.close();
    }

    public static double calcularEfectivo(double precio, double descuento) {
        return precio * (1 - descuento / 100);
    }

    public static double calcularCuotas(double precio, double recargo, int cuotas) {
        return precio * (1 + recargo / 100);
    }
}
