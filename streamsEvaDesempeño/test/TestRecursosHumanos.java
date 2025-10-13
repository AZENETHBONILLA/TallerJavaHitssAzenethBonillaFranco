package test;

import models.Empleado;
import models.Evaluacion;
import java.util.*;
import java.util.stream.Collectors;

public class TestRecursosHumanos {
    public static void main(String[] args) {

        // === Datos de prueba ===
        // Se crea una lista inmutable de empleados con información.
        List<Empleado> empleados = List.of(
            new Empleado(1, "Azeneth Bonilla", "IT", 60000, 6, List.of(
                new Evaluacion(2023, 88),
                new Evaluacion(2024, 95),
                new Evaluacion(2025, 92)
            )),
            new Empleado(2, "Carlos Pérez", "IT", 52000, 3, List.of(
                new Evaluacion(2022, 85),
                new Evaluacion(2023, 75),
                new Evaluacion(2024, 82)
            )),
            new Empleado(3, "María Gómez", "HR", 48000, 8, List.of(
                new Evaluacion(2023, 92),
                new Evaluacion(2024, 90),
                new Evaluacion(2025, 90)
            )),
            new Empleado(4, "Luis Torres", "Ventas", 70000, 10, List.of(
                new Evaluacion(2023, 85),
                new Evaluacion(2024, 87),
                new Evaluacion(2025, 90)
            )),
            new Empleado(5, "Elena Ruiz", "IT", 68000, 7, List.of(
                new Evaluacion(2023, 99),
                new Evaluacion(2024, 98),
                new Evaluacion(2025, 99)
            ))
        );

        // ===== REPORTE GENERAL RH =====
        
        System.out.println("==============================================================");
        System.out.println("    REPORTE DE EVALUACIÓN DE PERSONAL - DEPARTAMENTO DE RH");
        System.out.println("==============================================================");

        imprimirTitulo("1. Empleados del departamento IT (orden alfabético)");
        empleados.stream() // Se convierte la lista en un flujo (stream)
                .filter(e -> e.getDepartamento().equalsIgnoreCase("IT")) // Filtra solo los empleados de IT
                .sorted(Comparator.comparing(Empleado::getNombre))  // Ordena por nombre en orden alfabético
                .forEach(e -> System.out.printf(" - %-15s | Salario: $%,.2f | Experiencia: %d años%n",
                        e.getNombre(), e.getSalario(), e.getAniosExperiencia()));
        imprimirLinea();

        imprimirTitulo("2. Salario promedio por departamento");
        Map<String, Double> promedioDepto = empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getDepartamento, // clave: nombre del departamento
                        Collectors.averagingDouble(Empleado::getSalario) // valor: promedio de salarios
                ));
        promedioDepto.forEach((dept, prom) ->
                System.out.printf(" - %-10s | Salario promedio: $%,.2f%n", dept, prom)
        );

        imprimirLinea();

        imprimirTitulo("3. Empleado con mayor salario");
        empleados.stream() // Busca el empleado con salario máximo usando un comparador
                .max(Comparator.comparingDouble(Empleado::getSalario))
                .ifPresent(e -> System.out.printf("Nombre: %-10s | Departamento: %-5s | Salario: $%,.2f%n",
                        e.getNombre(), e.getDepartamento(), e.getSalario()));

        imprimirLinea();

        imprimirTitulo("4. Empleados con más de 5 años y salario mayor a $50,000");
        empleados.stream() // Filtra los empleados que cumplan ambas condiciones
                .filter(e -> e.getAniosExperiencia() > 5 && e.getSalario() > 50000)
                .forEach(e -> System.out.printf(" - %-15s | Experiencia: %2d años | Salario: $%,.2f%n",
                        e.getNombre(), e.getAniosExperiencia(), e.getSalario()));

        imprimirLinea();

        imprimirTitulo("5. Top 3 mejores puntajes en la última evaluación");
        empleados.stream()
                .sorted((e1, e2) -> { // Se obtiene el último puntaje de cada empleado
                    int p1 = e1.getEvaluaciones().get(e1.getEvaluaciones().size() - 1).getPuntaje();
                    int p2 = e2.getEvaluaciones().get(e2.getEvaluaciones().size() - 1).getPuntaje();
                    return Integer.compare(p2, p1); // Orden descendente
                })
                .limit(3) // Solo los 3 primeros
                .forEach(e -> {
                    int ultimoPuntaje = e.getEvaluaciones().get(e.getEvaluaciones().size() - 1).getPuntaje();
                    System.out.printf(" - %-20s | Puntaje final: %d%n", e.getNombre(), ultimoPuntaje);
                });

        imprimirLinea();

        // Contar empleados con al menos una evaluación > 90
        imprimirTitulo("6. Empleados con alguna evaluación superior a 90 puntos");
        long conteo = empleados.stream()  // Usa anyMatch() para verificar si alguna evaluación del empleado supera 90
                .filter(e -> e.getEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
                .count(); // Devuelve la cantidad total que cumple la condición
        System.out.printf("Cantidad total de empleados destacados: %d%n", conteo);

        imprimirLinea();

        //Ranking de promedio de puntajes por empleado
        imprimirTitulo("7. Ranking general por promedio de evaluaciones");
        empleados.stream()
                .sorted((e1, e2) -> { // Calcula el promedio de puntajes del primer empleado
                        double prom1 = e1.getEvaluaciones().stream()
                                .mapToInt(Evaluacion::getPuntaje)  // Convierte las evaluaciones en enteros
                                .average() //Calcula el promedio
                                .orElse(0); // Si no tiene evaluaciones, devuelve 0
                    
                        double prom2 = e2.getEvaluaciones().stream()
                                .mapToInt(Evaluacion::getPuntaje)
                                .average()
                                .orElse(0);
                    return Double.compare(prom2, prom1); //Ordena los promedios de forma descendente.
                })
                .forEach(e -> {
                    double promedio = e.getEvaluaciones().stream().mapToInt(Evaluacion::getPuntaje).average().orElse(0);
                    System.out.printf(" - %-20s | Promedio general: %.2f%n", e.getNombre(), promedio);
                });

        imprimirLinea();
    }

    private static void imprimirTitulo(String titulo) {
        System.out.println("\n " + titulo);
        System.out.println("--------------------------------------------------------------");
    }

    private static void imprimirLinea() {
        System.out.println("--------------------------------------------------------------");
    }
}
