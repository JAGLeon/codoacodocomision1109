
package com.mycompany.main;

import java.util.Scanner;


public class Vectores {
    public static void main (String []args){
      /*int numeros[] = new int[5];
        numeros[0]=1;
        numeros[1]=22;
        numeros[2]=33;
        numeros[3]=44;
        numeros[4]=55;
        System.out.print("["+numeros[0]+"]");
        System.out.print("["+numeros[1]+"]");
        System.out.print("["+numeros[2]+"]");
        System.out.print("["+numeros[3]+"]");
        System.out.print("["+numeros[4]+"]");*/
      Scanner in = new Scanner(System.in)
        int longitud = 0;
      
        System.out.println("¿Cuantos numeros deseas ingresar?");
        longitud=in.nextInt();
        
        int numeros []=new int[longitud];
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("Porfavor ingrese el valor #"+(i + 1));
            numeros[i]= in.nextInt();
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.print("["+numeros[i]+"]");
        }
    }
}
