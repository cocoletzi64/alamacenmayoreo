package org.ericksant;

import org.ericksant.pers.*;
import org.ericksant.obj.*;

public class clasemain {
    public static void main(String[] args) {
        Persona erick=new Vendedor("Erick","Cocoletzi",25,
                "Matutino",4000);
        Persona giovanni=new Vendedor("Giovanni","Cocoletzi",23,
                "Vespertino",4200);
        Persona mario=new Cliente("Mario","Valladares",29,5);


        System.out.println(erick);
        System.out.println(giovanni);
        System.out.println(mario);


        //PRODUCTOS
        Predecedero predecedero=new Predecedero("Carne",2000,"Volcanes");
        predecedero.setTipo("Proteinas");
        predecedero.setCatidad(120);
        Nopredecedero nopredecedero=new Nopredecedero("Leche",25,"lala"
                ,"Intensiva");
        nopredecedero.setCantidad(1);
        Art_Limpieza artLimpieza=new Art_Limpieza("Jabon",54,"Salvo");
        artLimpieza.setLitros(1);

        System.out.println("\n"+((Vendedor) erick).getNombre() +
                ((Vendedor) erick).vender() + " " +
                nopredecedero.getNombre()+" al clinte "+((Cliente) mario).getNombre()+
                " que "+ ((Cliente) mario).valor());


    }

}
