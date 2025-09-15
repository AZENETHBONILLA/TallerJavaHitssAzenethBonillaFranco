package entidades;

import genericos.Idendificable;

public class Producto implements Idendificable<Integer>{
    private Integer id;
    private String descripcion;
    private double precio;
    
    public Producto(Integer id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + "}";
    }

    
    

    
    
}
