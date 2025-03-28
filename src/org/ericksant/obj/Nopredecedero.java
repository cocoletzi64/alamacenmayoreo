package org.ericksant.obj;

public class Nopredecedero extends Producto{
    private int cantidad;
    private String tipoderefrigeracion;

    //constructor

    public Nopredecedero(String nombre, int precio, String marca, String tipoderefrigeracion) {
        super(nombre, precio, marca);
        this.tipoderefrigeracion = tipoderefrigeracion;
    }
    //getter and setter

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
