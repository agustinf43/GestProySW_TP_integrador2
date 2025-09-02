package consultorio.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Consultorio {

    private int id;
    private static int contador;
    String medico;
    List<Turno> listaTurnos=new ArrayList<>();

    static {
        contador = 0;
    }

    public Consultorio(){
        contador++;
        id = contador;
        medico= "";
        List<Turno> listaTurnos = new ArrayList<Turno>();
    }

    public Consultorio(String medico){
        contador++;
        id = contador;
        this.medico= medico;
        List<Turno> listaTurnos = new ArrayList<Turno>();
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void agregarTurno(LocalDate dia, LocalTime hora, Paciente paciente){
        Turno turno=new Turno(dia, hora, paciente);
        listaTurnos.add(turno);
    }

    @Override
    public String toString() {

        String misturnos="";
        for (int i=0;i<listaTurnos.size() -1;i++){
            misturnos+= listaTurnos.get(i).toString();
        }

        for (Turno unturno:listaTurnos){
            misturnos+=unturno.toString();
        }

        return "Consultorio{" +
                "id=" + id +
                ", medico='" + medico + '\'' +
                ", listaTurnos=" + misturnos +
                '}';
    }
}
