/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva2_2_califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       double cal;
       Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu calificación?: ");
        cal = captu.nextDouble();
        if(cal > 100){
            System.out.println("Solo calificaciones del 0 al 100: ");
        }
        if(cal >= 70){
            System.out.println("Has aprobado!");
        }else{
            System.out.println("Reprobaste bro, hechale ganas a la proxima :v");
        }
    }
    
}
