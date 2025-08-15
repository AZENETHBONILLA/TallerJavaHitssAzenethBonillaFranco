package entradas;

import java.util.Scanner;

public class EjercicioCadenas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre1, nombre2, nombre3, newNombre1, newNombre2, newNombre3;

        System.out.println("Nombre1: ");
        nombre1= entrada.nextLine();
        System.out.println("Nombre2: ");
        nombre2= entrada.nextLine();
        System.out.println("Nombre3: ");
        nombre3= entrada.nextLine();

        newNombre1= nombre1.toUpperCase().charAt(1)+ "."+ nombre1.substring(nombre1.length()-2);
        newNombre2= nombre2.toUpperCase().charAt(1)+ "."+ nombre2.substring(nombre2.length()-2);
        newNombre3= nombre3.toUpperCase().charAt(1)+ "."+ nombre3.substring(nombre3.length()-2);

        String resultado= newNombre1+ "_"+ newNombre2 + "_" + newNombre3 + "_.";
        System.out.println("Resultado:"+ resultado);
    }
    
}
