package consultorio.entities;

public class Medico extends Persona implements Archivo {

    public static final Logger LOGGER =
            Logger.getLogger(Paciente.class.getName());


    //atributos de clase
    private int nroMatricula;
    private final String OBRASOCIAL = "OSDE";
    static int contador;


    static {
//            System.out.println("entro al bloque static");
        contador = 0;
    }

    //constructor sin parametros
    public Medico() {
        // System.out.println("entro al constructor sin parametros");
        super();
        contador++;
        nroMatricula = contador;
    }

    public static int getContador() {
        return contador;
    }

    // contructor con parametros
    public Medico(int nroMatricula, String nombre, String telefono) {
        super(nombre, telefono);
        this.nroMatricula = nroMatricula;

    }

    // metodos de clase

    // get retornan tipo del atributo no recibe parametro
    public int getNroMatricula() {
        return nroMatricula;
    }

    // set retornan void reciben un parametro
    public String getOBRASOCIAL() {
        return OBRASOCIAL;
    }


    public void mostrarDatos() {
        //info
        //warning
        //severe
        LOGGER.info("Mostrando datos del medico"
                + " Nombre: " + super.getNombre()
                + " Telefono: " + super.getTelefono()
                + " Nro Paciente: " + this.nroMatricula
                + " Obra Social: " + this.OBRASOCIAL
                + " Cantidad: " + contador);

    }

    @Override
    public String toString() {
        return "Medico{" +
                "nroMatricula=" + nroMatricula +
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

}
