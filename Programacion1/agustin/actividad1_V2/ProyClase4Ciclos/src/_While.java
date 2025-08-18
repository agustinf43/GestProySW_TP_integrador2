import java.util.Scanner;

public class _While {
    public static void main(String[] args) {

        // while de repeticion
        // es estructura indeterminada, repite hasta que la condicion sea FALSA
        // NO   sabemos de antemano cuantas iteraciones realizara
        // sintaxis: while(condicion){ sentencias o instrucciones;
        // } cierra while

        // cargar asistentes a clase
        Scanner dato = new Scanner(System.in);
        byte cantidadAsistentes = 0;
        String quiereCargarAsistentes = "Si";
        //Metodos de String
        // equals -> compara si es igual a otro texto y devuelve V o F
        // toUpperCase -> convierte el texto  a Mayusculas
        // toLower Case -> convierte el texto  a Minusculas
        // formatear teclas: Ctrol + Alt +L
        while (quiereCargarAsistentes.toUpperCase().equals("SI")) {
            System.out.println("Por favor  ingrese el nombre del asistente:");
            String nombre; // creo la viariable
            nombre = dato.next(); // le estoy asignando un dato
            cantidadAsistentes++; // operador unario que suma uno
            System.out.println("El asistente es:" + nombre);

            // para  que en algun momento quiereCargar sea falso
            System.out.println("¿Quiere cargar otro Asistente (SI/NO)?");
            quiereCargarAsistentes = dato.next();
        }// cierra while
        System.out.println("La cantidad de asistentes ingresados son:" + cantidadAsistentes);
    }// cierra metodo main
}// cierra clase Main