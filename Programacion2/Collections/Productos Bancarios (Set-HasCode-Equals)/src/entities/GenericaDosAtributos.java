package entities;

public class GenericaDosAtributos <k, v>{
//dentro del mayor y menor van los tipos de datos de los que seran los atributos
    private k codigo;
    private v nombre;


    public GenericaDosAtributos(k codigo,v nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public k getCodigo() {
        return codigo;
    }

    public void setCodigo(k codigo) {
        this.codigo = codigo;
    }

    public v getNombre() {
        return nombre;
    }

    public void setNombre(v nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "GenericaDosAtributos{" +
                "codigo=" + codigo +
                ", nombre=" + nombre +
                '}';
    }
}//cierra clase
