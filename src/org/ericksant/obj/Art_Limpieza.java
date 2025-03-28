package org.ericksant.obj;

public class Art_Limpieza extends Producto{
   private int litros;

   //constructor
    public Art_Limpieza(String nombre, int precio, String marca) {
        super(nombre, precio, marca);
    }
    //getter and setter

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
}
