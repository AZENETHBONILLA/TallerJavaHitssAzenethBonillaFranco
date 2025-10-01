package expLambdas;
import interfaces.SinSignos;

public class TestLambda {
    public static void main(String[] args) {
        // Expresión lambda
        SinSignos<String, String> limpiarFrase = frase -> 
            frase.replaceAll("[ ,.]", "")  // elimina espacios, comas y puntos
                 .toUpperCase();           // convierte a mayúsculas

        // Ejemplo
        String original = "Hola, soy yo. Esto es una prueba.";

        System.out.println("Frase original: " + original);
        System.out.println("Frase procesada: " + limpiarFrase.procesar(original));
    }
}


