package clases;

public abstract class Producto {
    //Atributos protected, visibles para clases hijas
    protected String nombre;
    protected double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

}
