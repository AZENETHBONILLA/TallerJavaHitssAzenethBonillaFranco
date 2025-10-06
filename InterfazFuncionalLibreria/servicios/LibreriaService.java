package servicios;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import entidades.Cliente;
import entidades.Libro;
import entidades.Ventas;

public class LibreriaService {
    // Validar libros con Predicate
    public List<Libro> filtrarLibros(List<Libro> libros, Predicate<Libro> criterio) {
        return libros.stream().filter(criterio).collect(Collectors.toList());
    }

    // Validar clientes con Predicate
    public List<Cliente> filtrarClientes(List<Cliente> clientes, Predicate<Cliente> criterio) {
        return clientes.stream().filter(criterio).collect(Collectors.toList());
    }

    // Transformar libro en resumen con Function
    public String transformarLibro(Libro libro, Function<Libro, String> funcion) {
        return funcion.apply(libro);
    }

    // Generar factura de una venta
    public String generarFactura(Ventas venta, Function<Ventas, String> funcion) {
        return funcion.apply(venta);
    }

    // Ejecutar acción con Consumer
    public void ejecutarAccionCliente(Cliente cliente, Consumer<Cliente> accion) {
        accion.accept(cliente);
    }

    // Generar dato automático con Supplier
    public <T> T generarDato(Supplier<T> proveedor) {
        return proveedor.get();
    }

    // Generar ID automático para libros
    public Supplier<String> generarIdLibro() {
        return () -> "LIB-" + System.currentTimeMillis();
    }

    // Encontrar el libro más caro o más barato usando BinaryOperator
    public Libro encontrarLibro(List<Libro> libros, BinaryOperator<Libro> comparador) {
        return libros.stream().reduce(comparador).orElse(null);
    }

    // Calcular descuento con UnaryOperator
    public int aplicarDescuento(int precio, UnaryOperator<Integer> operacion) {
        return operacion.apply(precio);
    }
}
