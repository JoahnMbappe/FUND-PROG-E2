/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_25_ejercicio2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      Scanner captu = new Scanner(System.in);
      int nume;
      
      System.out.println("Valor inicial ");
     nume = captu.nextInt();
    
   
  
        for(int i = i =0; i<=nume; i++){
           for(int j = 1; j <= i; j++){
              System.out.print("*");
           }
               System.out.println();
      
     }
        
        System.out.println();
   }
   
}
