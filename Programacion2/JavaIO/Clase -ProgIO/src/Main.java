import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        String texto = "Este es un texto de prueba\n" + "esta es la segunda linea\n" + "esta es la tercera y ultima linea";
        String fileName = "miArchivo.txt";

        //funcion que escribe
        //AdminArchivosConFiles.EscribirArchivosConFiles(texto, fileName);

        //funcion que lee
        //AdminArchivosConFiles.LeerArchivosConFiles(fileName);

        // AdminArchivosConStream.EscribirArchivosConFiles(texto, fileName);

        //AdminArchivosConStream.LeerArchivosConStream(fileName);

        //AbrirArchivoConBufferFiles.EscribirArchivo(texto,fileName);

        //AbrirArchivoConBufferFiles.leerArchivo(fileName);
        System.out.println("---------------SE CREA ARCHIVO .TXT Y SE LO LEE");
        AdminArchivosConBufferedStream.EscribirArchivo(texto, fileName);

        AdminArchivosConBufferedStream.LeerArchivo(fileName);

        System.out.println("---------------SE CREA CARPETA NUEVA");
        System.out.println("crear nueva carpeta `PRUEBA` ");
        AdminArchivosConJavaNIO.CrearCarpeta("prueba");

        System.out.println("---------------PREGUNTA SI ARCHIVO .TXT EXISTE");
        System.out.println("existe el archivo "+fileName + "?");
        System.out.println(AdminArchivosConJavaNIO.ExisteArchivo(fileName));

        System.out.println("---------------SE MUEVE ARCHIVO .TXT DENTRO DE CARPETA CREADA");
        AdminArchivosConJavaNIO.MoverArchivo("miArchivo.txt",
                Paths.get("prueba").toAbsolutePath().toString()+"\\miArchivo.txt");

        System.out.println("---------------SE BORRA  ARCHIVO .TXT");
        AdminArchivosConJavaNIO.BorrarArchivo(Paths.get("prueba").toAbsolutePath().toString()+"\\miArchivo.txt");

        System.out.println("---------------PREGUNTA DE NUEVO SI ARCHIVO .TXT EXISTE");
        System.out.println("existe el archivo: "+fileName);
        System.out.println(AdminArchivosConJavaNIO.ExisteArchivo(fileName));

    }//cierra main

}//cierra clase