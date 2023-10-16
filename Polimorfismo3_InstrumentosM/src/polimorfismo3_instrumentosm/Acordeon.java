
package polimorfismo3_instrumentosm;


public class Acordeon extends Instrumentos {

    

   
    @Override
    public void tocar( ) {
        System.out.println("El acordeon esta sonando" );
        
    }
    
    @Override
    public void parar() {
        System.out.println("El acordeon dejo de sonar");
        
    }
    
}
