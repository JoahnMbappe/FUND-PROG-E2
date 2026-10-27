
package eva2_28_do_while;

import java.util.Scanner;

public class Eva2_28_Do_While {

    public static void main(String[] args) {

        Scanner captu = new Scanner(System.in);

        String usu, pwd;
        final String USUARIO = "admin";
        final String CONTRA = "1234";

        do {
            System.out.println("Usuario: ");
            usu = captu.nextLine();

            System.out.println("Contrasenia: ");
            pwd = captu.nextLine();

           

        } while (!(usu.equals(USUARIO)) || !(pwd.equals(CONTRA)));

        System.out.println("ACCESO CONCEDIDO!!");

        captu.close();
    }
}