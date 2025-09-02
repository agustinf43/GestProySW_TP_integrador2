package entities;
import enums.tipoCombustible;

public abstract class Vehiculo {
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    public tipoCombustible combustible;

    public Vehiculo(){

    }

    public Vehiculo(int id, String marca, String modelo, int anio, tipoCombustible combustible) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.combustible=combustible;
    }



    public abstract void calcularCostoMantenimiento();

    public void mostrarInfo(){
        System.out.println(
                "Id: "+id +
                " Marca: "+marca +
                " Modelo: "+modelo +
                " anio: "+ anio
                + " Tipo Combustible: "+combustible
        );

    };

    public void mostrarInfo(String marca, String modelo){
        System.out.println(
                "Marca: "+marca
                +" Modelo: "+modelo

        );

    };




}

