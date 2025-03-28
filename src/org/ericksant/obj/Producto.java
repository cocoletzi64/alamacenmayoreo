package org.ericksant.obj;
import org.ericksant.pers.Persona;

public class Producto {

    private String nombre;
    private int precio;
    private String marca;


    //constructor
    public Producto(String nombre, int precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    //getter

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }
}

