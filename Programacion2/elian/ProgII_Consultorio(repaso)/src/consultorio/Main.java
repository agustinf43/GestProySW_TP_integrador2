package consultorio;

import consultorio.entities.Consultorio;
import consultorio.entities.Paciente;
import consultorio.entities.Persona;
import consultorio.entities.Turno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.logging.Logger;

public class Main {

    public static final Logger LOGGER =
            Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {

        //creacion de un objeto de la clase Paciente
        Paciente paciente1 = new Paciente();
        paciente1.setNombre("Maria");
        paciente1.setTelefono("3482555555");

        Paciente paciente2 = new Paciente();
        paciente2.setNombre("Jose");
        paciente2.setTelefono("3482666666");

        paciente1.mostrarDatos();
        paciente2.mostrarDatos();
        System.out.println(Paciente.getContador());


        Turno turno1 = new Turno();
        turno1.setPaciente(paciente1);
        LOGGER.info(turno1.toString());

        Persona persona1;
        persona1 = new Paciente(1, "Jose", "345457");
        //persona1.mostrarDatos();

        Persona personaMedico;
        personaMedico = new Medico(6541, "Luis Nose", "34235235");
        personaMedico.mostrarDatos();

        if (persona1 instanceof Medico) {
            System.out.println("es un Medico");
        } else {
            System.out.println("es un paciente");
        }

        double nroGrande = 353456476;
        int nroEntero = 0;
        nroEntero =(int)nroGrande;



                Consultorio consultorio = new Consultorio("Casali ");
        consultorio.agregarTurno(LocalDate.now(), LocalTime.now(), paciente1);
        consultorio.agregarTurno(LocalDate.now(), LocalTime.now(), paciente2);
        LOGGER.info(consultorio.toString());

        paciente1.guardar("miarchivo", "txt");


    }//cierra main
}
