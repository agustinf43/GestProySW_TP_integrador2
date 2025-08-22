import java.util.Scanner;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ej1 {

    public static final Logger Log=
            Logger.getLogger(ej1.class.getName());

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num;
        num =(int)(Math.random()*10+1);

        int numero = 0;
        while(num!=numero){
            System.out.println("Adivine el número del 1 al 10:");
            numero=sc.nextInt();
            if (numero==num){
                Log.info("Número acertado");
            }
        }
      }
    }
