import java.util.Random;
import java.util.Scanner;

public class AdivinarAleatorio {


    public static void main(String[] args) {

        Random aleatorio = new Random();
        int nroAleatorio = aleatorio.nextInt(10);
        int nroIngresado=0;
        Scanner dato=new Scanner(System.in);
        String continuarIntentando="";
        System.out.println("Aleatorio " + nroAleatorio );

        do{
            System.out.println("Por favor ingrese un nro");
            nroIngresado= dato.nextInt();
            if(nroAleatorio==nroIngresado){
                System.out.println( "Acertó el nro es:" + nroAleatorio );
                break;
            }// cierra if
            System.out.println("¿Desea continuar intentando? SI/NO");
            continuarIntentando= dato.next();
        }while(continuarIntentando.toUpperCase().equals("SI"));




    }// cierra main

}//cierra clase
