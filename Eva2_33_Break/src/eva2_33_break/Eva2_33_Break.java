/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_33_Break {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int valor = 10, nume;
      while(true){
           System.out.println("INTRODUCE UN VALOR: ");
           nume = captu.nextInt();
           captu.nextLine();
           
           if(nume == valor){//el usuario adivino y gano, termina el juego
                System.out.println("ADIVINASTE, EL VALOR ES 10, GANASTE!!!");
                break;
           }
      }
   }
   
}
