/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_16_Descuento {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        String esEstudiante;
        String credencialVigente = "No";
        String credencialInsen = "No";
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = captu.nextInt();
        captu.nextLine(); 
        
        System.out.println("Es estudiante (Si / No): ");
        esEstudiante = captu.nextLine();
        
        if(esEstudiante == "Si") {
            System.out.println("Posee credencial vigente (Si / No): ");
            credencialVigente = captu.nextLine();
        }
        
        if(edad > 60) {
            System.out.println("Posee credencial del INSEN (Si / No): ");
            credencialInsen = captu.nextLine();
        }
        
        if((edad < 18) || (esEstudiante=="Si" && credencialVigente=="Si") || (edad > 60 && credencialInsen=="Si")){
            System.out.println("Tiene descuento en el autobus");
        }else {
            System.out.println("No tiene descuento en el autobus");
        }
        
        // DESCUENTO EN AUTOBÚS
        // - Es menor de edad
        // - Es estudiante (debe poseer credencial vigente)
        // - Es tiene más de 60 años, con credencial del INSEN
        
    }
    
}
