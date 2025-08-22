import entities.*;

import java.util.HashSet;
import java.util.Set;
import exceptions.*;

public class Main {
  public static void main(String[] args) {

       tarjetaCredito juanPabloPerez =new tarjetaCredito(00330,50,"258");
       tarjetaCredito mariaMartinez = new tarjetaCredito(00330,50,"336");
       tarjetaCredito pedroGonzalezCalvo = new tarjetaCredito(00330,50,"473");
       productoBancario cajaAhorroJuan = new productoBancario(00330,50);
       productoBancario cuentaCorrienteJuan = new cuentaCorriente(00330,23);

    Set<productoBancario> productoBancarioList =new HashSet<>();

    productoBancarioList.add(juanPabloPerez);
    productoBancarioList.add(mariaMartinez);
    productoBancarioList.add(pedroGonzalezCalvo);
    productoBancarioList.add(cajaAhorroJuan);
    productoBancarioList.add(cuentaCorrienteJuan);

    try{
      tarjetaCredito pabloSuarez =new tarjetaCredito(0030,50,"3454");
    }catch (claveSeguridadInvalidaException tcne){
      System.out.println("Error al crear la tarjeta:"+tcne.getMessage());
    }
    }
  }
