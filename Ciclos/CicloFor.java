package Ciclos;

public class CicloFor {
    public static void main(String[] args) {
        //Ciclo for
        //break: corta la ejecución y termina el ciclo, mediante una condición.
        //continue : no ejecuta el resto de la iteración actual
        for(int i=1; i<=10; ++i){
            if (i == 5) {
                System.out.println("Se omite la impresion de valor de i.");
                continue;
            }
            System.out.println("Número: "+ i);
        }
    }
    
}
