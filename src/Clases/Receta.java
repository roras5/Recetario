package Clases;

import java.util.*;

public class Receta extends Object {

    private String nombre;
    private Vector<Ingrediente> listaIngredientes;
    private double porciones;
    private double valorAgregado;
    private String tipo;

    public Receta() {

        this.listaIngredientes = new Vector<Ingrediente>();
    }

    public double costoReceta() {
        double costoTotal = 0;
        for (Ingrediente elemento : this.listaIngredientes) {
            costoTotal += elemento.getCantidad() * elemento.getPrecioUnitario();
            costoTotal += this.valorAgregado;
        }
        costoTotal += this.valorAgregado;
        return costoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vector<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void agregaIngrediente(Ingrediente ingrediente) {
        this.listaIngredientes.add(ingrediente);
    }

    public double getPorciones() {
        return porciones;
    }

    public void setPorciones(double porciones) {
        this.porciones = porciones;
    }

    public double getValorAgregado() {
        return valorAgregado;
    }

    public void setValorAgregado(double valorAgregado) {
        this.valorAgregado = valorAgregado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String cad = new String() + "Clases.Receta{" + "nombre=" + nombre + ", listaIngredientes=" + listaIngredientes + ", porciones=" + porciones + ", valorAgregado=" + valorAgregado + ", tipo=" + tipo + '}';

        for (Ingrediente ingre : this.listaIngredientes) {
            cad = cad + "\n" + ingre;
        }

        return cad;
    }

}
