import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese la operación a realizar (s = sumar, r = restar, m = multiplicar, d = dividir): ");
        char operacion = scanner.next().toLowerCase().charAt(0); // Convierte a minúscula

        double resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case 's':
                resultado = numero1 + numero2;
                System.out.printf("✅ SUMA: %.2f + %.2f = %.2f%n", numero1, numero2, resultado);
                break;
            case 'r':
                resultado = numero1 - numero2;
                System.out.printf("✅ RESTA: %.2f - %.2f = %.2f%n", numero1, numero2, resultado);
                break;
            case 'm':
                resultado = numero1 * numero2;
                System.out.printf("✅ MULTIPLICACIÓN: %.2f × %.2f = %.2f%n", numero1, numero2, resultado);
                break;
            case 'd':
                if (numero2 == 0) {
                    System.out.println("❌ ERROR: No se puede dividir entre cero.");
                    operacionValida = false;
                } else {
                    resultado = numero1 / numero2;
                    System.out.printf("✅ DIVISIÓN: %.2f ÷ %.2f = %.2f%n", numero1, numero2, resultado);
                }
                break;
            default:
                System.out.println("❌ ERROR: Operación no válida.");
                System.out.println("   Usa: 's' (sumar), 'r' (restar), 'm' (multiplicar), 'd' (dividir)");
                operacionValida = false;
                break;
        }

        scanner.close();
    }
}

