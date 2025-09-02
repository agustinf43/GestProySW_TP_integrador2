package entities;

public abstract class ProductoBancario {
    private int banco;
    private int sucursal;
    private int nroProducto;
    private TipoCuenta tipoCuenta;

    private static int contador;

    static {
        contador = 0;
    }

    public ProductoBancario(int banco, int sucursal) {
        this.banco = banco;
        this.sucursal = sucursal;
        this.nroProducto = contador++;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public NombresBanco getNombreBanco() {
        return NombresBanco.getPorCodigo(banco);
    }

    public int getBanco() {
        return banco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getNroProducto() {
        return nroProducto;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }


}
