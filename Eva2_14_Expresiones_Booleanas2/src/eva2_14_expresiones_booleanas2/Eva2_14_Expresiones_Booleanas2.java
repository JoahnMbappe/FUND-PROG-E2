/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_14_Expresiones_Booleanas2 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      int promedio = 95;
    String equipo;
      
      Scanner captu = new Scanner(System.in);
      
      System.out.println("Ingrese su promedio: ");
      promedio = captu.nextInt();
       captu.nextLine();
      System.out.println("Esta en un equipo representativo (Si / No): ");
       equipo = captu.nextLine();
       
       if(promedio >= 95  || equipo.equals("Si")){
          System.out.println("Beca concedida");
       }else {
          System.out.println("Beca denegada");
       }
      
      //BECA
      //promedio >= 95
      //esta en equipo representativo
      
      
   }
   
}
