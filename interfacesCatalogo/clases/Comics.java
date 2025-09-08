package clases;

import java.time.LocalDate;

public class Comics extends Libro {
    private String personaje;

    public Comics(int precio, String autor, String titulo, String editorial, LocalDate fechaPublicacion, String personaje) {
        super(precio, autor, titulo, editorial, fechaPublicacion);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        // Cómics con margen del 10%
        return getPrecio() * 1.10;
    }
}



