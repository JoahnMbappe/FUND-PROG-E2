/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_23_capturar {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //Solicitar las calificaciones y promediar
      Scanner captu = new Scanner(System.in);
      int cant, califa = 0;
      double promedio;
      System.out.println("Cuantas calificaciones vas a capturar?");
      cant = captu.nextInt();
      captu.nextLine();
      for(int i = 0; i < cant; i++){//for(int i = 1; i <= cant; i++)
          System.out.println("Captura la calificacion: ");
          califa = califa + captu.nextInt(); //acumulador
          captu.nextLine();
        
         
      }
      System.out.println("Acumulado: " + califa);
      promedio = califa / (cant * 1.0);
      System.out.println("El promedio es: " + promedio);
      
   }
   
}
