package org.ericksant;

import org.ericksant.pers.*;

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
        System.out.println(((Cliente) mario).valor());


    }
}
