/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva2_4_Ejercicios_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        double Sal, bon, salfin;
        Scanner captu = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        nombre = captu.nextLine();
        System.out.println("Ingrese su salario: ");
        Sal = captu.nextDouble();
        
        if (Sal < 12000){
            salfin = (Sal * 0.10) + Sal;
            System.out.println("Hola "+ nombre + ", Tu salario es menor a 12,000. Te otorgaremos un bono del 10%: "+ salfin);
        }else{
            salfin = (Sal * 0.05) + Sal;
            System.out.println("Hola "+ nombre + ", Tu salario es mayor a 12,000. Te otorgaremos un bono del 5%: "+ salfin);
        }
    }
    
}
