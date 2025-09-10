package edades;

// Clase principal
public class RegistroAlumnos {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];

        try {
            // Intentamos registrar 4 alumnos (el último causará error)
            alumnos[0] = new Alumno("Juan", 20);
            alumnos[1] = new Alumno("María", 19);
            alumnos[2] = new Alumno("Pedro", 25);

            // Este alumno excede el arreglo
            alumnos[3] = new Alumno("Luis", 30);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No se pueden registrar más de 3 alumnos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Mostrar alumnos registrados correctamente
        System.out.println("\n--- Lista de alumnos registrados ---");
        for (Alumno a : alumnos) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }
}
