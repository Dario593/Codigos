package polimorfismo1_cartas;

public class Carta_As extends Cartas {

    public Carta_As(String palo, String valor) {
        super(palo, valor);
    }

    @Override
    public void Jugar() {
        System.out.println("Has Escogido Entre Las Cartas del Poker a: " + getValor() + " De " + getPalo());

    }

}
