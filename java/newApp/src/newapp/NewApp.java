
package newapp;

import java.util.Scanner;


public class NewApp {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String pass = entrada.nextLine();
        Ingreso ing = new Ingreso();
        ing.setUsuario(nombre);
        ing.setPass(pass);
        System.out.println(ing.Validar());
           
    }
}
 