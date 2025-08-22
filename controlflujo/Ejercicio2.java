package controlflujo;
import java.util.Scanner;

public class Ejercicio2 {
        public static void main(String[] args) {
            //Bucle for: Buscar el número menor de minimo 10 valores enteros
            
            Scanner entrada = new Scanner(System.in);

            // Pedir cantidad de números a comparar
            System.out.print("Ingrese la cantidad de números a comparar (mínimo 10): ");
            int cantidad = entrada.nextInt();

            // Validar que la cantidad sea al menos 10
            if (cantidad < 10) {
                System.out.println("Debe ingresar al menos 10 números.");
                return; // Finaliza el programa si es menor que 10
            }

            int menor = Integer.MAX_VALUE; // guardar el valor mínimo encontrado, va a comparar los numeros ingresados.

            // Bucle para pedir los números
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                int numero = entrada.nextInt();

                if (numero < menor) {
                    menor = numero; // Actualizar el menor si encontramos uno más pequeño
                }
            }

            // Mostrar el menor número
            System.out.println("El número menor es: " + menor);

            // Comparar con 10
            if (menor < 10) {
                System.out.println("El número menor es menor que 10");
            } else {
                System.out.println("El número menor es igual o mayor que 10");
            }
            entrada.close();
        }  
}    


    

