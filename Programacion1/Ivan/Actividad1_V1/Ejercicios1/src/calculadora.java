import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        int numero1, numero2, opcion;
        System.out.println("ingrese numero 1:");
        numero1=calculadora.nextInt();
        System.out.println("ingrese numero 2:");

        numero2=calculadora.nextInt();

        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("ingresar opcion");
        opcion = calculadora.nextInt();

        switch (opcion){
            case 1:
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                System.out.println(numero1 / numero2);
                break;
        }


    }
}
