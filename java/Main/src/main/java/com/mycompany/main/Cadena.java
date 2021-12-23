
package com.mycompany.main;

import java.util.Scanner;


public class Cadena {
    public static void main (String []args){
        String cadenaOri = "", cadenaSubstraccion ="";
        int numCarac=0,desde = 0 , hasta=0;
        Scanner in = new Scanner (System.in);
        
        System.out.println("Ingresa una cadena de caracteres: ");
        cadenaOri = in.nextLine();
        
        numCarac = cadenaOri.length();
        
        System.out.println("La cadena de caracteres "+cadenaOri+ " posee " +numCarac+" caracteres.");
        
        System.out.println("Donde queres que corte la cadena");
        desde=in.nextInt();
        System.out.println("Donde queres que termine la cadena");
        hasta=in.nextInt();
        
        cadenaSubstraccion=cadenaOri.substring(desde, hasta);
        System.out.println("La nueva cadena es: "+cadenaSubstraccion);
    }
}
