package Ciclos;

import java.util.Scanner;

public class ManejoNumero {
    public static void main(String[] args) {
        //El usuario debe ingresar un número entero, si no, 
        //si escribe texto o caracteres especiales, 
        //el programa mandara un aviso, hasta que ingrese un valor entero 

        int entero = 0;
        Scanner entrada = new Scanner(System.in);
        boolean esValido = false;

        do {
            System.out.println("Ingresa el valor:");
            esValido = entrada.hasNextInt();
            if (esValido) {
                entero = entrada.nextInt();
                entrada.close();
            } else{
                System.out.println("No es una entrada numérica");
                entrada.nextLine();
            }
            
        } while (!esValido);
        
        System.out.println("Numero: "+ entero);
        entrada.close();
    }
    
}
