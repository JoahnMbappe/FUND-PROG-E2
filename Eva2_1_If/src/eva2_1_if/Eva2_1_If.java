/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva2_1_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //las {} son bloques de codigo
        // TODO code application logic here
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        edad = captu.nextInt();
        
        //parentesis obligatorios, dentro la expresion condicional (verdadero o falso)
        if(edad >= 18){ //Que hacemos si es verdad
            System.out.println("Puedes entrar!, eres mayor de edad");
        } else{ //Que hacemos si es falso, es opcional
            System.out.println("No puedes entrar, eres menor de edad! (le da su estatequieto)");
        }
    }
    
}
