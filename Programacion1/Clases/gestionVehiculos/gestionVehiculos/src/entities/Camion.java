package entities;
import enums.tipoCombustible;
import interfaces.transporte;

public class Camion extends Vehiculo implements transporte {

    private double capacidadCarga;

    public Camion(int id, String marca, String modelo, int anio, tipoCombustible combustible, double capacidadCarga) {
        super(id, marca, modelo, anio, combustible);
        this.capacidadCarga=capacidadCarga;
    }

    @Override
    public void transportar() {
        System.out.println("Transportando carga");
    }

    @Override
    public void calcularCostoMantenimiento() {
        double costo=1000*capacidadCarga;
        System.out.println("El costo de mantenimiento del camion es de: $"+costo);
    }
}
