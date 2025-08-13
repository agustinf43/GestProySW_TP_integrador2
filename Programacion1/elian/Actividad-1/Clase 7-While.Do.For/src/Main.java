import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        /*1. Hacer un programa que genere un nro  aleatorio,
         *entre 1 y 10, y pida al usuario que adivine el nro, sin límite de intentos
         */
        Random datoNuevo = new Random(10 + 1);
        int nroAleatorio;
        nroAleatorio = datoNuevo.nextInt();
        System.out.println(nroAleatorio);

        String cargarNro = "SI";

        while (cargarNro.toUpperCase().equals("SI")) {
            System.out.println("ingrese el nro correcto (entre 1-10)");

            int nroElegido = dato.nextInt();

            if (nroAleatorio == nroElegido) {
                System.out.println("Acerto");
                break;
            }

            System.out.println("desea intentar adivinar de nuevo? SI/NO");
            cargarNro = dato.next();
        }


        /*2. Hacer un programa donde se ingrese usuario y contraseña. Si los
         *, intentos superan las 3 veces, mostrar mensaje que se a
         * bloqueado al usuario*/


        for (byte i = 0; i < 3; i++) {

            byte contador = 0;
            contador++;

            String usuario = "HolaMundo";
            String contraseña = "1234";

            System.out.println("Por favor, ingrese usuario");
            String usuaIng = dato.next();

            System.out.println("Por favor, ingrese contraseña");
            String contrIng = dato.next();

            if (usuario.equals(usuaIng) && contraseña.equals(contrIng)) {
                System.out.println("Datos ingresados correctos, puede iniciar sesion");
                break;}

            if (contador < i) {
                System.out.println("ERROR. Usuario bloqueado.");
                    break;}

        }
    }
}