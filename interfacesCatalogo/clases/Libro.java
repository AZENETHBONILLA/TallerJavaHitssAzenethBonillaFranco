package clases;

import java.time.LocalDate;

import interfaz.ILibro;

public class Libro extends Producto implements ILibro{
    private LocalDate fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial, LocalDate fechaPublicacion) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        // Los libros tienen IVA reducido, 5% más
        return getPrecio() * 1.05;
    }
}



