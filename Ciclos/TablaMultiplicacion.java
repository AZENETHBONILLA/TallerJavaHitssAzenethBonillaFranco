package Ciclos;

import java.util.Scanner;

public class TablaMultiplicacion {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        System.out.print("Número de tabla: ");
        numero= entrada.nextInt();
        System.out.println("Tabla de multiplicar del número: "+ numero);

        for(int i=1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i) );
        }

        entrada.close();
    }  
}    

