package polimorfismo1_cartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polimorfismo1_Cartas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Cartas> mano = new ArrayList<>();

        while (true) {

            System.out.println("*****MENU*****");
            System.out.println("1_ Agrega una Carta de Poker");
            System.out.println("2_ Agrega una carta de BlackJack");
            System.out.println("3_ Muestra mano de Carta escogida");
            System.out.println("4_ Salir");

            System.out.println("Escoge una de las Opciones");

            int opcion = scan.nextInt();
            // CREACION DE CASOS 
        switch (opcion) {
            case 1:
                System.out.println("Ingresa un palo de Carta de poker ");
                String paloP = scan.next();
                System.out.println("Ingresa el valor de la carta de poker ");
                String valorP = scan.next();
                mano.add(new Carta_As(paloP, valorP));
                break;
            case 2:
                System.out.println("Ingresa un palo de Carta de BlackJack ");
                String paloB = scan.next();
                System.out.println("Ingresa el valor de la carta de poker ");
                String valorB = scan.next();
                mano.add(new CartaBj(paloB, valorB) {});
                break;
            case 3:
                System.out.println("Mano de Cartas: ");

                for (Cartas Carta : mano) {
                    Carta.Jugar();
                }

                break;
            case 4:
                System.out.println("Saliste del Juego");
                System.exit(0);

            default:
                System.out.println("Opcion invalida.....Porfavor Elige Otra Opcion");
        }

    }

}

}
