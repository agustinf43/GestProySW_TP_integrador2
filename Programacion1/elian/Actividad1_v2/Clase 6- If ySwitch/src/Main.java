import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        // Ejercicio n1: comparar 3 variables y mostrar cual es mayor
        System.out.println("EJERCICIO Nº1: -ingrese primer nro");
        int nro1 = dato.nextInt();

        System.out.println("ingrese segundo nro");
        int nro2 = dato.nextInt();

        System.out.println("ingrese tercer nro");
        int nro3 = dato.nextInt();

        int mayor = Math.max(nro1, Math.max(nro2, nro3));
        System.out.println("El nro mayor de los anteriores es: " + mayor);

        /*
         * Ejercicio n2:
         * ingresar monto de salario, compararlo con Salario Minimo Vital Movil
         * ($202.800),
         * y mostrar un mensaje que muestre si es menor/mayor y mostrar a cuantos
         * equivale
         * smvm equivale el ingresado
         */

        System.out.println("EJERCICIO Nº2: -Ingrese monto de salario en pesos");
        int monSalario = dato.nextInt();

        final int smvm = 202800;
        String resultado = (monSalario >= smvm) ? "MAYOR" : "MENOR";
        System.out.println("El monto ingresado es " + resultado + " al Salario Minimo Vital Movil ($202.800)");

        int cantidadSMVM = monSalario / smvm;

        switch (cantidadSMVM) {
            case 0:
                System.out.println("El ingreso es menor o equivale a 1 smvm");
                break;
            case 1:
            case 2:
                System.out.println("El ingreso equivale a " + cantidadSMVM + " smvm");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("El ingreso equivale a " + cantidadSMVM + " smvm");
                break;
            default:
                System.out.println("El ingreso es igual o supera 6 smvm");
                break;
        }

        /*
         * Ejercicio n3: *Mostrar nombre de un mes a partir de el ingreso de un nº que
         * equivalga a dicho mes
         */

        System.out.println("EJERCIO Nº3: -Ingrese nro de mes");
        byte mes = dato.nextByte();

        if (mes == 1)
            System.out.println("Enero");
        else if (mes == 2)
            System.out.println("Febrero");
        else if (mes == 3)
            System.out.println("Marzo");
        else if (mes == 4)
            System.out.println("Abril");
        else if (mes == 5)
            System.out.println("Mayo");
        else if (mes == 6)
            System.out.println("Junio");
        else if (mes == 7)
            System.out.println("Julio");
        else if (mes == 8)
            System.out.println("Agosto");
        else if (mes == 9)
            System.out.println("Septiembre");
        else if (mes == 10)
            System.out.println("Octubre");
        else if (mes == 11)
            System.out.println("Noviembre");
        else if (mes == 12)
            System.out.println("Diciembre");
        else
            System.out.println("Valor inexistente");

    }
}
