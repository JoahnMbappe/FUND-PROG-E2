/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_24_factorial {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int nume = 0;
      int factorial = 1;
      int suma;
      System.out.println("Valor a calcular en factorial: ");
     nume = captu.nextInt();
  
        for(int i = nume; i >= 1; i--){
        factorial = factorial * i; //acumulador en multiplicacion ebe iniciar en 1
        System.out.println(i);
        
      
     }
        System.out.println("Valor en factorial: "+ factorial);
        
     //caso2
      for(int i = 1; i <= nume; i++){
        System.out.println(i);
      }
   
      System.out.println("Valor en factorial: "+ factorial);
   }
   
}
