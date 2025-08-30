package consultorio.entities;

import java.util.logging.Logger;

public class Paciente extends Persona implements Archivo {

    public static final Logger LOGGER =
            Logger.getLogger(Paciente.class.getName());


    //atributos de clase
    private int nroPaciente;
    private final String OBRASOCIAL = "OSDE";
    static int contador;


    static {
//            System.out.println("entro al bloque static");
        contador = 0;
    }

    //constructor sin parametros
    public Paciente() {
        // System.out.println("entro al constructor sin parametros");
        super();
        contador++;
        nroPaciente = contador;
    }

    public static int getContador() {
        return contador;
    }

    // contructor con parametros
    public Paciente(int nroPaciente, String nombre, String telefono) {
        super(nombre, telefono);
        this.nroPaciente = nroPaciente;

    }

    // metodos de clase

    // get retornan tipo del atributo no recibe parametro
    public int getNroPaciente() {
        return nroPaciente;
    }

    // set retornan void reciben un parametro
    public String getOBRASOCIAL() {
        return OBRASOCIAL;
    }


    public void mostrarDatos() {
        //info
        //warning
        //severe
        LOGGER.info("Mostrando datos del paciente"
                + " Nombre: " + super.getNombre()
                + " Telefono: " + super.getTelefono()
                + " Nro Paciente: " + this.nroPaciente
                + " Obra Social: " + this.OBRASOCIAL
                + " Cantidad: " + contador);

    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nroPaciente=" + nroPaciente +
                ", nombre='" + super.getNombre() + '\'' +
                ", telefono='" + super.getTelefono() + '\'' +
                ", OBRASOCIAL='" + OBRASOCIAL + '\'' +
                '}';
    }


    @Override
    public void guardar(String nmbreArchivo, String formato) {

    }

    @Override
    public String abrir(String nombreArchivo, String formato) {
        return "";
    }


}//cierra clase

