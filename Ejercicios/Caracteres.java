package Ejercicios;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        // Saber si el caracter dado por el usuario es una vocal, consonante, número o carácter especial
        Scanner entrada = new Scanner(System.in);
        char caracter;

        System.out.print("Ingresa un caracter: ");
        caracter = entrada.next().charAt(0); // tomamos solo el primer caracter

        // Verificar si es vocal
        if ("aeiouAEIOU".contains(String.valueOf(caracter))) {
            System.out.println("Es una vocal.");
        }
        // Verificar si es consonante
        else if (Character.isLetter(caracter)) {
            System.out.println("Es una consonante.");
        }
        // Verificar si es número
        else if (Character.isDigit(caracter)) {
            System.out.println("Es un número.");
        }

        // Si no es vocal, consonante ni número, es carácter especial
        else {
            System.out.println("Es un carácter especial.");
        }

        entrada.close();
    }
}
