public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad); // uso de super
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + ", Sueldo: $" + sueldo;
    }

    // Sobrecarga
    public String mostrarDatos(boolean conSaludo) {
        if (conSaludo) {
            return "Hola! Soy " + getNombre() + " y gano $" + sueldo;
        } else {
            return mostrarDatos();
        }
    }
}
