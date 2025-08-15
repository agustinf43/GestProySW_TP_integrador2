import Enumeraciones.Especie;
import Enumeraciones.EstadoTurno;
import Enumeraciones.TipoServicio;
import Models.Mascota;
import Models.Servicio;
import Models.Turno;

public class Main {
  public static void main(String[] args) {

    public static void main(String[] args) {
      // Crear Mascotas
      Mascota m1 = new Mascota("Firulais", Especie.PERRO, "Labrador", 5, "Juan Pérez");
      Mascota m2 = new Mascota("Michi", Especie.GATO, "Persa", 3, "Ana Gómez");

      // Crear Servicios
      Servicio s1 = new Servicio(TipoServicio.BANIO, "Baño completo con shampoo especial", 30, 1500);
      Servicio s2 = new Servicio(TipoServicio.CORTE_PELO, "Corte de pelo estilo cachorro", 45, 2500);

      // Crear Turnos
      Turno t1 = new Turno("2025-08-15 10:30", EstadoTurno.PROGRAMADO, m1, s1);
      Turno t2 = new Turno("2025-08-15 11:30", EstadoTurno.PROGRAMADO, m2, s2);

      // Mostrar datos
      System.out.println("\n=== MASCOTAS ===");
      m1.mostrarDatos();
      m2.mostrarDatos();

      System.out.println("\n=== SERVICIOS ===");
      s1.mostrarDatos();
      s2.mostrarDatos();

      System.out.println("\n=== TURNOS ===");
      t1.mostrarDatos();
      t2.mostrarDatos();
    }
  }
}