package entidades;

public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private int precio;
    
    public Libro(String titulo, String autor, int añoPublicacion, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Libro {titulo=" + titulo + 
                ", autor=" + autor + 
                ", añoPublicacion=" + añoPublicacion + 
                ", precio=" + precio + "}";
    }

}
