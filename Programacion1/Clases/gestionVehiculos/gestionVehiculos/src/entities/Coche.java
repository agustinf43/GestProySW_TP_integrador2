package entities;
import enums.tipoCombustible;
import interfaces.transporte;

public class Coche extends Vehiculo implements transporte {
    private int numeroPuertas;


    public Coche(int id, String marca, String modelo, int anio, tipoCombustible combustible , int numeroPuertas) {
        super(id, marca, modelo, anio, combustible);
        this.numeroPuertas = numeroPuertas;
    }


    public void transportar(){
       System.out.println("Transportando personas");
   }

    @Override
    public void calcularCostoMantenimiento() {
        double costo = 100*numeroPuertas;
        System.out.println("El costo de mantenimiento del Coche es de: $"+costo);
    }
}//clase coche
