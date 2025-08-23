package consultorio.entities;

import java.time.LocalDate;
import java.time.LocalTime;


public class Turno {

        private int id;
        private LocalDate dia;
        private LocalTime hora;
        private Paciente paciente;
        //private Consultorio consultorio;
        private static int contador;

        static {
            contador = 0;
        }

        public Turno() {
            contador++;
            id = contador;
            dia = LocalDate.now();  ///metodo es de clase cuando es static y uso el nombre de la clase para llamarlo
            hora = LocalTime.now();
            paciente = new Paciente();
        }
         public Turno( LocalDate dia, LocalTime hora, Paciente paciente) {
             contador++;
             this.id = contador;
             this.dia = dia;
             this.hora = hora;
             this.paciente = paciente;
         }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "id=" + id +
                ", dia=" + dia +
                ", hora=" + hora +
                ", paciente=" + paciente +
                '}';
    }
}
