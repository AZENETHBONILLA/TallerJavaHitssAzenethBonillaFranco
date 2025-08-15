package Ejercicios;

import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class Ejercicio5 {
    public static void main(String[] args) {
        // Ejercicio 5: Un restaurante necesita un programa con menú de opciones.

        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer entradas desde el teclado
        int opcion; // Variable para almacenar la opción seleccionada por el usuario en el menú
        double ventas = 0; // Acumula el total de ventas registradas

        // Bucle principal que se ejecuta hasta que el usuario elija salir (opción 3)
        do {
            // Imprime el menú del restaurante en consola con formato visual
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║        MENÚ RESTAURANTE      ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║  1. Registrar un pedido      ║");
            System.out.println("║  2. Mostrar total de ventas  ║");
            System.out.println("║  3. Salir                    ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Elige una opción: ");
            
            opcion = sc.nextInt(); // Lee la opción ingresada por el usuario

            // Evaluar la opción seleccionada usando switch
            switch (opcion) {
                case 1 -> { // Registrar un pedido
                    System.out.print("Ingresa el precio del pedido: ");
                    double precio = sc.nextDouble(); // Lee el precio del pedido
                    if (precio <= 0) { // Validación: el precio debe ser positivo
                        System.out.println("¡Precio inválido! Debe ser mayor a 0.");
                    } else {
                        ventas += precio; // Acumula el precio en el total de ventas
                        System.out.println("Pedido registrado correctamente.");
                    }
                }
                case 2 -> System.out.println("Total de ventas: $" + ventas); // Mostrar el total de ventas acumuladas
                case 3 -> System.out.println("¡Has salido con éxito!");
                default -> System.out.println("Opción inválida, intenta nuevamente.");
            }

        } while (opcion != 3); // El bucle continúa mientras la opción sea diferente de 3 (salir)

        sc.close();
    }
}
