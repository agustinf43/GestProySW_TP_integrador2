import java.util.Scanner;

public class _DoWhile {

    // atajo para crear main es: psvm
    public static void main(String[] args) {


        /* DO WHILE : ejecuta las sentencias al menos una vez y luego evalua
        * la condicion para  decidir si repite o no
        * Sintaxis: do{ sentencias;} while(condicion);
        */

        String deseaCargarAsistentes="";
        String nombre;
        byte cantidadDeAsistentes=0;
        Scanner dato = new Scanner(System.in);

        do{
            System.out.println("Por favor ingrese el nombre del asistente");
            nombre=dato.nextLine();
            System.out.println("El nombre ingresado es: " + nombre);
            cantidadDeAsistentes++;
            System.out.println("¿Desea cargar otro asistente? (SI/NO)");
            deseaCargarAsistentes=dato.next();
        }while(deseaCargarAsistentes.trim().toUpperCase().equals("SI"));
        //trim metodo de String que recorta los
        // espacios en blanco de ambos extremos del texto
        System.out.println("La cantidad de asistentes es:" + cantidadDeAsistentes);

    }// cierra el metodo main
}// cierra clase _doWhile
