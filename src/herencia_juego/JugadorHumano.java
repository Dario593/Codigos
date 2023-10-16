
package herencia_juego;

import java.util.Scanner;


public class JugadorHumano extends Juego {
    
    public JugadorHumano(String jugador) {
        super(jugador);
    }
    
    public void elegir (Scanner scan) {
        System.out.println(jugador + ", Elige (1 para piedra, 2 para papel, 3 para tijeras)");
        elegir = scan.nextInt();
        
    }
    

    
    
}
