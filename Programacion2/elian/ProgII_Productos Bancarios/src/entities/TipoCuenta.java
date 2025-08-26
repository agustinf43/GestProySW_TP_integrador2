package entities;

public enum TipoCuenta {
    CA("Caja de Ahorro",1),
       CC("Cuenta Corriente",2),
       TC("Tarjeta de Crédito",2);


private String nombreCuenta;
private int idCuenta;

private TipoCuenta(String nombreCuenta, int idCuenta){
    this.nombreCuenta=nombreCuenta;
    this.idCuenta=idCuenta;
}

}//cierra clase
