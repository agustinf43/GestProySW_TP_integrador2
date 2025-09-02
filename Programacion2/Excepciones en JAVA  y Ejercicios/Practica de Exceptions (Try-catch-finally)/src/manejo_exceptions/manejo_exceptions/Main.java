package manejo_exceptions;

import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Integer i = 100;
        Integer j = null;
        //dentro de TRY hay instrucciones suceptibles a error
        try {
            System.out.println("La division es = " + i / j);
        }
        //CATCH atrapa ese error y lo maneja
        catch (ArithmeticException e) {
            System.out.println("Ocurrio un error " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No puede ser null = " + e.getCause());
        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }
        //FINALLY se ejecuta al final del metodo, halla error o no, y es opcional
        finally {
            System.out.println("Llego a finally si o si");
        }

        try {
            cargarArchivo("pest.txt");
        } catch (FileNotFoundException e) {
            System.out.println("error");;
        }

        cargarArchivo("otroArchivo.txt");

        try {
            buscarCliente(1);
        } catch (ClienteNotFoundException e) {
            throw new RuntimeException(e);
        }


    }//ciera main

    public static void cargarArchivo(String nomArchivo) throws FileNotFoundException {
        System.out.println("abro un archivo " + nomArchivo);
    }

    public static void buscarCliente(int id) throws ClienteNotFoundException{
        if(id==1){
            System.out.println("Cliente encontrado");
        }else{
            throw new ClienteNotFoundException();
        }
    }

}//cierra clase