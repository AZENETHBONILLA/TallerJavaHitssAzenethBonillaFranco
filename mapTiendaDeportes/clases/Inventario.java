package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Inventario {
    private Map<Integer, Producto> productosPorCodigo = new HashMap<>(); // Acceso rápido por código (O(1))
    private Map<Integer, Producto> productosOrdenInsercion = new LinkedHashMap<>(); // Orden de inserción
    private Set<Producto> productosOrdenNombre = new TreeSet<>(  // Orden alfabético por nombre
        Comparator.comparing(Producto::getNombreProducto)
    );

    // 1. Registrar producto
    public void registrarProducto(Producto p) {
        if (productosPorCodigo.containsKey(p.getCodigo())) {
            System.out.println(" Código ya existe: " + p.getCodigo());
            return;
        }
        productosPorCodigo.put(p.getCodigo(), p);
        productosOrdenInsercion.put(p.getCodigo(), p);
        productosOrdenNombre.add(p);
    }

    // 2. Consultar producto en O(1)
    public Producto buscarPorCodigo(int codigo) {
        return productosPorCodigo.get(codigo);
    }

    // 3. Reporte en orden de inserción
    public void reporteOrdenInsercion() {
        StringBuilder sb = new StringBuilder();
        sb.append("📋 Reporte - Orden de inserción:\n");
        productosOrdenInsercion.values().forEach(p -> sb.append(p).append("\n"));

        escribirArchivo("reporte_insercion.txt", sb.toString());
    }

    // 4. Reporte en orden alfabético
    public void reporteOrdenNombre() {
        StringBuilder sb = new StringBuilder();
        sb.append("📋 Reporte - Orden alfabético:\n");
        productosOrdenNombre.forEach(p -> sb.append(p).append("\n"));

        escribirArchivo("reporte_alfabetico.txt", sb.toString());
    }

    // 5. Actualizar stock
    public void actualizarStock(int codigo, int cantidad) {
        Producto p = productosPorCodigo.get(codigo);
        if (p != null) {
            p.setStock(p.getStock() + cantidad); // solo modificamos el stock
            System.out.println("Stock actualizado para " + p.getNombreProducto());
        } else {
            System.out.println("Producto no encontrado con código: " + codigo);
        }
    }

    // Método para generar los reportes
    private void escribirArchivo(String nombreArchivo, String contenido) {
        try {
            Path ruta = Paths.get(nombreArchivo);
            Files.writeString(ruta, contenido,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("Reporte generado: " + ruta.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
