/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_15_Beca {

   
   // Eva_15_Beca
   //promedio < 80
   //ingresos mensuales < 10000
   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      
      int prom;
      double ingresoMen;
      
      Scanner captu = new Scanner(System.in);
       
      System.out.println("Ingrese su promedio: ");
      prom = captu.nextInt();
      captu.nextLine();
      
      System.out.println("Ingrese su ingreso: ");
      ingresoMen = captu.nextDouble();
      
      if(prom > 80 && ingresoMen < 10000){
         System.out.println("Beca concedida");
      } else{
         System.out.println("Beca denegada");
      }
   }
   
}
