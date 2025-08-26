package entities;

import exceptions.claveSeguridadInvalidaException;

public class tarjetaCredito extends productoBancario{

  private String claveSeguridad;

  public tarjetaCredito(int Banco, int Sucursal,String claveSeguridad) {
    super(Banco, Sucursal);
    if (claveSeguridad.length() !=3){
      throw new claveSeguridadInvalidaException("La clave de seguridad debe tener exactamente 3 dígitos.");
    }
    this.claveSeguridad=claveSeguridad;
  }

  public String getClaveSeguridad() {
    return claveSeguridad;
  }

  public void setClaveSeguridad(String claveSeguridad) {
    this.claveSeguridad = claveSeguridad;
  }

}
