package controlflujo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Bucle for: Implementación de multiplicación mediante sumas sucesivas
        
        Scanner entrada = new Scanner(System.in);

        // Declaración de dos números enteros (pueden ser positivos o negativos)
        int a, b;
        System.out.print("Ingresa el primer número: ");
        a = entrada.nextInt();
        System.out.print("Ingresa el segundo número:");
        b = entrada.nextInt();

        // Variable para almacenar el resultado de la multiplicación
        int resultado = 0;

        // Variable booleana para determinar si el resultado final debe ser negativo
        boolean negativo = false;

        // Comprobación y manejo de signo del primer número
        // Si 'a' es negativo, se convierte a positivo y se cambia el indicador de signo
        if (a < 0) {
            a = -a;           // Convierte 'a' a su valor absoluto
            negativo = !negativo; // Alterna el valor del indicador de signo
        }

        // Comprobación y manejo de signo del segundo número
        if (b < 0) {
            b = -b;           // Convierte 'b' a su valor absoluto
            negativo = !negativo; // Alterna nuevamente el indicador de signo
        }

        // Multiplicación por sumas sucesivas
        // Se suma 'a' a 'resultado', 'b' veces
        for (int i = 0; i < b; i++) {
            resultado += a;
        }

        // Si el indicador de signo es verdadero, el resultado se convierte a negativo
        if (negativo) {
            resultado = -resultado; 
        }

        // Muestra el resultado final
        System.out.println("El resultado es: " + resultado);
        entrada.close();
    }
}
