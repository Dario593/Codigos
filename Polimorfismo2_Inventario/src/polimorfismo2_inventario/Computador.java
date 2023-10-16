package polimorfismo2_inventario;

public class Computador extends Productos {

    public Computador(double precio, String color, String marca) {
        super(precio, color, marca);
    }

    @Override
    public double CalcularPrecio() {
        System.out.println("EN COMPRA DEL COMPUTADOR:");
        System.out.println("El precio del computador es: " + getPrecio());
        return 0;

    }

    @Override
    public String  VerMarca() {
        System.out.println("La Marca es: " + getMarca());
        return null;
    }

    @Override
    public String  VerColor() {
        System.out.println("Su Color es: " + getColor());
        return null;

    }
    

}
