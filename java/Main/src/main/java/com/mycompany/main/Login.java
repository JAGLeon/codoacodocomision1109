
package com.mycompany.main;

import java.util.Scanner;


public class Login {
    public static void main (String []args){
        String usuario="", password="";
        Scanner  ingrese = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre de usuario: ");
        usuario = ingrese.nextLine();
        System.out.println("Ingresa tu nombre de contraseña: ");
        password = ingrese.nextLine();
        
        if(usuario.equals("leon")&& password.equals("123456")){
            System.out.println("Inicio de sesion correcto");
        }else{
            System.out.println("Nombre o usuario incorrecto");
        }
    }
}
