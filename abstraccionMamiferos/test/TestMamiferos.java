package test;

import mamiferos.Guepardo;
import mamiferos.Leon;
import mamiferos.Lobo;
import mamiferos.Mamifero;
import mamiferos.Perro;
import mamiferos.Tigre;

public class TestMamiferos {

    public static void main(String[] args) {

        // Se crea un arreglo de Mamíferos con capacidad para 6 elementos
        Mamifero[] mamiferos = new Mamifero[6];

        // Se crean distintos objetos de clases hijas de Mamifero
        // Cada uno con sus respectivos atributos (hábitat, altura, largo, peso, especie, etc.)
        Mamifero leon = new Leon("Sabana Africana", 1.2f, 2.5f, 190f,
                "Panthera leo", 7.5f, 80, 12, 114f);

        Mamifero tigre = new Tigre("Selva Asiática", 1.1f, 2.9f, 220f,
                "Panthera tigris", 8.0f, 65, "Tigre de Bengala");

        Mamifero guepardo = new Guepardo("África", 0.9f, 1.5f, 72f,
                "Acinonyx jubatus", 5.0f, 112);

        Mamifero lobo = new Lobo("Bosques de Norteamérica", 0.8f, 1.6f, 50f,
                "Canis lupus", "gris", 6.5f, 8, "Lobo gris");

        Mamifero perroSalvaje = new Perro("Sabana Africana", 0.75f, 1.1f, 30f,
                "Lycaon pictus", "moteado", 4.2f, 340);

        Mamifero otroLeon = new Leon("Sur de África", 1.3f, 2.7f, 210f,
                "Panthera leo", 7.8f, 82, 15, 120f);

        // Se asignan los objetos al arreglo de mamíferos
        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perroSalvaje;
        mamiferos[5] = otroLeon;

        // Se recorre el arreglo con un for-each
        for (Mamifero animal : mamiferos) {
            // Se imprime el nombre de la clase 
            System.out.println("Clase: " + animal.getClass().getSimpleName());
            System.out.println(" Comer: " + animal.comer());
            System.out.println(" Comunicarse: " + animal.comunicarse());
            System.out.println(" Correr: " + animal.correr());
            System.out.println(" Dormir: " + animal.dormir());

            System.out.println("--------------------------------------------------");
        }
    }
}
