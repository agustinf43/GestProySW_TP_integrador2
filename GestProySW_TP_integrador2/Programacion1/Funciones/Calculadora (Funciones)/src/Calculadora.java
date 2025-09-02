import java.util.Scanner;


import java.util.Scanner;

    public class Calculadora {
      public static void main(String[] args) {

        // Pedimos dos números al usuario
        int nro1 = ingresarNumero();
        int nro2 = ingresarNumero();

        // Pedimos qué operación matemática quiere realizar
        String operacion = SeleccionarOperacion();

        // Ejecutamos la operación seleccionada
        operar(nro1, nro2, operacion);
      }

      // Función que pide un número al usuario y lo devuelve
      public static int ingresarNumero() {
        Scanner dato = new Scanner(System.in); // Objeto Scanner para leer desde consola
        System.out.println("Por favor ingrese un número");
        int nro = dato.nextInt(); // Guardamos el número que escribe el usuario
        return nro; // Devolvemos el número
      }

      // Función que muestra el menú de operaciones y devuelve la opción elegida
      public static String SeleccionarOperacion() {
        Scanner dato = new Scanner(System.in);
        System.out.println("Seleccione una operación");
        System.out.println("+" + " suma");
        System.out.println("-" + " resta");
        System.out.println("*" + " multiplicación");
        System.out.println("/" + " división");
        String operacion = dato.next(); // Guardamos el símbolo de la operación
        return operacion; // Lo devolvemos
      }

      // Función para sumar dos números
      public static int Sumar(int nro1, int nro2) {
        return nro1 + nro2;
      }

      // Función para restar dos números
      public static int Restar(int nro1, int nro2) {
        return nro1 - nro2;
      }

      // Función para multiplicar dos números
      public static int Multiplicar(int nro1, int nro2) {
        return nro1 * nro2;
      }

      // Función para dividir dos números
      public static double Dividir(int nro1, int nro2) {
        if (nro2 != 0) {
          // Importante: en Java, dividir dos enteros da un entero.
          // Ejemplo: 5 / 2 = 2. Para obtener decimales hay que convertir a double.
          return (double) nro1 / nro2;
        } else {
          // No se puede dividir por cero
          System.out.println("Error: división por cero");
          return 0;
        }
      }

      // Función que recibe los dos números y la operación, y ejecuta el cálculo correcto
      public static void operar(int nro1, int nro2, String operacion) {
        double resultado = 0; // variable para guardar el resultado
        String queOperacion;  // texto que indica qué operación hicimos

        // Estructura switch para decidir qué operación ejecutar
        switch (operacion) {
          case "+":
            resultado = Sumar(nro1, nro2);
            queOperacion = "suma";
            break;
          case "-":
            resultado = Restar(nro1, nro2);
            queOperacion = "resta";
            break;
          case "*":
            resultado = Multiplicar(nro1, nro2);
            queOperacion = "multiplicación";
            break;
          case "/":
            resultado = Dividir(nro1, nro2);
            queOperacion = "división";
            break;
          default:
            queOperacion = "Selección incorrecta";
        }

        // Mostramos el resultado de la operación al usuario
        System.out.println("La operación " + queOperacion + " entre " + nro1 + " y " + nro2 + " dio como resultado " + resultado);
      }
    }



