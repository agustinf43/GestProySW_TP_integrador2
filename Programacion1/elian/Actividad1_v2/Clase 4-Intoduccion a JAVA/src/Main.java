import java.util.Scanner;


public class Main {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        // 1. Declarar e iniciar 2 variables que permitan realizar y mostrar, en consola, 
        //las operaciones básicas matemáticas (suma, resta, división y multiplicación)...

        System.out.println("Ingrese 1º numero");
        int nro1 = dato.nextInt();

        System.out.println("Ingrese 2º numero");
        int nro2 = dato.nextInt();

        System.out.println("El resultado de la suma es: " + sumar(nro1, nro2));
        System.out.println("El resultado de la resta es: " + restar(nro1, nro2));
        System.out.println("El resultado de la multiplicacion es: " + multiplicar(nro1, nro2));
        System.out.println("El resultado de la division es: " + dividir(nro1, nro2));

        // ...2. Declarar e iniciar 4 variables e indicar el  promedio de las 4....
        String cadenaDeTexto = "Comienzo del ejercicio nº2(promedio de 4 variables)";
        System.out.println(cadenaDeTexto);

        int[] numeros = new int[4];
        int sumaVariables = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese " + (i + 1) + "º numero");
            numeros[i] = dato.nextInt();
            sumaVariables += numeros[i];
        }

        double promedio = (double) sumaVariables / 4;

        System.out.println("El promedio de los nros ingresados es: " + promedio);

    }
}
