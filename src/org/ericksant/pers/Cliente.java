package org.ericksant.pers;

public class Cliente extends Persona{
    private int visitas;

    //constructor


    public Cliente(String nombre, String apellido, int edad, int visitas) {
        super(nombre, apellido, edad);
        this.visitas = visitas;
    }

    public Cliente(int visitas) {
        this.visitas = visitas;
    }


    //getter and setter

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }
    //metodo
    public String valor() {
        String descuento="descuento";
        if (visitas <=2) {
            descuento+= " no hay descuento por no ser cleinte frecuente";
        }
        else{
            return"tiene descuento de 20% por ser cliente frecuente";
        }
        return descuento;
    }

}
