/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_29_Do_While {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int monto, cuenta = 5000;
      Scanner captu = new Scanner(System.in);
      
      do{//ejecucion al menos una vez
         System.out.println("Cuanto quieres retirar?: ");
         monto = captu.nextInt();
         //acumulador
         cuenta = cuenta - monto;
         System.out.println("Tu saldo restante es - "+cuenta);
      }while(cuenta > 0);
      System.out.println("Se te acabo el dinero");
   }
   
}
