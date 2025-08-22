package arreglos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el tamaño de la matriz cuadrada
        System.out.println("Ingresa el número para la matriz:");
        int n = sc.nextInt();

        // Validar que n no sea cero
        if (n == 0) {
            System.out.println("ERROR");
            return; // Si es 0, termina el programa inmediatamente
        }

        // Recorrer la matriz con dos bucles anidados
        for (int i = 0; i < n; i++) {        // Recorre las filas
            for (int j = 0; j < n; j++) {    // Recorre las columnas

                // Condición para imprimir "X" en las dos diagonales
                if (i == j || j == (n - 1 - i)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            // Al terminar una fila, se hace un salto de línea
            System.out.println();
        }

        sc.close();
    }
}
