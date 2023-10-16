
package herencia_juego;

import java.util.Random;


public class Juego {
    protected String jugador;
    protected int elegir;

    public Juego(String jugador) {
        this.jugador = jugador;
    }
    
    

   
    public void elegir() {
        Random randon = new Random();
        this.elegir = randon.nextInt(3);
        
    }
    
    public void imprimirResultados() {
        String elegirStr = "";
        switch (elegir) {
            case 1:
                elegirStr = "Piedra";
                break;
                
            case 2:
                elegirStr = "Papel";
                break;
                
            case 3:
                elegirStr = "Tijeras";
                break;
        }
        
        System.out.println(jugador + " elige: " + elegirStr);
        
        
    }

    public int getElegir() {
        return elegir;
    }
    
    
    
}
