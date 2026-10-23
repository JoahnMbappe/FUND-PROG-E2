/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_25_ejercicio3 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int nume;
      int res = 0;
      System.out.println("tabla de multilplicar: ");
     nume = captu.nextInt();
    
   
  
        for(int i =1; i<=10; i++){
           
           res = nume * i;
              System.out.println(nume +" x "+i + " = " + res);
           
   }
   
}
}
