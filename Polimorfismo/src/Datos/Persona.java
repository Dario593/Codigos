
package Datos;

import java.util.Scanner;


public class Persona  {
    
   private String Nombre;
   private int Ced;
   private int Edad;
   
    
   public void IngresarDatos(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Ingrese su nombre:");
       this.Nombre = scan.next();
        
       System.out.println("Ingrese su identidad:");
       this.Ced = scan.nextInt();
        
       System.out.println("Ingrese su edad:");
       this.Edad = scan.nextInt();
    }

   
    public void MostrarDatos(){
        
        System.out.println("\n____-----SUS DATOS SON LOS SIGUIENTES-----____");
        System.out.println("\nSu nombre es: "+this.Nombre);
        System.out.println("\nSu # de cedula es: "+this.Ced);
        System.out.println("\nSu edad es: "+this.Edad);
    }
   
   
    
}
