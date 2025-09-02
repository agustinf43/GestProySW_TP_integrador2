import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class AdminArchivosConStream {

    public static boolean EscribirArchivosConFiles(String texto, String filename) {

        //convierto a bytes
        byte[] bytes = texto.getBytes();

        //se crea la variable
        OutputStream out;

        try {
            //instancio pasando el nombre del archivo
            out = new FileOutputStream(filename);

            //escribo los bytes
            out.write(bytes);

            out.close();
            return true;

        } catch (Exception e) {
            System.out.println("error");
            return false;
        }

    }

    public static boolean LeerArchivosConStream(String filename) {
        FileInputStream in;

        try {
            in = new FileInputStream(filename);
            int byteLeido;
            String texto = "";

            while ((byteLeido = in.read()) != -1) {
                texto += (char) byteLeido;
            }
            System.out.println(texto);
            in.close();
            return true;

        } catch (Exception e) {
            System.out.println("error");
            return false;
        }
    }

    }//cierra clase
