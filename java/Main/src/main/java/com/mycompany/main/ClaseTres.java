
package com.mycompany.main;

import java.util.Scanner;


public class ClaseTres {
    public static void main(String[]args){
        Scanner ingrese = new  Scanner(System.in);
        int numUno = 5, numDos = 3 , resultado = 0;
        int parametro = 0;
        System.out.println("Ingrese el numero 1-para la suma, el 2-para la resta, el 3-para la multi, el 4-para la divi.");
        parametro = ingrese.nextInt();
        System.out.println("Ingrese su 1 porfavor");
        numUno = ingrese.nextInt();
        System.out.println("Ingrese su 2 porfavor");
        numDos = ingrese.nextInt();
        
        switch(parametro){
            case 1:resultado =  numUno + numDos;
                System.out.println("El resultado de la suma es: "+ resultado);               
            break;
            
            case 2:resultado = numUno - numDos;
                System.out.println("El resultado de la resta es: "+ resultado);
            break;
            
            case 3:resultado = numUno * numDos;
                System.out.println("El resultado de la multiplicacion es: "+ resultado);
            break;
            
            case 4:resultado = numUno / numDos;
                System.out.println("El resultado de la division es: "+ resultado);
            break;  
            default: System.out.println("Erro!");
        }   
    }         
}
