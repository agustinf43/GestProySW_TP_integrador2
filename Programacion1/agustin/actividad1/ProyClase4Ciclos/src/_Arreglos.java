import java.util.Arrays;

public class _Arreglos {

    public static void main(String[] args) {
        /*arreglos o arrays unidimensionales*/
        /* 1 variable que almacena varios valores del tipo
         * la cantidad de valores es longitud del arreglo
         * Sintaxis:
         * tipo[] nombreVariable;
         * tipo nombreVariable[];
         * */


          //posiciones   0  1  2  3  4
        byte[] edades = {5, 22, 38, 12, 17};  // declaro el array y le asigno valores
        System.out.println(edades[1]);
        // para recuperar algun valor del array le debo indicar la posiciòn

        for(byte i=0; i<edades.length ;i++ )
        {
            System.out.println(edades[i]);
        }

        byte[] calificaciones;
        calificaciones= new byte[9];/*doy el tamaño al array con new */
        calificaciones[0]=6; // asigno valores a cada posición
        calificaciones[1]=7;
        calificaciones[2]=6;
        calificaciones[3]=7;
        calificaciones[4]=6;
        calificaciones[5]=7;
        calificaciones[6]=8;
        calificaciones[7]=9;
        calificaciones[8]=9;
        for (int i=0;i<calificaciones.length;i++){
            System.out.println("La calificacion " + i + " es " + calificaciones[i]);
        }


        byte[] numeros = {5, 22, 38, 88, 17, 100};  // declaro el array y le asigno valores

        Arrays.sort(numeros);
        for(byte i=0; i<numeros.length ;i++ )
        {
            System.out.println(numeros[i]);
        }


    }
}
