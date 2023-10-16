
package polimorfismo2_inventario;


public class Impresoras extends Productos {
    
    public Impresoras(double precio, String color, String marca) {
        super(precio, color, marca);
    }
    
      @Override
    public double CalcularPrecio() {
        System.out.println("EN COMPRA DE IMPRESORAS:");
        System.out.println("El precio de la Impresora es: "+ getPrecio());
        return 0;
    }
    
    @Override
       public String  VerMarca() {
           System.out.println("La Marca de la Impresora es: " + getMarca());
        return null;
        
    }
     
    @Override
     public String  VerColor() {
         System.out.println("Su Color es: " + getColor());
        return null;
         
     }
    
    
}
