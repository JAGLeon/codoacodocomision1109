package com.mycompany.main;

public class ClaseSeis {
    public static void main(String[]args){
        int i = 1 , j = 99;
        System.out.println("Serie con for: ");
        for(i=1; i <=5 ; i++){
            if(i<5){
                System.out.print(i+", ");
                System.out.print(j+", ");
            }else{
                System.out.print(i+",");
                System.out.println(j);
            } 
            j--;
        }
        System.out.println("");
        
        i=1;
        j=99;
        
        System.out.println("Serie con while: ");
        
        while(i<=5){
            if(i<5){
                System.out.print(i+", ");
                System.out.print(j+", ");
            }else{
                System.out.print(i+",");
                System.out.println(j);
            } 
            i++;
            j--;
        }
        System.out.println("");
        
        i=1;
        j=99;
        
        System.out.println("Serie con do-while: ");
        
        do{
            if(i<5){
                System.out.print(i+", ");
                System.out.print(j+", ");
            }else{
                System.out.print(i+",");
                System.out.println(j);
            } 
            i++;
            j--;
        }while(i<=5);
        
        int i=0, a = 0, b = 1, c = 0;
        System.out.println("Serie con for: ");
        for(i=0; i < 10;i++){
            if (i<9){
                System.out.print(a+", ");
                c=a+b;
                a=b;
                b=c;
            }else{
                System.out.println(a);
            }
        }
        System.out.println("");
    }
}