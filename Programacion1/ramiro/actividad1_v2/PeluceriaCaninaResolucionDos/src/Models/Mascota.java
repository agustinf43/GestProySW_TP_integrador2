package Models;

import Enumeraciones.Especie;

public class Mascota {
  class Mascota {
    private static int contadorId = 1;
    private int id;
    private String nombre;
    private Especie especie;
    private String raza;
    private int edad;
    private String nombreDueno;

    public Mascota(String nombre, Especie especie, String raza, int edad, String nombreDueno) {
      this.id = contadorId++;
      this.nombre = nombre;
      this.especie = especie;
      this.raza = raza;
      this.edad = edad;
      this.nombreDueno = nombreDueno;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Especie getEspecie() { return especie; }
    public void setEspecie(Especie especie) { this.especie = especie; }
    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getNombreDueno() { return nombreDueno; }
    public void setNombreDueno(String nombreDueno) { this.nombreDueno = nombreDueno; }

    @Override
    public String toString() {
      return "Mascota{" +
          "id=" + id +
          ", nombre='" + nombre + '\'' +
          ", especie=" + especie +
          ", raza='" + raza + '\'' +
          ", edad=" + edad +
          ", nombreDueno='" + nombreDueno + '\'' +
          '}';
    }

    public void mostrarDatos() {
      System.out.println(this.toString());
    }
  }
