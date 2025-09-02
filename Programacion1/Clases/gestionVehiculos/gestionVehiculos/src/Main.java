import entities.Camion;
import entities.Coche;
import enums.tipoCombustible;

public class Main {
    public static void main(String[] args) {

    Coche autito= new Coche(1, "TOYOTA", "supra", 99 , tipoCombustible.GASOLINA, 4);

    autito.mostrarInfo();
    autito.mostrarInfo("audi","R3");
    autito.calcularCostoMantenimiento();
    autito.transportar();

    Camion camioncito= new Camion(1, "VOLVO", "vm VOCACIONAL", 2001, tipoCombustible.DIESEL, 1200 );

    camioncito.mostrarInfo();
    camioncito.mostrarInfo("Mercedes", "1114" );
    camioncito.calcularCostoMantenimiento();
    camioncito.transportar();



    }//fin main
}//fin clase main