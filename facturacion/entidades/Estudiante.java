package entidades;

public class Estudiante {
    private Integer Id;
    private String nombre;
    private double calificacion;
    
    public Estudiante(Integer id, String nombre, double calificacion) {
        Id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public Integer getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public String toString() {
        return "{Id=" + Id + ", nombre=" + nombre + ", calificacion=" + calificacion + "}";
    }
    
}
