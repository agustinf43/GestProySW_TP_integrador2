package entities;

import java.util.Objects;

public class Alumno implements Comparable {
    private String nombre;
    private String apellido;
    private String dni;
    private int id;

    public Alumno(String nombre, String apellido, String dni, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id = id;
    }

    public Alumno() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(apellido, alumno.apellido) && Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        // return Objects.hash(nombre, apellido, dni);
        return 1;
    }

    @Override
    public int compareTo(Object o) {
        Alumno alumno = (Alumno) o;
        if (this.dni.equals(alumno.dni))
            return 0;
        if (this.dni.compareTo(alumno.dni) > 0) {
            return 1;
        } else if (this.dni.compareTo(alumno.dni) < 0) {
            return -1;
        }else{
            return 0;
        }

    }


}//cierra clase
