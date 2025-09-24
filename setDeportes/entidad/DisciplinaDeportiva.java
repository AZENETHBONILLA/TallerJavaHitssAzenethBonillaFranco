package entidad;

import java.util.Set;

public class DisciplinaDeportiva {
    private String nombre;
    private Set<Jugador> jugadores;

    public DisciplinaDeportiva(String nombre, Set<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public String getNombre() { 
        return nombre; 
    }

    public Set<Jugador> getJugadores() { 
        return jugadores; 
    }

    public boolean registrarJugador(Jugador j) {
        return jugadores.add(j); // evita duplicados
    }

    public boolean eliminarJugador(Jugador j) {
        return jugadores.remove(j);
    }

    public boolean eliminarJugador(int id) {
        return jugadores.removeIf(j -> j.getId() == id);
    }

    public boolean estaInscrito(Jugador j) {
        return jugadores.contains(j);
    }

    public void mostrarJugadores() {
        System.out.println("Jugadores en " + nombre + ": " + jugadores);
    }
}