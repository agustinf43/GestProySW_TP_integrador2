package entities;

import java.util.Enumeration;

public class productoBancario {

  private int Banco;
  private int Sucursal;
  private int numProducto;
  private static int contador=0;

  public productoBancario(int Banco,int Sucursal){
    this.Banco=Banco;
    this.Sucursal=Sucursal;
    contador++;
    this.numProducto=contador;
  }

  public int getBanco() {
    return Banco;
  }

  public void setBanco(int banco) {
    Banco = banco;
  }

  public int getSucursal() {
    return Sucursal;
  }

  public void setSucursal(int sucursal) {
    Sucursal = sucursal;
  }

  public int getNumProducto() {
    return numProducto;
  }

  @Override
  public String toString() {
    return "productoBancario:" +
        "Banco=" + Banco +
        ", Sucursal=" + Sucursal +
        ", numProducto=" + numProducto +
        '}';
  }

}

