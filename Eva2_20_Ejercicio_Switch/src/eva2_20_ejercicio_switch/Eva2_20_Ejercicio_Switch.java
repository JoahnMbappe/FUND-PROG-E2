/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_20_Ejercicio_Switch {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      // calculadora
      // pedir valores enteros,
      //pedir la operacion: usar switch
      //1 suma
      //2 resta
      //3 multiplicacion
      //4 division
      //cualquier otro valor --> operacion invalida
      // mostrar el resultado
      
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el primer valor entero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingresa el segundo valor entero: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Elige una operacion:");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        int operacion = scanner.nextInt();
        
        double resultado; 
        
        
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case 4:
                
                    resultado = num1 / num2;
               
                  System.out.println("El resultado es: " + resultado);
                
                break;
            default:
                System.out.println("Operación inválida");
               
                break;
        }
        
        
   }
   
}
