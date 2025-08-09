import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Prog7_1 {
    public static void main(String[] args) {

            int  NumIngresado=0;

            Random aleatorio =new Random();
            int numAleatorio=aleatorio.nextInt(10) + 1;
            Scanner dato=new Scanner (System.in);

    while (NumIngresado != numAleatorio ) {
        System.out.println("Adivine número del 1 al 10 ");
        NumIngresado = dato.nextInt();

        if (NumIngresado != numAleatorio) {
            System.out.println("Incorrecto, intente de nuevo");

        }
        }
         System.out.println("¡Has adivinado el número!");


    }
}