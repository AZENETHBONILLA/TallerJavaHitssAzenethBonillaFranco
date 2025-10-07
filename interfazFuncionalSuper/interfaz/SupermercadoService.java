package interfaz;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import entidades.Cliente;
import entidades.Empleado;
import entidades.Producto;
import entidades.Venta;

public class SupermercadoService {
    
    // 1. Filtrar productos con stock bajo
    // Predicate<T> -> Evalúa una condición sobre un objeto T y devuelve true/false
    public List<Producto> filtrarProductos(List<Producto> productos, Predicate<Producto> criterio) {
        return productos.stream().filter(criterio).toList();
    }

    // 2. Calcular total de una venta
    // Function<T, R> -> Recibe un objeto de tipo T y devuelve un resultado de tipo R
    public double calcularTotal(List<Producto> productos, Function<List<Producto>, Double> calculo) {
        return calculo.apply(productos);
    }

    // 3. Imprimir detalles de una venta
    // Consumer<T> -> Recibe un objeto de tipo T y ejecuta una acción, pero no devuelve nada
    public void imprimirVenta(Venta venta, Consumer<Venta> impresor) {
        impresor.accept(venta);
    }

    // 4. Generar producto de muestra
    // Supplier<T> -> No recibe parámetros, pero devuelve un objeto de tipo T
    public Producto generarProducto(Supplier<Producto> generador) {
        return generador.get();
    }

    // 5. Aplicar descuento del 10% a un producto
    // UnaryOperator<T> -> Recibe un objeto T y devuelve otro del mismo tipo T (modificado o transformado)
    public Producto aplicarDescuento(Producto producto, UnaryOperator<Producto> descuento) {
        return descuento.apply(producto);
    }

    // 6. Comparar dos productos y devolver el más caro
    // BinaryOperator<T> -> Recibe dos objetos del mismo tipo T y devuelve uno de ellos (por ejemplo, el mayor)
    public Producto compararProductos(Producto p1, Producto p2, BinaryOperator<Producto> comparador) {
        return comparador.apply(p1, p2);
    }

    // 7. Verificar si un cliente puede acceder a un descuento
    // BiPredicate<T, U> -> Recibe dos objetos (T y U) y devuelve true/false
    public boolean verificarDescuento(Cliente cliente, Venta venta, BiPredicate<Cliente, Venta> verificador) {
        return verificador.test(cliente, venta);
    }

    // 8. Generar ticket de venta
    // BiFunction<T, U, R> -> Recibe dos objetos (T y U) y devuelve un resultado R
    public String generarTicket(Cliente cliente, Venta venta, BiFunction<Cliente, Venta, String> generadorTicket) {
        return generadorTicket.apply(cliente, venta);
    }

    // 9. Notificar a un cliente que su compra fue procesada por un empleado
    // BiConsumer<T, U> -> Recibe dos objetos (T y U) y ejecuta una acción sin devolver nada
    public void notificarCliente(Cliente cliente, Empleado empleado, BiConsumer<Cliente, Empleado> notificador) {
        notificador.accept(cliente, empleado);
    }
}
