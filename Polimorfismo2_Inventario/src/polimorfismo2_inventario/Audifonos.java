
package polimorfismo2_inventario;


public class Audifonos extends Productos {
    
    public Audifonos(double precio, String color, String marca) {
        super(precio, color, marca);
    }
    
      @Override
    public double CalcularPrecio() {
         System.out.println("EN COMPRA DE AUDIFONOS:");
        System.out.println("El precio de los audifonos es: "+ getPrecio());
        return 0;
    }
    
    @Override
       public String VerMarca() {
           System.out.println("La Marca de los audifonos es: " + getMarca());
        return null;
        
    }
     
    @Override
     public String VerColor() {
         System.out.println("Su Color es: " + getColor());
        return null;
         
     }
    
    
}
