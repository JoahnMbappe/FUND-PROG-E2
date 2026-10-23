/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_25_ejercicio4 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int nume, nume2, potencia = 1;
      
      System.out.println("Valor 1 ");
     nume = captu.nextInt();
     captu.nextLine();
      System.out.println("Valor 2 ");
     nume2 = captu.nextInt();
     captu.nextLine();
    
   
  
        for(int i = 1; i<=nume2; i++){
    potencia = potencia * nume;
     
    
   }
   System.out.println("potencia de : "+nume+ " elevado a: "+nume2+" es: "+potencia);
}
}