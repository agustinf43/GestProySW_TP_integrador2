package consultorio.entities;

public interface Archivo {
    String formatoXlS="XSL";
    String formatoTXT="TXT";

    public void guardar(String nmbreArchivo, String formato);

    public String abrir (String nombreArchivo, String formato);

    static String getFormatoXlS(){
        return formatoXlS;
    }
    default void FormatoTXT(){
        System.out.println("entro el metodo default formatotxt");
    }




}
