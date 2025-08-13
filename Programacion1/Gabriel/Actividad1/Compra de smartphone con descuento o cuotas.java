import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio de lista del equipo: ");
        double precioLista = sc.nextDouble();

        double precioEfectivo = precioLista - (precioLista * 0.15);
        double precioCuotas = precioLista + (precioLista * 0.10);
        double valorCuota = precioCuotas / 12;

        System.out.println("Precio pagando en efectivo: $" + precioEfectivo);
        System.out.println("Precio total en 12 cuotas: $" + precioCuotas);
        System.out.println("Valor de cada cuota: $" + valorCuota);

        sc.close();
    }
}
