/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejerciciosif;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva2_3_Ejerciciosif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pre, desc, canfin, prefin;
        int cant;
        String nomprod;
        Scanner captu = new Scanner(System.in);
        System.out.println("Escriba el nombre de un producto");
        nomprod = captu.nextLine();
        System.out.println("Escriba el precio del producto");
        pre = captu.nextDouble();
        captu.nextLine();
        System.out.println("Escriba la cantidad de pruductos");
        cant = captu.nextInt();
        prefin = pre * cant;
        
        if (prefin >= 1000){
            desc = prefin - (prefin * 0.10);
            System.out.println("El Subtotal es: " + prefin);
            System.out.println("El nombre del producto es: " + nomprod );
            System.out.println("El precio total es: (Incluye descuento del 10%): " + desc );
        } else{
            System.out.println("El nombre del producto es: " + nomprod );
            System.out.println("El precio total es: "+ prefin);
        }
    }
    
}
