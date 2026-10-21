/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_18_Switch {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner captu = new Scanner(System.in);
         System.out.println("INTRODUCE EL NUMERO DEL DIA (1-7): ");
         int dia = captu.nextInt();
            switch(dia){ //EVALUA ENTEROS:  SHORT,BYE.TEXTO : STRING
      case 1:
    System.out.println("DOMINGO");
    //PODEMOS PONER CUANTAS INSTRUCCIONES NECESITEMOS
   break;
    case 2:
    System.out.println("LUNES");
   break;
    case 3:
    System.out.println("MARTES");
   break;
    case 4:
    System.out.println("MIERCOLES");
   break;
    case 5:
    System.out.println("JUEVES");
   break;
    case 6:
    System.out.println("VIERNES");
   break;
    case 7:
    System.out.println("SABADO");
   break;
   default: //OPCIONAL: QUE HAGO CUANDO NO ES NINGUNA OPCION ANTERIOR
   System.out.println("DIA NO VALIDO");
      }
   


   }
}
