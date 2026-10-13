/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_9_Estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas;
        double costo = 0, total;
        System.out.println("Hasta 2 horas: $25 por hora");
            System.out.println("Hasta 5 horas: $50 por hora");
            System.out.println("Hasta 10 horas: $15 por hora");
             System.out.println("Mas de 10 horas: tarifa fija de $150");
        System.out.println("Hasta 2 horas: $25 por hora");
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cuantas horas va a estar estacionado? : ");
        horas = captu.nextInt();
        
        if(horas <= 2){
  System.out.println("Hasta 2 horas: $25 por hora");
            total = (costo + 25.00) * horas;
            System.out.println("Usted va a estar: "+horas +" horas estacionado");
            System.out.println("El costo total sera de: $"+total);
        }else if (horas <= 5){
            System.out.println("Hasta 5 horas: $50 por hora");
            total = (costo +20.00)*5;
            System.out.println("Usted va a estar: "+horas +" horas estacionado");
            System.out.println("El costo total sera de: $"+total);
        } else if(horas <= 10){
            System.out.println("Hasta 10 horas: $15 por hora");
            total = (costo + 15.00)* horas;
            System.out.println("Usted va a estar: "+horas +" horas estacionado");
            System.out.println("El costo total sera de: $"+total);
        }else if (horas >10){
            System.out.println("Mas de 10 horas: tarifa fija de $150");
            total = 150;
            System.out.println("Usted va a estar: "+horas +" horas estacionado");
            System.out.println("El costo total sera de: $"+total);
        } else if(horas < 1){
            System.out.println("Ingrese una hora : ");
        }
            
    }
    
}
