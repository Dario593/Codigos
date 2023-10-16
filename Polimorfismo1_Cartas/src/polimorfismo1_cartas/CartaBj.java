package polimorfismo1_cartas;

public abstract class CartaBj extends Cartas {

    public CartaBj(String palo, String valor) {
        super(palo, valor);
    }

    @Override
    public void Jugar() {

        System.out.println("Has Escogido Entre Las Cartas del Blackjack a: " + getValor() + " De " + getPalo());

    }

}
