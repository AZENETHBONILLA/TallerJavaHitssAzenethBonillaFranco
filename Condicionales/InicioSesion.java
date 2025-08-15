package Condicionales;

import java.util.Scanner;

public class InicioSesion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String username, password;

        System.out.println("Argumentos");
        System.out.println("Valor de args [0]: "+ args[0]);
        System.out.println("Valor de args [1]"+ args[1]);

        System.out.println("Ingrese el username:");
        username = entrada.next();

        System.out.println("Ingrese el password:");
        password = entrada.next();

        if (username.equals("erxss") && password.equals("12345") ) {
            System.out.println("Bienvenido al sistema.");
        } else{
            System.out.println("Usuario incorrecto");
        }
    }
}
