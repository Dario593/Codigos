
package polimorfismo3_instrumentosm;

public class Piano extends Instrumentos {

   
    
    @Override
    public void tocar() {
        System.out.println("El piano esta sonando"  );
        
        
    }
    
    @Override
    public void parar() {
        System.out.println("El piano dejo de sonar" );
        
    }
    
}
