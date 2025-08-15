package Ciclos;

import java.util.Scanner;

public class SumaCero {
    public static void main(String[] args) {
        //Sumar número solicitado al usuario.
        //mientras el valor del número no sea cero 
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingresa el numero a sumar: ");
        numero= entrada.nextInt();

        while (numero != 0) {
            suma += numero; // suma = suma + numero;
            System.out.println("Ingresa el numero: ");
            numero = entrada.nextInt();
        }

        System.out.println("Suma total: "+ suma);
        entrada.close();
        
    }
    
}
