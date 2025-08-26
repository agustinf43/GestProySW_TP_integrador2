import java.util.Random;
import java.util.Scanner;

public class _For {
    //psvm
    public static void main(String[] args) {
        /* For se usa para iterar cuando conocemos de antemano cuantas
        * veces debemos repetir las instrucciones
        * Sintaxis: for(inicio;condicion;incremento){ sentencias;..}
        * */
        byte tabla;
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese el numero para el cual mostrar la tabla:");
        tabla=dato.nextByte();
        //for (creo variable con la que iterar;
        //     condición siempre debe devolver V o F )
        int resultado=0;
        for(byte i=0; i<=10 ; i++)
        {
            resultado=tabla * i;
            System.out.println(tabla +  " x " + i + " = " + resultado);
        }//cierra for

        Random aleatorio= new Random();
        int nro= aleatorio.nextInt(10);

        System.out.println("Armando una tabla  de 6 x 5 ");
        System.out.println("----------------------------");
        String msgFila;
        for(byte fila=0;fila< 6 ; fila++ ){
            msgFila="";
            for(byte col=0; col<5 ; col++){
                msgFila= msgFila + " " + fila + ""+ col;
            }
            System.out.println(msgFila);
        }




    }//cierra main
}//cierra clase _For
