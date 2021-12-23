
package com.mycompany.main;

import java.util.Scanner;


public class ClaseComparacion {
    public static void main (String []args){
            Scanner ingrese = new Scanner(System.in);
            String nombreUno = "", nombreDos="";
            System.out.println("Porfavor ingrese su primer nombre");
            nombreUno =ingrese.nextLine();
            System.out.println("Porfavor ingrese su segundo nombre");
            nombreDos =ingrese.nextLine();
            
            if(nombreUno.equalsIgnoreCase(nombreDos)){
                System.out.println("Los nombres son iguales");
            }else{
                System.out.println("Los nombres son diferentes");
            }
    }
}
