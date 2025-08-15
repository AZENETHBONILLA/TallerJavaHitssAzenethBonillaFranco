package Ciclos;

import java.text.DecimalFormat;

public class FormateoNumeros {
    public static void main(String[] args) {
        //Formateo de números
        double numero = 234.45534;
        float numero2 = 2930000.76F;
        System.out.printf("Número: %.2f", numero);
        System.out.printf("\nNúmero 2: %.2f", numero2);

        System.out.println("\n\t_____________String.format__________");
        System.out.println(String.format("Numero: %,.2f", numero2));

        //DecimalFormat
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println("Entero: " + df.format(numero));        
    }
    
}
