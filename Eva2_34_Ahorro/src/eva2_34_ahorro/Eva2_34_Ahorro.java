/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_34_Ahorro {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //Vamos a depositar hasta llegar a la meta
      Scanner captu = new Scanner(System.in);
      int ahorro = 15000;
      int deposito;
      int acum =0;
      while(true){
         System.out.println("Introduce el deposito: ");
           deposito = captu.nextInt();
           captu.nextLine();
           
           //verificar que no nos estamos pasando
           if((acum + deposito) > 15000){
              System.out.println("Te pasaste de la meta");
           continue;
           }
         acum += deposito;
         System.out.println("cuenta: " + acum);
              if(acum == 15000){ //llegamos a la meta
                 System.out.println("LLEGASTE A LA META, AHORA COMPRATE LA PS5 PRO");
                 break;
              }
           
      }
      
   }
   
}
