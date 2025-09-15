package genericos;

import java.util.ArrayList;
import java.util.List;

// Clase genérica Bolsa que puede almacenar objetos de cualquier tipo <T>
public class Bolsa<T> {
    private static final int LIMITE = 5;  // máximo permitido
    
    // Lista interna que guarda los productos de la bolsa
    private List<T> productos = new ArrayList<>();

    public void agregar(T producto) {
        if (productos.size() >= LIMITE) {
            throw new IllegalStateException("La bolsa no puede contener más de " + LIMITE + " productos.");
        }
        productos.add(producto);
    }

    //Método que devuelve la lista de productos que contiene la bolsa.
    public List<T> obtenerProductos() {
        return productos;
    }
}
