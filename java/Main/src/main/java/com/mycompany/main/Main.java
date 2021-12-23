package com.mycompany.main;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
         Scanner entrada = new Scanner (System.in);
         String nombre = "";
         int numUno = 0, numDos= 0, resultado =0;
         System.out.println("¿Cual es tu nombre?");
         nombre = entrada.nextLine();
         System.out.println("Ingrese su primer valor:");
         numUno= entrada.nextInt();
         System.out.println("Ingrese su segundo valor:");
         numDos= entrada.nextInt();
         
         resultado = numUno + numDos;
         System.out.println(nombre + " tu suma dio como resultado: "+resultado);
     }
    }
