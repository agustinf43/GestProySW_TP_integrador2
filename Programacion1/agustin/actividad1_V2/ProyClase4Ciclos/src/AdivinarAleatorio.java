import java.util.Random;
import java.util.Scanner;

public class AdivinarAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = generarNumeroSecreto(10);

        System.out.println("Bienvenido al juego de adivinanza!");
        // System.out.println("DEBUG -> El número secreto es: " + numeroSecreto); // Solo para pruebas

        while (true) {
            System.out.print("Ingrese un número entre 0 y 9: ");
            int numeroIngresado = scanner.nextInt();

            if (numeroIngresado == numeroSecreto) {
                System.out.println("¡Acertaste! El número era " + numeroSecreto);
                break;
            } else {
                System.out.print("Número incorrecto. ¿Quieres seguir intentando? (SI/NO): ");
                String respuesta = scanner.next();

                if (respuesta.equalsIgnoreCase("NO")) {
                    System.out.println("Juego terminado. El número era " + numeroSecreto);
                    break;
                }
            }
        }

        scanner.close();
    }

    // Método para generar número aleatorio en rango [0, limite)
    private static int generarNumeroSecreto(int limite) {
        Random random = new Random();
        return random.nextInt(limite);
    }
}
