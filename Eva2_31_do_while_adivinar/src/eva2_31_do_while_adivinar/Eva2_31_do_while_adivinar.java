/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_31_do_while_adivinar {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //pide al usuario adivinar un numero,
      //termina cuando lo adivine
      Scanner captu = new Scanner(System.in);
      int num;
      do{
         System.out.println("------------ADIVINA EL NUMERO-------------");
         System.out.println("TECLEA UN NUMERO ENTRE 1 Y 100: ");
         num = captu.nextInt();
         captu.nextLine();
      }while(num != 67);
      System.out.println("ACERTASTE EL NUMERO!!!! SIX-SEVEN!!!!!");
   }
   
}
