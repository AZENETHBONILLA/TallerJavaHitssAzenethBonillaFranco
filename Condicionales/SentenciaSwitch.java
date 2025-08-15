package Condicionales;

public class SentenciaSwitch {
    public static void main(String[] args) {
        int numero= 1;

        System.out.println("¿Qué dia de la semana es?");
        switch(numero){
            case 1: 
                System.out.println("Dia lunes");
                break;
            case 2:
                System.out.println("Día martes");
                break;
            case 3: 
                System.out.println("Dia miercoles");
                break;
            case 4:
                System.out.println("Día jueves");
                break;
                // si no existe el break se ejecuta en forma de cascada
            case 5: 
                System.out.println("Dia viernes");
                break;
            case 6:
                System.out.println("Día sabado");
                break;
            case 7:
                System.out.println("Día domingo");
                break;
            
            default:
                System.out.println("Dia invalido");
        }
        System.out.println("Sigue con el flujo del programa"); 
    }
}
