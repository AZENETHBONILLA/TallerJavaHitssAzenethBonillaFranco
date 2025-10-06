package entidades;

import java.time.LocalDate;
import java.util.List;

public class Ventas {
    private Cliente cliente;
    private List<Libro> libros;
    private LocalDate fechaVenta;

    public Ventas(Cliente cliente, List<Libro> libros, LocalDate fechaVenta) {
        this.cliente = cliente;
        this.libros = libros;
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public List<Libro> getLibros() {
        return libros;
    }
    
    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    // Calcular total de la venta
    public double calcularTotal() {
        return libros.stream().mapToDouble(Libro::getPrecio).sum();
    }

    @Override
    public String toString() {
        return "Ventas {cliente=" + cliente + 
                ", libro=" + libros + 
                ", fechaVenta=" + fechaVenta + "]";
    }

}
