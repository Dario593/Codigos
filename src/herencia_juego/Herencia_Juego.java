// JUEGO DE PIEDRA PAPEL O TIJERAS 
package herencia_juego;

import java.util.Scanner;

public class Herencia_Juego {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nombre del jugador humano:");
        String nombreJugador = scan.nextLine();
        JugadorHumano jugadorH = new JugadorHumano(nombreJugador);
        Juego juego = new Juego("CPU");
        
        while (true) {
            jugadorH.elegir(scan);
            jugadorH.imprimirResultados();
            
            int resultado = (3 + jugadorH.getElegir() - juego.getElegir()) % 3;
            
            if (resultado == 1) {
                System.out.println("Empate");
            }else if(resultado == 2) {
                System.out.println(nombreJugador + " Gana");
            }else {
                System.out.println("CPU GANA");
            }
            
            System.out.println("¿QUIERES JUGAR DE NUEVO? (y/n): " );
            String respuesta = scan.next();
            
            if (!respuesta.equalsIgnoreCase("y")) {
                System.out.println("\nHas salido del juego!");
                break;
            }else {
                System.out.println("Ok, Empecemos");
            }
        }
        
        scan.close();
       
    }
    
}
