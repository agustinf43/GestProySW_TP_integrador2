package consultorio.entities;

import java.util.logging.Logger;

public abstract class Persona {

    public static final Logger LOGGER =
            Logger.getLogger(Persona.class.getName());

    private String nombre;
    private String telefono;

    
    public Persona(){
        nombre="";
        telefono="";
    }
    public Persona(String nombre, String telefono){
        this.nombre=nombre;
        this.telefono=telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //
    public abstract void mostrarDatos();


}//cierra clase
