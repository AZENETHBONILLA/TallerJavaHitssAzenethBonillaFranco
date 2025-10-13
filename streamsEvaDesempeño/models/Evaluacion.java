package models;

public class Evaluacion {
    private int anio;
    private int puntaje; // de 1 a 100

    public Evaluacion(int anio, int puntaje) {
        this.anio = anio;
        this.puntaje = puntaje;
    }

    public int getAnio() {
        return anio;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Año: " + anio + ", Puntaje: " + puntaje;
    }
}
