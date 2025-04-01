package org.ericksant.pers;

import org.ericksant.obj.Producto;

public class Vendedor extends Persona{
    private String turno;
    private double salario;

    //constructor

    public Vendedor(String nombre, String apellido, int edad, String turno, double salario) {
        super(nombre, apellido, edad);
        this.turno = turno;
        this.salario = salario;
    }

    //getter and setter

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }//metodo
    public String vender(){
        return " vendio el producto";
    }
    //to String

    @Override
    public String toString() {
        return "=====================VENDEDOR=================="+ "\n"+super.toString()+
                "turno= " + turno + "\n" +
                "salario= " + salario;
    }
}
