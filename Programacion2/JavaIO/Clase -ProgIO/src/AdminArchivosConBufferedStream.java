import java.io.*;

public class AdminArchivosConBufferedStream {

    public static boolean EscribirArchivo(String texto, String fileName){

        byte[] bytes = texto.getBytes();

        FileOutputStream fOut;

        BufferedOutputStream bOut;

        try {
            //crea el stream a partir del nombre
           fOut = new FileOutputStream(fileName);
           //crea el buffer a partir a partir de fileOutStream
           bOut = new BufferedOutputStream(fOut);

           //le paso los bytes a escribir
           bOut.write(bytes);

           //se cierran variables usadas
           bOut.close();
           fOut.close();

            return true;

        } catch (IOException e) {
            System.out.println("no se pudo abrir");
            return false;
        }

    }
    public static boolean LeerArchivo (String fileName){
        FileInputStream fIn;
        BufferedInputStream bIn;

        try {
            fIn = new FileInputStream(fileName);
            bIn = new BufferedInputStream(fIn);

            int byteLeido;
            String texto="";

            while ((byteLeido=bIn.read()) != -1) {
                texto+= (char) byteLeido;
            }

            System.out.println(texto);
            bIn.close();
            fIn.close();

            return true;

        }catch (Exception e){
            System.out.println("error leyendo el archivo");
            return false;
        }


    }





}//cierra clase
