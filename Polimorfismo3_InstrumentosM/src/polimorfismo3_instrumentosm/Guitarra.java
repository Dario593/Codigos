
package polimorfismo3_instrumentosm;


public class Guitarra extends Instrumentos {

    

   
    @Override
    public void tocar() {
        System.out.println("Esta sonando la guitarra" );
        
    }
    
    @Override
    public void parar() {
        System.out.println("La guitarra dejo de sonar" );
        
    }
    
}
