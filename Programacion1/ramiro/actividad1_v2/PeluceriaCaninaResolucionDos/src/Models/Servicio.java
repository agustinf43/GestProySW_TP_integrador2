package Models;

import Enumeraciones.TipoServicio;

public class Servicio {
  private static int contadorId = 1;
  private int id;
  private TipoServicio tipo;
  private String descripcion;
  private int duracionMin;
  private double precio;

  public Servicio(TipoServicio tipo, String descripcion, int duracionMin, double precio) {
    this.id = contadorId++;
    this.tipo = tipo;
    this.descripcion = descripcion;
    this.duracionMin = duracionMin;
    this.precio = precio;
  }

  public int getId() { return id; }
  public TipoServicio getTipo() { return tipo; }
  public void setTipo(TipoServicio tipo) { this.tipo = tipo; }
  public String getDescripcion() { return descripcion; }
  public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
  public int getDuracionMin() { return duracionMin; }
  public void setDuracionMin(int duracionMin) { this.duracionMin = duracionMin; }
  public double getPrecio() { return precio; }
  public void setPrecio(double precio) { this.precio = precio; }

  @Override
  public String toString() {
    return "Servicio{" +
        "id=" + id +
        ", tipo=" + tipo +
        ", descripcion='" + descripcion + '\'' +
        ", duracionMin=" + duracionMin +
        ", precio=" + precio +
        '}';
  }

  public void mostrarDatos() {
    System.out.println(this.toString());
  }
}

// ===== CLASE TURNO =====
public class Turno {
  private static int contadorId = 1;
  private int id;
  private String fechaHora;
  private EstadoTurno estado;
  private Mascota mascota;
  private Servicio servicio;

  public Turno(String fechaHora, EstadoTurno estado, Mascota mascota, Servicio servicio) {
    this.id = contadorId++;
    this.fechaHora = fechaHora;
    this.estado = estado;
    this.mascota = mascota;
    this.servicio = servicio;
  }

  public int getId() { return id; }
  public String getFechaHora() { return fechaHora; }
  public void setFechaHora(String fechaHora) { this.fechaHora = fechaHora; }
  public EstadoTurno getEstado() { return estado; }
  public void setEstado(EstadoTurno estado) { this.estado = estado; }
  public Mascota getMascota() { return mascota; }
  public void setMascota(Mascota mascota) { this.mascota = mascota; }
  public Servicio getServicio() { return servicio; }
  public void setServicio(Servicio servicio) { this.servicio = servicio; }

  @Override
  public String toString() {
    return "Turno{" +
        "id=" + id +
        ", fechaHora='" + fechaHora + '\'' +
        ", estado=" + estado +
        ", mascota=" + mascota.getNombre() +
        ", servicio=" + servicio.getTipo() +
        '}';
  }

  public void mostrarDatos() {
    System.out.println(this.toString());
  }
}
