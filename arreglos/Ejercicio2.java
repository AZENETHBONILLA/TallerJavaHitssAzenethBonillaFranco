package arreglos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] enteros = new int[10]; // Siempre serán 10 números

        // Pedimos los valores al usuario
        System.out.println("Ingresa 10 números (del 1 al 9):");
        for (int i = 0; i < enteros.length; i++) {
            int numero;
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = sc.nextInt();

                if (numero < 1 || numero > 9) {
                    System.out.println("El número debe estar entre 1 y 9.");
                }
            } while (numero < 1 || numero > 9); // Repite si no está en el rango

            enteros[i] = numero;
        }

        int mayorOcurrencias = 0;  // Guarda la cantidad máxima encontrada
        int numeroMasRepetido = 0; // Guarda el número que más se repite

        // Recorremos el arreglo
        for (int i = 0; i < enteros.length; i++) {
            int contador = 0;

            // Comparamos el elemento en la posición i con todos los elementos del arreglo
            for (int j = 0; j < enteros.length; j++) {
                if (enteros[i] == enteros[j]) {
                    contador++;
                }
            }

            // Si encontramos un número con más repeticiones, lo actualizamos
            if (contador > mayorOcurrencias) {
                mayorOcurrencias = contador;
                numeroMasRepetido = enteros[i];
            }
        }

        // Resultados
        System.out.println("La mayor ocurrencia es: " + mayorOcurrencias);
        System.out.println("El elemento que más se repite es: " + numeroMasRepetido);

        sc.close();
    }
}
