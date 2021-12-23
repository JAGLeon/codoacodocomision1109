
package mi_app;

import niveles.Niveles;

public class Mi_app {
    public static void main(String[] args){
        Juego jugador = new Juego(0,3,"ak47","Juan","Netbeans");
        Juego jugador1 = new Juego(0,3,"ak47","Pedro","Netbeans");
        System.out.println(jugador.personaje);
        System.out.println(jugador1.personaje);
        System.out.println(jugador.mostrar_vidas());    
        System.out.println(jugador1.mostrar_vidas()); 
        Niveles niveles = new Niveles("principiante","dos");
        niveles.setDificultad("media");
        System.out.println(niveles.getDificultad());
        jugador.vidas=jugador.vidas--;       
        if(jugador.vidas == 0){
            System.out.println(niveles.reiniciar());
        }
}
}