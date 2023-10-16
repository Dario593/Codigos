
package Datos;

import java.util.Scanner;

public class Persona_Datos extends Persona {
    
    private String Ciudad;

       @Override
    public void IngresarDatos() {
        super.IngresarDatos();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese lugar donde vive:");
        this.Ciudad = scan.nextLine();
        
    }
    
    @Override
    public void MostrarDatos(){
        super.MostrarDatos();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEl lugar donde vive es: "+this.Ciudad);
        
    }

  
    
    
    
}
