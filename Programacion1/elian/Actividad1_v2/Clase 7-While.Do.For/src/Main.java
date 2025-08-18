import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        /*1. Hacer un programa que genere un nro  aleatorio,
         *entre 1 y 10, y pida al usuario que adivine el nro, sin límite de intentos
         */
      
Random random = new Random();
int nroAleatorio = random.nextInt(10) + 1;  // Genera un número entre 1 y 10
System.out.println("Número aleatorio generado (para prueba): " + nroAleatorio);

String respuesta;
do {
    System.out.println("Ingrese el número correcto (entre 1-10):");
    int nroElegido = dato.nextInt();

    if (nroElegido == nroAleatorio) {
        System.out.println("¡Acertaste!");
        break;
    }

    System.out.println("¿Desea intentar de nuevo? (SI/NO)");
    respuesta = dato.next().toUpperCase();
} while (respuesta.equals("SI"));


        /*2. Hacer un programa donde se ingrese usuario y contraseña. Si los
         *, intentos superan las 3 veces, mostrar mensaje que se a
         * bloqueado al usuario*/

String usuarioCorrecto = "HolaMundo";
String contraseñaCorrecta = "1234";
int intentos = 0;
final int MAX_INTENTOS = 3;

while (intentos < MAX_INTENTOS) {
    System.out.println("Por favor, ingrese usuario:");
    String usuarioIng = dato.next();
    
    System.out.println("Por favor, ingrese contraseña:");
    String contraseñaIng = dato.next();
    
    if (usuarioCorrecto.equals(usuarioIng) && contraseñaCorrecta.equals(contraseñaIng)) {
        System.out.println("Datos correctos. ¡Bienvenido!");
        break;
    } else {
        intentos++;
        System.out.println("Credenciales incorrectas. Intentos restantes: " + (MAX_INTENTOS - intentos));
    }
}

if (intentos == MAX_INTENTOS) {
    System.out.println("ERROR: Usuario bloqueado. Ha superado el límite de intentos.");
}
        
        
    }
}