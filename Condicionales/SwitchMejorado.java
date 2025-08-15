package Condicionales;

public class SwitchMejorado {
    public static void main(String[] args) {
        int numero = 3;
        switch (numero) {
            case 1 -> System.out.println("Día lunes");
            case 2 -> System.out.println("Dias martes");
            default-> {}
        }
    
    int a = 10, b = 4;
    char operador = '+';
    int resultado = switch(operador){
        case '+'-> a+b;
        case '-'-> a-b;
        default -> 0;
    };
    System.out.println("Resultado: "+ resultado);
    
    }
}
