package clase3;

import java.util.HashSet;
import personal.Departamento;
import personal.Personal;

public class Clase3 {

  
    public static void main(String[] args) {
        Personal persona = new Personal("Leon","Jose",30);
        persona.setSueldo(250000);
        Personal mantenimiento = new Personal ("Flores","Cande",22);
        mantenimiento.setSueldo(60000);
        System.out.println("El sueldo de usted es: "
                + mantenimiento.getSueldo());
        Personal administrativo = new Personal ("Garay","Pedro",40);
        administrativo.setSueldo(80000);
        System.out.println("El sueldo de usted es: "
                + administrativo.getSueldo());
        Departamento it = new Departamento("Romi","Rodriguez",32,"Desarrollo");
        it.setSueldo(500000);
        System.out.println(it.nombre + " esta ganando " + it.getSueldo());  
        it.depto="Gerencia General" ;
        System.out.println(it.MostrarDatos());
    }
    
}

