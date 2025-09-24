package deportes;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entidad.DisciplinaDeportiva;
import entidad.Jugador;


public class deportes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos disciplinas con distintos tipos de Set
        DisciplinaDeportiva futbol = new DisciplinaDeportiva("Fútbol", new HashSet<>());  
                            // HashSet -> no garantiza orden, solo asegura que no haya duplicados
        DisciplinaDeportiva basquet = new DisciplinaDeportiva("Básquetbol", new LinkedHashSet<>());
                            // LinkedHashSet -> mantiene el orden en el que se insertan los jugadores
        DisciplinaDeportiva volei = new DisciplinaDeportiva("Vóleibol", new TreeSet<>());
                            // TreeSet -> mantiene los jugadores ordenados automáticamente (por nombre, usando compareTo)

        // Datos de prueba
        futbol.registrarJugador(new Jugador(1, "Ana"));
        futbol.registrarJugador(new Jugador(2, "Luis"));
        basquet.registrarJugador(new Jugador(3, "Carlos"));
        basquet.registrarJugador(new Jugador(4, "Ana")); // misma persona, distinto deporte
        volei.registrarJugador(new Jugador(5, "Pedro"));
        volei.registrarJugador(new Jugador(6, "Maria"));

        int opcion;
        do {
            System.out.println("\n╔══════════════════════════════════════════════════════════╗");
            System.out.println("║                       MENÚ TORNEO                        ║");
            System.out.println("╠══════════════════════════════════════════════════════════╣");
            System.out.println("║  1. Mostrar jugadores por deporte                        ║");
            System.out.println("║  2. Contar jugadores en cada disciplina                  ║");
            System.out.println("║  3. Fusionar equipos (Fútbol + Básquetbol)               ║");
            System.out.println("║  4. Ver jugadores en común (Fútbol y Básquetbol)         ║");
            System.out.println("║  5. Transferir un jugador de Básquetbol a Fútbol         ║");
            System.out.println("║  6. Mostrar todos los jugadores ordenados por nombre     ║");
            System.out.println("║  7. Mostrar todos los jugadores en orden de inscripción  ║");
            System.out.println("║  8. Mostrar ranking de jugadores por ID                  ║");
            System.out.println("║  9. Agregar jugador a una disciplina                     ║");
            System.out.println("║ 10. Eliminar jugador de una disciplina                   ║");
            System.out.println("║ 11. Salir                                                ║");
            System.out.println("╚══════════════════════════════════════════════════════════╝");
            System.out.print(" Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: // Mostrar jugadores por deporte
                    futbol.mostrarJugadores();
                    basquet.mostrarJugadores();
                    volei.mostrarJugadores();
                    break;

                case 2: // Contar jugadores en cada disciplina
                    System.out.println("Fútbol: " + futbol.getJugadores().size());
                    System.out.println("Básquetbol: " + basquet.getJugadores().size());
                    System.out.println("Vóleibol: " + volei.getJugadores().size());
                    break;

                case 3: // Unión de jugadores de fútbol y básquetbol
                    Set<Jugador> union = new HashSet<>(futbol.getJugadores());
                    union.addAll(basquet.getJugadores());
                    System.out.println("Entrenamiento conjunto (Fútbol + Básquet): " + union);
                    break;

                case 4: // Intersección: jugadores en común entre fútbol y básquetbol
                    Set<Jugador> interseccion = new HashSet<>(futbol.getJugadores());
                    interseccion.retainAll(basquet.getJugadores());
                    System.out.println("Jugadores en común (Fútbol y Básquet): " + interseccion);
                    break;

                case 5: // Transferir jugador de básquet a fútbol
                    System.out.print("ID del jugador a transferir: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Jugador jugadorTransferir = null;
                    for (Jugador j : basquet.getJugadores()) {
                        if (j.getId() == id) {
                            jugadorTransferir = j;
                            break;
                        }
                    }
                    if (jugadorTransferir != null) {
                        basquet.eliminarJugador(jugadorTransferir);
                        futbol.registrarJugador(jugadorTransferir);
                        System.out.println("Jugador transferido.");
                    } else {
                        System.out.println("Jugador no encontrado en básquetbol.");
                    }
                    break;

                case 6: // Mostrar todos los jugadores ordenados por nombre (TreeSet usa compareTo)
                    Set<Jugador> ordenadosPorNombre = new TreeSet<>();
                    ordenadosPorNombre.addAll(futbol.getJugadores());
                    ordenadosPorNombre.addAll(basquet.getJugadores());
                    ordenadosPorNombre.addAll(volei.getJugadores());
                    System.out.println("Todos los jugadores (orden alfabético): " + ordenadosPorNombre);
                    break;

                case 7: // Mostrar todos en orden de inscripción
                    Set<Jugador> ordenInscripcion = new LinkedHashSet<>();
                    ordenInscripcion.addAll(futbol.getJugadores());
                    ordenInscripcion.addAll(basquet.getJugadores());
                    ordenInscripcion.addAll(volei.getJugadores());
                    System.out.println("Jugadores en orden de inscripción: " + ordenInscripcion);
                    break;

                case 8: // Ranking por ID (Comparator)
                    Set<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
                    ranking.addAll(futbol.getJugadores());
                    ranking.addAll(basquet.getJugadores());
                    ranking.addAll(volei.getJugadores());
                    System.out.println("Ranking de jugadores por ID: " + ranking);
                    break;

                case 9: // Agregar jugador
                    System.out.print("ID del jugador: ");
                    int nuevoId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del jugador: ");
                    String nombre = sc.nextLine();
                    Jugador nuevo = new Jugador(nuevoId, nombre);

                    System.out.print("Disciplina (futbol/basquet/volei): ");
                    String disc = sc.nextLine().toLowerCase();
                    if (disc.equals("futbol")) futbol.registrarJugador(nuevo);
                    else if (disc.equals("basquet")) basquet.registrarJugador(nuevo);
                    else if (disc.equals("volei")) volei.registrarJugador(nuevo);
                    else System.out.println("Disciplina no válida.");
                    break;

                case 10: // Eliminar jugador
                    System.out.print("ID del jugador a eliminar: ");
                    int eliminarId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Disciplina (futbol/basquet/volei): ");
                    String discElim = sc.nextLine().toLowerCase();
                    boolean eliminado = false;
                    if (discElim.equals("futbol")) eliminado = futbol.eliminarJugador(eliminarId);
                    else if (discElim.equals("basquet")) eliminado = basquet.eliminarJugador(eliminarId);
                    else if (discElim.equals("volei")) eliminado = volei.eliminarJugador(eliminarId);

                    if (eliminado) System.out.println("Jugador eliminado.");
                    else System.out.println("Jugador no encontrado.");
                    break;


                case 11:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 11);

        sc.close();
    }
   
}

