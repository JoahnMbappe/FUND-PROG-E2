/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva2_7_Else_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Temperatura
        //35 muy calido
        //20 agradable
        //10 Cold 
        //Muy frio
        int temp;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuál es la temperatura?: ");
        temp = captu.nextInt();
        if(temp >= 35){
            System.out.println("Muy calido!!");
            
        }else if(temp >= 20){
            System.out.println("Agradable!!");
        
    }else if (temp >= 10){
        System.out.println("Cold!!");
    } else{
            System.out.println("Cold Palmer!!");
    }
    }
    
}
