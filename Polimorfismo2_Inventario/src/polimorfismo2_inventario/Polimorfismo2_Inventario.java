
package polimorfismo2_inventario;

import java.util.ArrayList;

public class Polimorfismo2_Inventario {

    public static void main(String[] args) {

        ArrayList<Productos> pro = new ArrayList<>();

        System.out.println("Descripcion: ");
        
        
        pro.add(new Computador(1500.00, "Rojo", "HP"));
        pro.add(new Impresoras(500.00, "Negro", "Kanon"));
        pro.add(new Audifonos(100.00, "Blanco", "Sony"));
        
        for (Productos prod: pro) {
            prod.CalcularPrecio();
            prod.VerColor();
            prod.VerMarca();
            
        }
        
        
        
        
        
        
        
        
        
       
    }
    
}
