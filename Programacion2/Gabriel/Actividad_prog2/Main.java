public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 30);
        Empleado e1 = new Empleado("Gabi", 24, 250000);

        System.out.println(p1.mostrarDatos());
        System.out.println(e1.mostrarDatos());
        System.out.println(e1.mostrarDatos(true));
        System.out.println(e1.mostrarDatos(false));
    }
}
