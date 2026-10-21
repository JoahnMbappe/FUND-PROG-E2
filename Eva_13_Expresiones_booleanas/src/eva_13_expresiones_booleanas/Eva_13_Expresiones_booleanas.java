/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_13_expresiones_booleanas;

/**
 *
 * @author Usuario
 */
public class Eva_13_Expresiones_booleanas {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      boolean entrarAntro, tieneCredencial = false;
      int edad = 15;
      
      //AND --> PARA QUE SEA VERDAD, AMBAS EXPRESIONES DEBEN SER VERDAD (TRUE)
      entrarAntro = (edad >= 18) && (tieneCredencial == true);
      System.out.println("Tienes permiso para entrar: "+ entrarAntro);
         
         
         //OR--> PARA QUE SEA VERDAD, SOLO UNA (CUALQUIERA) DEBE SER VERDAD
         boolean estaSoleado= true, tienesDinero = true;
         boolean permisoSalir;
         
        permisoSalir = (estaSoleado == true) || (tienesDinero == true);
        System.out.println("Tienes permiso para entrar: "+ permisoSalir);
      
   }
   
}
