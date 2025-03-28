package org.ericksant.pers;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    //constructor
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    //to String

    @Override
    public String toString() {
        return
                "nombre= " + nombre +"\n" +
                "apellido='" + apellido +"\n" +
                "edad=" + edad +"\n";
    }
}
