package polimorfismo2_inventario;

public class Productos {

    private double precio;
    private String color;
    private String marca;

    public Productos(double precio, String color, String marca) {
        this.precio = precio;
        this.color = color;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double CalcularPrecio() {
        return getPrecio();
    }

    public String VerMarca() {
        return getMarca();

    }

    public String VerColor() {
        return getColor();

    }

}
