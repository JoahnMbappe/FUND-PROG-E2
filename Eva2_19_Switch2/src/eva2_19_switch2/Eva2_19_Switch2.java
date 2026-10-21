/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_switch2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_19_Switch2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
       System.out.println("INTRODUCE LA CARRERA (SISTEMAS , INFORMATICA, ADMINISTRACION):  ");
         String carrera = captu.nextLine();
            switch(carrera){ //if (carrera.equals(SISTEMAS))
               case "SISTEMAS":
               System.out.println("ISC");
               break; //break termina el caso y el switch
               case "INFORMATICA":
               System.out.println("INF");
               break;
               case "ADMINISTRACION":
               System.out.println("LA");
               break;
            }
   }
   
}
