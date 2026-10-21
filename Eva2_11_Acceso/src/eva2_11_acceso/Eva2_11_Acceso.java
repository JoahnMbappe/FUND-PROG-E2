/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Eva2_11_Acceso {
final static String USUARIO = "admin";
final static String PWD = "12345";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Usuario, pwd;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Ingrese su usuario: ");
        Usuario = captu.nextLine();
        
        System.out.println("Ingrese su password: ");
        pwd = captu.nextLine();
        //usuario.equals(USUARIO) UNA ALTERNATIVA SEGURA PARA COMPARAR CADENAS
        if(Usuario.equals(USUARIO)&& pwd.equals(PWD)){
           
                System.out.println("BIENVENIDO AL SISTEMA");
            
        }else{
            System.out.println("ACCESO DENEGADO");
        }
    }
    
}
