/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package niveles;

/**
 *
 * @author Antony
 */
public class Niveles {
    private String dificultad;
    
    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }    
    
    
    public String experiencia , checkpoint;
    
    public Niveles (String experiencia, String checkpoint){
        this.experiencia = experiencia;
        this.checkpoint = checkpoint;
    }
    public String reiniciar () {
        return "Estamos en el nivel: " + this.checkpoint;
    }


    
}
