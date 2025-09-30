package inventario;

import clases.Categoria;
import clases.Inventario;
import clases.Producto;

public class TestInventario {
    public static void main(String[] args) {
       Inventario inventario = new Inventario();

        // Registrar productos
        inventario.registrarProducto(new Producto(125, "Raqueta", 25, Categoria.D));
        inventario.registrarProducto(new Producto(101, "Balón", 50, Categoria.A));
        inventario.registrarProducto(new Producto(202, "Camiseta", 30, Categoria.B));
        inventario.registrarProducto(new Producto(303, "Tenis", 20, Categoria.L));
        inventario.registrarProducto(new Producto(404, "Guantes", 15, Categoria.G));

        // Consultar producto por código
        System.out.println("Consulta por código 101: " + inventario.buscarPorCodigo(101));

        // Reportes
        inventario.reporteOrdenInsercion();
        inventario.reporteOrdenNombre();

        // Actualizar stock
        inventario.actualizarStock(101, -5); // vender 5 balones
        inventario.actualizarStock(202, 10); // llegaron 10 camisetas más
        inventario.actualizarStock(999, 5);  // código inexistente

        // Consultar después de actualizar
        System.out.println("Consulta por código 101 después de venta: " + inventario.buscarPorCodigo(101));
        System.out.println("Consulta por código 202 después de entrada: " + inventario.buscarPorCodigo(202));

        // Generar nuevamente reportes para ver cambios
        inventario.reporteOrdenInsercion();
        inventario.reporteOrdenNombre();
    }
}
