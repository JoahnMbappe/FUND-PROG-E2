/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_24_ejercicio1 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int nume,nume2;
      
      System.out.println("Valor inicial ");
     nume = captu.nextInt();
     captu.nextLine();
      System.out.println("Valor final ");
     nume2 = captu.nextInt();
     captu.nextLine();
  
        for(int i = nume; i <= nume2; i++){
               System.out.println(i);
      
     }
       
   }
   
}
