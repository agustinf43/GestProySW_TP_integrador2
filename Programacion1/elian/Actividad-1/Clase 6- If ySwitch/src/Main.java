import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        //Ejercicio n1: comparar 3 variables y mostrar cual es mayor

        System.out.println("EJERCIO Nº1: -ingrese primer nro");
        int nro1;
        nro1 = dato.nextInt();

        System.out.println("ingrese segundo nro");
        int nro2;
        nro2 = dato.nextInt();

        System.out.println("ingrese tercer nro");
        int nro3;
        nro3 = dato.nextInt();

        if (nro1 > nro2 && nro1 > nro3) {
            System.out.println("El nro mayor de los anteriores es: " + nro1);
        } else {
            if (nro2 > nro1 && nro2 > nro3) {
                System.out.println("El nro mayor de los anteriores es: " + nro2);
            } else {
                System.out.println("El nro mayor de los anteriores es: " + nro3);

            }
        }



        /*Ejercicio n2:
         *ingresar monto de salario, compararlo con Salario Minimo Vital Movil ($202.800),
         * y mostrar un mensaje que muestre si es menor/mayor y mostrar a cuantos equivale
         *smvm equivale el ingresado*/

        System.out.println("EJERCICIO Nº2: -Ingrese monto de salario en pesos");
        int monSalario;
        monSalario = dato.nextInt();


        final int smvm = 202800;
        String resultado = (monSalario >= smvm) ? " MAYOR " : " MENOR ";

        System.out.println("El monto ingresado es " + resultado + " al " +
                "Salario Minimo Vital Movil ($202.800)");


        if (monSalario <= smvm) {
            System.out.println("El ingreso es menor o equivale a 1 smvm");
        } else {
            if (monSalario > smvm && monSalario < 608400) {
                System.out.println("El ingreso equivale a 3 smvm");
            } else {
                if (monSalario > smvm && monSalario < 811200) {
                    System.out.println("El ingreso equivale a 4 smvm");
                } else {
                    if (monSalario > smvm && monSalario < 1014000) {
                        System.out.println("El ingreso equivale a 5 smvm");
                    } else {
                        System.out.println("El ingreso es igual o supera 6 smvm");
                    }
                }



                /*Ejercicio n3:
                 *Mostrar nombre de un mes a partir de el ingreso de un nº
                 *que equivalga a dicho mes*/

                System.out.println("EJERCIO Nº3: -Ingrese nro de mes");
                byte mes;
                mes = dato.nextByte();

                switch (mes) {
                    case 1:
                        System.out.println("Enero");
                        break;
                    case 2:
                        System.out.println("Febrero");
                        break;
                    case 3:
                        System.out.println("Marzo");
                        break;
                    case 4:
                        System.out.println("Abril");
                        break;
                    case 5:
                        System.out.println("Mayo");
                        break;
                    case 6:
                        System.out.println("Junio");
                        break;
                    case 7:
                        System.out.println("Julio");
                        break;
                    case 8:
                        System.out.println("Agosto");
                        break;
                    case 9:
                        System.out.println("Septiembre");
                        break;
                    case 10:
                        System.out.println("Octubre");
                        break;
                    case 11:
                        System.out.println("Noviembre");
                        break;
                    case 12:
                        System.out.println("Diciembre");
                        break;

                    default:
                        System.out.println("valor inexistente");
                }


            }
        }
    }
}



