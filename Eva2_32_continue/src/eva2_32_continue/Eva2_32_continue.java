/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

/**
 *
 * @author Usuario
 */
public class Eva2_32_continue {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      for( int i = 0; i<=20; i++){
         //para saber si es par me interesa el resido de dividir
         //entre dos
         
         int residuo = i % 2;
         if(residuo ==0)
         System.out.print(i + " - ");
         continue;
      }
        System.out.println("SI EL NUMERO ES PAR, ESTO NO SE IMPRIME");
   }
   
}
