package Condicionales;

public class CondicionalMultiple {
    public static void main(String[] args) {
        //Identificar si un número dado es positico, negativo o cero.
        int numero= 10;

        if(numero > 0 ){
            System.out.println("El número "+ numero+ " es positivo");
            if (true) {
                System.out.println("If dentro de una condicional.");
            }
        } else if(numero < 0){
            System.out.println("El número "+ numero+ " es positivo");
        } else{
            //Alt + Flecha Arriba (Abajo) --> mover código
            //Shift + Alt + Flecha Abajo (Arriba) --> duplica código
            System.out.println("El número "+ numero + "es cero."); 
        }
    }
}
