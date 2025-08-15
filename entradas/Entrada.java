package entradas;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //NombreClase nombreObjeto = new NombreConstructor() (NombreClase)
        Scanner entrada = new Scanner(System.in); //recibir del usuario valores

        int edad;
        String nombre;
        //print en la misma linea 
        System.out.println("Ingresa su nombre: ");
        //nombre = entrada.nextLine();
        nombre=entrada.next();
        System.out.println("Ingresa tu edad:");
        edad= entrada.nextInt();

        System.out.println("Hola, su nombre es:"+ nombre +" y tu edad es:"+ edad);
        entrada.close();
    }
    
}
