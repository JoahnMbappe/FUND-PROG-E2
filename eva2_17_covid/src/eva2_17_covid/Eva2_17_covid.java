/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_17_covid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        String enfermedadCronica;
        double peso, estatura, imc;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = captu.nextInt();
        captu.nextLine(); 
        
        System.out.println("Tiene alguna enfermedad cronica (Si / No): ");
        enfermedadCronica = captu.nextLine();
        
        System.out.println("Ingrese su peso en Kg: ");
        peso = captu.nextDouble();
        
        System.out.println("Ingrese su estatura en metros: ");
        estatura = captu.nextDouble();
        
        
        imc = peso / (estatura * estatura);
        System.out.println("Su IMC calculado es: " + imc);
        
        if((edad > 65) || enfermedadCronica == "Si" || (imc >= 25)){
            System.out.println("Persona de riesgo");
        }else {
            System.out.println("No es persona de riesgo");
        }
        
        // PERSONA DE RIESGO (COVID)
        // - Edad es mayor a 65
        // - Tiene alguna enfermedad crónica
        // - Posee un índice de masa corporal (IMC) mayor o igual a 25
        
    }
    
}
