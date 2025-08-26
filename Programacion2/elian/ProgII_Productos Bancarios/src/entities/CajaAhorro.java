package entities;

public class CajaAhorro extends ProductoBancario {



    public CajaAhorro(int banco, int sucursal) {
        super(banco, sucursal);

    }


    public void mostrarInfo() {
        System.out.println("Caja de Ahorro - Banco: " + super.getBanco() + ", Sucursal: " + super.getSucursal()
                + ", Nº de Producto: " + super.getNroProducto());
    }






}
