package Ciclos;

import java.util.Scanner;

public class CicloDoWhile {
    public static void main(String[] args) {
        //ingresar números, y repetir hasta que se ingrese un cero
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        do {
            System.out.println("Ingresa un numero:");
            i= entrada.nextInt();
        } while (i != 0);

        System.out.println("Ingresaste el valor de i como: "+ i);
    }
    
}
