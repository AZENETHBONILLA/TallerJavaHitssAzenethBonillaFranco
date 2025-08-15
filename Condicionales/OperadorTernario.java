package Condicionales;

public class OperadorTernario {
    public static void main(String[] args) {
        //operador ternario
        int numero = 5;
        String resultado = (numero % 2 == 0) 
                ? "El numero "+ numero + "es par"
                : "El numero "+ numero + "es impar";
        System.out.println(resultado);
    }           
}
