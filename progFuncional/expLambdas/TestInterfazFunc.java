package expLambdas;

import interfaces.Operacion;
import interfaces.Transformador;

public class TestInterfazFunc {
    public static void main(String[] args) {
        //Imlementar con Lambdas
        Operacion suma = (a, b) -> a + b;
        System.out.println("Suma"+ suma.calcular(5, 10));

        Operacion resta = (y, x) -> x - y;
        System.out.println("Resta: "+ resta.calcular(20, 11));


        //Lambda que transforma string a Mayuscula 
        Transformador<String, String> mayuscula = s -> s.toUpperCase();
        System.out.println(mayuscula.transformar("azeneth"));

    }
    
}
