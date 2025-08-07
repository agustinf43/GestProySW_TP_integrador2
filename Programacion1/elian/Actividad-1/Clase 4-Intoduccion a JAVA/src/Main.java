import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String cadenaTexto = "Comienzo del ejercicio nº1(suma, resta, multiplicacion y division)";
        System.out.println(cadenaTexto);
        /*iniciar 2 variables que permitan realizar suma,resta, multiplicacion y division*/

        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese 1º numero");
        int nro1= dato.nextInt();

        System.out.println("Ingrese 2º numero");
        int nro2 = dato.nextInt();

        int suma = nro1 + nro2;
        int resta = nro1 - nro2;
        int multi = nro1 * nro2;

        double div  = (double) nro1 / nro2;


        System.out.println("El resultado de la suma es:" + suma );
        System.out.println("El resultado de la resta es:" + resta);
        System.out.println("El resultado de la multiplicacion es:" + multi );
        System.out.println("El resultado de la division es:" + div);

        /*corregir division (valor dado debe ir con coma y no 0)*/
        String cadenaDeTexto = "Comienzo del ejercicio nº2(promedio de 4 variables)";
        System.out.println(cadenaDeTexto);

        System.out.println("Ingrese 1º numero");
        int nroA= dato.nextInt();
        System.out.println("Ingrese 2º numero");
        int nroB= dato.nextInt();
        System.out.println("Ingrese 3º numero");
        int nroC= dato.nextInt();
        System.out.println("Ingrese 4º numero");
        int nroD= dato.nextInt();

        int sumaVariables = nroA + nroB + nroC + nroD ;
        int promedio= sumaVariables / 4;

        /*corregir promedio (valor debe ir con coma, no entero)*/

        System.out.println("El promedio de los nros ingresados es:" + promedio);


        }
    }
