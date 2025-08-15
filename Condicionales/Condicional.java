package Condicionales;

public class Condicional {
    public static void main(String[] args) {
        int edad = 19;
        //Puedo omitir las llaves, pero tomar en cuenta la identación.
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        else{
            System.out.println("Eres menor de edad.");
        }
        System.out.println("Continuará...");
    }
}
