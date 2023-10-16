package polimorfismo1_cartas;

// creamos la clase Cartas
public abstract class Cartas {

    private final String palo;
    private final String valor;

    public Cartas(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public String getValor() {
        return valor;
    }

    public abstract void Jugar();

}
