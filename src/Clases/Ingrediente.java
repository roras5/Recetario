package Clases;

public class Ingrediente {

    protected String nombre;
    private Unidad unidadBasica;
    private double precioUnitario;
    private double cantidad;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, double precio, Unidad unidadBasica, double cantidad) {
        super();
        this.nombre = nombre;
        this.setPrecioUnitario(precio);
        this.unidadBasica = unidadBasica;
        this.setCantidad(cantidad);

    }

    public Ingrediente(double precio, Unidad unidadBasica, double cantidad) {
        this("Clases.Ingrediente", precio, unidadBasica, cantidad);
    }

    public Ingrediente transformar(double equivalencia, Unidad unidad){
        Ingrediente resultadoTransformado = new Ingrediente();
        resultadoTransformado.nombre = this.nombre;
        resultadoTransformado.unidadBasica = unidad;
        resultadoTransformado.cantidad = this.cantidad * equivalencia;
        resultadoTransformado.precioUnitario = this.precioUnitario * equivalencia;

        return resultadoTransformado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario < 0) {
            precioUnitario = 0;

        }
        this.precioUnitario = precioUnitario;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Unidad getUnidadBasica() {
        return unidadBasica;
    }

    public void setUnidadBasica(Unidad unidadBasica) {
        this.unidadBasica = unidadBasica;
    }

    @Override
    public String toString() {
        String cadena = new String() + "Clases.Ingrediente{" + "nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", unidadBasica=" + unidadBasica + ", cantidad=" + cantidad + '}';

        return cadena;

    }
}

