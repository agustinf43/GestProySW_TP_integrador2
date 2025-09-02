package entities;

public class TarjetaDeCredito extends ProductoBancario {

    private int clave;

    public TarjetaDeCredito(int banco, int sucursal, int clave) {
        super(banco, sucursal);
        this.clave=clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void mostrarInfo() {
        System.out.println("Tarjeta de Credito - Banco: " + super.getBanco() + ", Sucursal: " + super.getSucursal()
                + ", Nº de Producto: " + super.getNroProducto());
    }


}
