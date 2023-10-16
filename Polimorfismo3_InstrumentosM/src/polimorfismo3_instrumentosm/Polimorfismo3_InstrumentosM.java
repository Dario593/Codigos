
package polimorfismo3_instrumentosm;

import java.util.ArrayList;

public class Polimorfismo3_InstrumentosM {

  
    public static void main(String[] args) {
      
        
        ArrayList<Instrumentos> instrumento = new ArrayList<>();
        instrumento.add(new Piano());
        instrumento.add(new Guitarra());
        instrumento.add(new Acordeon());
        
        
        for (Instrumentos inst : instrumento) {
            inst.tocar();
            inst.parar();
        }
        
    }
    
}
