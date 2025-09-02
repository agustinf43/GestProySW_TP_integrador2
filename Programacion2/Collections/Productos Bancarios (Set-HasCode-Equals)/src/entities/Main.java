package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CajaAhorro caja1 = new CajaAhorro(1, 1);
        CuentaCorriente cc1 = new CuentaCorriente(1, 1);
        TarjetaDeCredito tc1 = new TarjetaDeCredito(2, 2, 444);

        caja1.setTipoCuenta(TipoCuenta.CA);
        cc1.setTipoCuenta(TipoCuenta.CC);
        tc1.setTipoCuenta(TipoCuenta.TC);

        System.out.println("Value of CC: " + TipoCuenta.valueOf("CC"));
        System.out.println("Value: " + TipoCuenta.values());

        for (TipoCuenta tipo : TipoCuenta.values()) {
            System.out.println(tipo + tipo.name() + " ordinal " + tipo.ordinal());
            //ordinal es la posicion
        }

        // GenericaDosAtributos ejemplo1 = new GenericaDosAtributos(3586, "Las Toscas");
        //ejemplo1.getCodigo() instanceof String;
        GenericaDosAtributos<Integer, String> ejemplo2 = new GenericaDosAtributos<>(3586, "Las Toscas");
        System.out.println(ejemplo2.toString());

        GenericaDosAtributos<String, String> ejemplo3 = new GenericaDosAtributos<>( "Las Toscas","Santa fe");
        System.out.println(ejemplo3.toString());


        
        caja1.mostrarInfo();
        System.out.println(cc1.getNroProducto());

        try {
            System.out.println("Esta tarjeta es del banco: " + tc1.getNombreBanco());
        } catch (NullPointerException e) {
            System.out.println("No se encuentra el nombre del banco");
        }

//lista de tipo array(posicional)
        List<CajaAhorro> listaCA = new ArrayList<>();

        listaCA.add(new CajaAhorro(1,1));
        listaCA.add(new CajaAhorro(2,1));
        listaCA.add(new CajaAhorro(3,1));
        listaCA.add(new CajaAhorro(1,2));
        listaCA.add(new CajaAhorro(2,2));
        listaCA.add(new CajaAhorro(3,2));

        //size es el tamaño de la lista
        System.out.println("Cantidad de cajas de ahorro= "+listaCA.size());

        Iterator<CajaAhorro> it = listaCA.iterator();
        while(it.hasNext()){
            CajaAhorro ca =it.next();
            ca.mostrarInfo();
        }


    }//cierra Main
}//cierra clase