import java.io.*;

public class AbrirArchivoConBufferFiles {

    public static boolean EscribirArchivo(String texto, String filename) {


        //1. se crea el archivo con nombre
        File file = new File(filename);

        //2. se crear el escrito
        FileWriter fileWriter;

        //3. crear Buffer
        BufferedWriter bWritter;

        try {
            //filewritter se crea a partir de file
            fileWriter = new FileWriter(file);

            //buffer se crea a partir
            bWritter = new BufferedWriter(fileWriter);

            //paso: escribe el texto/contenido/archivo
            bWritter.write(texto);
            //
            bWritter.newLine();
            bWritter.write("otra linea de texto");

            //paso: cierra todas las variables buffer
            bWritter.close();
            fileWriter.close();

            return true;

        } catch (Exception e) {
            System.out.println("no se pudo abrir con Buffer");
            return false;
        }

    }

    public static boolean leerArchivo(String fileName) {

        File file = new File(fileName);

        FileReader fReader;

        BufferedReader bReader;

        try {
            fReader = new FileReader(fileName);
            bReader = new BufferedReader(fReader);

            boolean eof = false;

            if (bReader.ready()) {
                while (!eof) {
                    String linea = bReader.readLine();

                    if(linea!=null)
                        System.out.println(linea);
                    else
                        eof=true;

                }
            }
            return true;

        }catch (FileNotFoundException e) {
            System.out.println("no se pudo abrir el archivo "+e.getMessage()+e.getCause());

            return false;
        }
        catch (IOException e) {
            System.out.println("no se pudo abrir el archivo "+e.getMessage()+e.getCause());
            return false;
        } catch (Exception e) {
            System.out.println("error de lectura "+e.getMessage()+e.getCause());
            return false;
        }finally {
            System.out.println("TERMINO LA FUNCION DE LEER ");
        }

    }


}//cierra clase
