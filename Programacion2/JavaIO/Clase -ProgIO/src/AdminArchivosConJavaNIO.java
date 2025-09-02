import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class AdminArchivosConJavaNIO {

    public static boolean CrearCarpeta(String name) {
        Path path = Paths.get(name);

        try {
            if (!Files.exists(path)) {
                Path carpeta = Files.createDirectory(path);
            } else {
                System.out.println("Ya existe carpeta");
            }

            return true;
        } catch (Exception e) {
            System.out.println("no pudo crear la carpeta");
            return false;
        }
    }

    public static boolean ExisteArchivo(String fileName) {
        //accede al archivo indicado
        Path path = Paths.get(fileName);
        //verifica que existe y devuelve ruta de localizacion
        return Files.exists(path);
    }

    public static boolean MoverArchivo(String origen, String destino) {
        Path pathOrigen = Paths.get(origen);
        Path pathDestino = Paths.get(destino);

        try{
            Files.move(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);
            return true;
        }catch (Exception e){
            return  false;
        }

    }
    public static boolean CopiarArchivo(String origen, String destino) {
        Path pathOrigen = Paths.get(origen);
        Path pathDestino = Paths.get(destino);

        try{
            Files.copy(pathOrigen, pathDestino, StandardCopyOption.REPLACE_EXISTING);
            return true;
        }catch (Exception e){
            return  false;
        }
    }

    public static boolean BorrarArchivo(String fileName){
        Path path= Paths.get(fileName);

        try{

            return Files.deleteIfExists(path);
        }catch (Exception e){
            return false;
        }
    }









}//cierra clase
