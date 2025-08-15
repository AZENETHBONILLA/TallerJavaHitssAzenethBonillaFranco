package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Ejercicio 4: Menú interactivo con opciones básicas de administración de productos
        
        Scanner sc = new Scanner(System.in);
        int opcion; // Almacena la opción seleccionada por el usuario

        // Bucle do-while para mostrar el menú repetidamente
        do {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║         MENÚ PRINCIPAL       ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║  1. Actualizar               ║");
            System.out.println("║  2. Eliminar                 ║");
            System.out.println("║  3. Crear                    ║");
            System.out.println("║  4. Listar                   ║");
            System.out.println("║  5. Salir                    ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print(" Elige una opción: ");
            opcion = sc.nextInt();

            // Procesar la opción seleccionada con switch
            switch (opcion) {
                case 1 -> System.out.println("Usuario actualizado correctamente");
                case 2 -> System.out.println("Usuario eliminado correctamente");
                case 3 -> System.out.println("Usuario creado correctamente");
                case 4 -> System.out.println("Usuario listado correctamente");
                case 5 -> System.out.println("¡Has salido con éxito!");
                default -> System.out.println("Opción inválida, intenta nuevamente.");
            }

        } while (opcion != 5); // Repite hasta que se elija salir

        // Cierre del Scanner
        sc.close();
    }
}
