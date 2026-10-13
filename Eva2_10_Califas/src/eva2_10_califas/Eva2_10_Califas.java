/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_10_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double Cal;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = captu.nextLine();
        System.out.println("Ingrese su promedio final: ");
        Cal = captu.nextDouble();
        
        if(Cal < 0){
            System.out.println("Dato invalido");
        }else if (Cal > 100){
            System.out.println("Dato invalido");
        } else if(Cal < 70){
            System.out.println("Alumno: "+nombre);
            System.out.println("No pasaste pa :c");
        } else if (Cal <80){
            System.out.println("Alumno: "+nombre);
            System.out.println("Si pasaste pa :D");
            
        } else if(Cal <90){
            System.out.println("Alumno: "+nombre);
            System.out.println("Bueno");
        } else if(Cal >=90){
            System.out.println("Alumno: "+nombre);
            System.out.println("Te luciste pa");
        }
    }
    
}
