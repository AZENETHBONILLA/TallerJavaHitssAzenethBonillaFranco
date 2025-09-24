package entidad;

public class Jugador implements Comparable<Jugador> {
    private int id;
    private String nombre;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", nombre=" + nombre + "}";
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public int hashCode() {
        return nombre == null ? 0 : nombre.toLowerCase().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jugador other = (Jugador) obj;
        if (this.nombre == null) return other.nombre == null;
        return this.nombre.equalsIgnoreCase(other.nombre);
    }
}
