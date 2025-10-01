package expLambdas;

import java.util.*;
import java.util.stream.Collectors;

import interfaces.Repeticiones;

public class TestRepeticiones {
    public static void main(String[] args) {
        // Expresión lambda: recibe una frase y devuelve un Map con la palabra más repetida
        Repeticiones<String, Map<String, Integer>> masRepetida = frase -> {
            // Convertir la frase en lista de palabras
            String[] palabras = frase.split("\\s+");

            // Contar repeticiones usando groupingBy
            Map<String, Long> conteo = Arrays.stream(palabras)
                    .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

            // Encontrar la palabra más repetida
            Map.Entry<String, Long> maxEntry = conteo.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .orElseThrow();

            // Devolver en un Map<String, Integer>
            return Map.of(maxEntry.getKey(), maxEntry.getValue().intValue());
        };

        // Probar la lambda
        String frase = "hola mundo hola java hola mundo java hola";
        Map<String, Integer> resultado = masRepetida.repeticiones(frase);

        // Mostrar el resultado
        resultado.forEach((palabra, cantidad) -> 
             System.out.println("Palabra más repetida: " + palabra + " (" + cantidad + " veces)")
        );

    }
}
