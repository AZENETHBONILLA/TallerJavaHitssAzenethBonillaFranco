package clase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Vuelo {
    private String nombre;
    private String origen;
    private LocalDateTime fechaHoraLlegada;
    private int numPasajeros;

    public Vuelo(String nombre, String origen, LocalDate fecha, LocalTime hora, int numPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.fechaHoraLlegada = LocalDateTime.of(fecha, hora);
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public LocalDateTime getFechaHoraLlegada() {
        return fechaHoraLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

        @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE dd MMM yyyy HH:mm:ss", Locale.ENGLISH);
        return nombre + ": " + origen +
                ", aterriza el " + fechaHoraLlegada.format(formatter) +
                ", Pasajeros: " + numPasajeros;
    }

}

