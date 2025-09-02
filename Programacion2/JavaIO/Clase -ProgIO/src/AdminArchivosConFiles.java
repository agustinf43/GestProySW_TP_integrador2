import java.io.*;

public class AdminArchivosConFiles {

    //funcion para escribir archivos

    public static boolean EscribirArchivosConOut(String texto, String filename) {

        //  <   >

        //primero se crea el archivo con nombre
        File file = new File(filename);

        //luego se crear el escrito
        FileWriter fileWriter;
        try {
            //indico que se debe escribir en el file
            fileWriter = new FileWriter(file);

            //recorro el texto a escribir
            for (int i = 0; i < texto.length(); i++) {
                //se escribe el caracter
                fileWriter.write(texto.charAt(i));
            }

            //finalmente se cierra
            fileWriter.close();

        } catch (Exception e) {
            System.out.println("No se guardo");
            return false;
        }
        return true;
    }

    public static boolean LeerArchivosConFiles(String filename) {
        File file = new File(filename);
        FileReader fileReader;

        try {
            fileReader = new FileReader(file);

            int caracter;
            String texto="";
            while ((caracter = fileReader.read()) != -1) {
                texto +=(char) caracter;
            }

            System.out.println(texto);
            fileReader.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e.getCause());
            return false;
        }catch (IOException e) {
            System.out.println("No se pudo leer el archivo");
            return false;
        }



    }


}//cierra clase
