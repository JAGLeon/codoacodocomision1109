
package com.mycompany.main;

import java.util.Scanner;


public class ClaseDos {
    public static void main(String []args){
        Scanner ingrese = new Scanner (System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;
        System.out.println("***********************************");
        System.out.println("*Bienvenido al sistema de vaciones*");
        System.out.println("***********************************");
        System.out.println("");
        System.out.println("");
        System.out.println("¿Cual es el nombre del trabajador?: ");
        nombre = ingrese.nextLine();
        System.out.println("");
        System.out.println("Ingrese su antiguedad");
        antiguedad= ingrese.nextInt();
        System.out.println("");
        System.out.println("Ingrese su clave porfavor");
        clave = ingrese.nextInt();
        System.out.println("");
        
        if(clave == 1){
            if(antiguedad == 1){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 6 dias de vacaciones.");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 14 dias de vacaciones.");
            }else if (antiguedad >= 7){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 20 dias de vacaciones.");
            }
            
        }else if(clave == 2){
            if(antiguedad == 1){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 7 dias de vacaciones.");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 15 dias de vacaciones.");
            }else if (antiguedad >= 7){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 21 dias de vacaciones.");
            }
        } else if(clave == 3){
            if(antiguedad == 1){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 10 dias de vacaciones.");
            }else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 20 dias de vacaciones.");
            }else if (antiguedad >= 7){
                System.out.println("El trabajador "+ nombre+ " tiene derecho a 30 dias de vacaciones.");
            }
        }else{
            System.out.println("Error! La clave del departamento es incorrecta");
        }
        
                       
    }
}
