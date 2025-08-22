package arreglos;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];   // Se crea un arreglo de tamaño 10 para guardar números enteros

        // Leer 10 números
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": "); 
            numeros[i] = sc.nextInt(); // Se van guardando los valores introducidos en el arreglo
        }

        // Mostrar en el orden solicitado
        System.out.println("Orden especial:");
        for (int i = 0; i < numeros.length / 2; i++) {
            // Imprime primero un número desde el final hacia el inicio
            System.out.print(numeros[numeros.length - 1 - i] + " ");
            // Luego imprime un número desde el inicio hacia el final
            System.out.print(numeros[i] + " ");
        }

        sc.close(); // Cierra el Scanner
    }
}
