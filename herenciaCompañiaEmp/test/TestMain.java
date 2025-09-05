package test;

import clases.Gerente;


public class TestMain{
    public static void main(String[] args) {
        //Crear objeto tipo gerente
        Gerente gerente = new Gerente("Azeneth", "Bonilla", "RFC123456ABC", "Av. Ramirez", 25000, 150000);

        //Imprimir datos iniciales del gerente
        System.out.println("========== Datos del gerente =========");
        System.out.println(gerente);

        System.out.println("\nActualizando Remuneracion y presupuesto");
         // Aumentar remuneración
        gerente.aumentarRemuneracion(12);
         // Modificar presupuesto
        gerente.setPresupuesto(175000);
        // Imprimir datos actualizados
        System.out.println(gerente);
    
    }
}