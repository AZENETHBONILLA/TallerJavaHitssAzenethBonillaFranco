package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Ejercicio 3: Solicitar 20 calificaciones (escala del 1 al 10)
        Scanner entrada = new Scanner(System.in);

        // Variables para almacenar las notas y sumatorias
        double nota;
        double sumaMayoresIgual6 = 0; // Suma de calificaciones >= 6
        double sumaMenores6 = 0;      // Suma de calificaciones < 6
        double sumaTotal = 0;         // Suma de todas las calificaciones

        // Contadores para clasificar las notas
        int contadorMayoresIgual6 = 0; // Cantidad de notas >= 6
        int contadorMenores6 = 0;      // Cantidad de notas < 6
        int contadorIgual1 = 0;        // Cantidad de notas exactamente igual a 1

        System.out.println("Notas finales de los alumnos.");

        // Bucle para ingresar las 20 notas
        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = entrada.nextDouble();

            // Validación: la nota debe estar en el rango [1, 10]
            // Si no cumple, se detiene el programa
            if (nota < 1 || nota > 10) {
                System.out.println("Error: nota inválida (menor que 1 o mayor que 10). Programa finalizado.");
                return;
            }

            // Acumular la suma total
            sumaTotal += nota;

            // Clasificar la nota según el umbral de 6
            if (nota >= 6) {
                sumaMayoresIgual6 += nota;
                contadorMayoresIgual6++;
            } else {
                sumaMenores6 += nota;
                contadorMenores6++;
            }

            // Contar cuántas notas son exactamente igual a 1
            if (nota == 1) {
                contadorIgual1++;
            }
        }

        // Cálculo de promedios utilizando el operador ternario
        // Esto evita divisiones entre cero si no existen notas en una categoría
        double promedioMayoresIgual6 = 
            contadorMayoresIgual6 > 0 ? (sumaMayoresIgual6 / contadorMayoresIgual6) : 0;
        double promedioMenores6 = 
            contadorMenores6 > 0 ? (sumaMenores6 / contadorMenores6) : 0;

        // Promedio total (siempre se divide entre 20, ya que el bucle asegura 20 notas válidas)
        double promedioTotal = sumaTotal / 20;

        // Salida de resultados
        System.out.println("Promedio de notas >= 6: " + promedioMayoresIgual6);
        System.out.println("Promedio de notas < 6: " + promedioMenores6);
        System.out.println("Cantidad de notas iguales a 1: " + contadorIgual1);
        System.out.println("Promedio total: " + promedioTotal);

        
        entrada.close();
    }
}
