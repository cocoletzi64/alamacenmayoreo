package org.ericksant.obj;

public class Predecedero extends Producto{
    private int catidad;
    private String tipo;

    //constructor
    public Predecedero(String nombre, int precio, String marca) {
        super(nombre, precio, marca);
    }
    //getter and setter

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
