/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_menu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_30_menu {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
      int opcion;
      do{
         System.out.println("------------MENU DEL SISTEMA-------------");
         System.out.println("1. VENTAS");
         System.out.println("2. COMPRAS");
         System.out.println("3. PROVEEDORES");
         System.out.println("4. CLIENTES");
         System.out.println("5. SALIR");
         opcion = captu.nextInt();
         captu.nextLine();
      }while(opcion != 5); //!= --> Diferente de
      //en todos los ciclos: la repeticion se realiza cuando
      //la condicion es verdadera, terminan cuando es falso
      System.out.println("SALIENDO DEL SISTEMA!!");
   }
   
}
