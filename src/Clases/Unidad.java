package Clases;

public class Unidad {
    private String nombre;

    public Unidad(String nombre) {
        this.nombre = nombre;
    }



    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clases.Unidad{" + "nombre=" + nombre + '}';
    }
}
