package entidades;

import genericos.Idendificable;

public class Cliente implements Idendificable<String>{
    private String id;
    private String nombre;
    
    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", nombre=" + nombre + "}";
    }

    
}
