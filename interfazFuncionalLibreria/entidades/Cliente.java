package entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private int edad;
    private List<Ventas> historialCompras = new ArrayList<>();
    
    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<Ventas> getHistorialCompras() {
        return historialCompras;
    }

    public void agregarCompra(Ventas venta) {
        historialCompras.add(venta);
    }

    @Override
    public String toString() {
        return "Cliente {nombre=" + nombre + 
                ", edad=" + edad + "}";
    }

}
