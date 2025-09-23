package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import clase.Vuelo;

public class TestVuelos {
    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();

        // === Vuelos de la tabla ===
        vuelos.add(new Vuelo("AAL 933", "New York", LocalDate.of(2021, 8, 29), LocalTime.of(5, 39), 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", LocalDate.of(2021, 8, 31), LocalTime.of(4, 45), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", LocalDate.of(2021, 8, 30), LocalTime.of(16, 0), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", LocalDate.of(2021, 8, 29), LocalTime.of(13, 22), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", LocalDate.of(2021, 8, 31), LocalTime.of(14, 5), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", LocalDate.of(2021, 8, 31), LocalTime.of(5, 20), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", LocalDate.of(2021, 8, 30), LocalTime.of(8, 45), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", LocalDate.of(2021, 8, 29), LocalTime.of(7, 41), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", LocalDate.of(2021, 8, 30), LocalTime.of(10, 35), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", LocalDate.of(2021, 8, 29), LocalTime.of(9, 14), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", LocalDate.of(2021, 8, 31), LocalTime.of(8, 33), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", LocalDate.of(2021, 8, 31), LocalTime.of(15, 15), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", LocalDate.of(2021, 8, 30), LocalTime.of(8, 14), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", LocalDate.of(2021, 8, 29), LocalTime.of(22, 53), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", LocalDate.of(2021, 8, 31), LocalTime.of(9, 57), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", LocalDate.of(2021, 8, 31), LocalTime.of(4, 0), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", LocalDate.of(2021, 8, 29), LocalTime.of(7, 45), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", LocalDate.of(2021, 8, 30), LocalTime.of(7, 12), 58));
        vuelos.add(new Vuelo("LAT 501", "París", LocalDate.of(2021, 8, 29), LocalTime.of(18, 29), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", LocalDate.of(2021, 8, 30), LocalTime.of(15, 45), 39));

        // Ordenar por llegada ascendente
        vuelos.sort(Comparator.comparing(Vuelo::getFechaHoraLlegada));
        System.out.println("Listado ordenado por fecha llegada ascendente:");

        //Enumerar los vuelos del 1-20
        int i = 1;
        for (Vuelo v : vuelos) {
            System.out.println(i + ". " + v);
            i++;
        }

        // Último vuelo en llegar 
        Vuelo ultimo = Collections.max(vuelos, Comparator.comparing(Vuelo::getFechaHoraLlegada));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy", Locale.ENGLISH);

        System.out.println("\nEl último vuelo en llegar es " + ultimo.getNombre() + ": "
                + ultimo.getOrigen() + ", aterriza el " + ultimo.getFechaHoraLlegada().format(formatter));

        //Vuelo con menor número de pasajeros
        Vuelo menor = Collections.min(vuelos, Comparator.comparing(Vuelo::getNumPasajeros));

        System.out.println("El vuelo con menor número de pasajeros es " + menor.getNombre() + ": "
                + menor.getOrigen() + ", con " + menor.getNumPasajeros() + " pasajeros.");
    }
}

