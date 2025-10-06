package test;

import entidades.*;
import servicios.LibreriaService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class TestService {
    public static void main(String[] args) {
        System.out.println("===================VALIDAR LIBROS Y CLIENTES========================");
        LibreriaService service = new LibreriaService();

        // Crear libros
        Libro l1 = new Libro("El Quijote", "Cervantes", 1605, 300);
        Libro l2 = new Libro("Clean Code", "Robert C. Martin", 2008, 500);
        Libro l3 = new Libro("Java 17", "Oracle", 2021, 600);
        Libro l4 = new Libro("Orgullo y prejuicio", "Jane Austen", 1813, 450);

        List<Libro> libros = Arrays.asList(l1, l2, l3, l4);

        // Crear clientes
        Cliente c1 = new Cliente("Azeneth", 22);
        Cliente c2 = new Cliente("Luis", 16);
        Cliente c3 = new Cliente("Emi", 24);
        List<Cliente> clientes = Arrays.asList(c1, c2, c3);

        // 1. Validar libros (año > 1900)
        Predicate<Libro> validarAnio = l -> l.getAñoPublicacion() > 1900;
        System.out.println("Libros válidos: " + service.filtrarLibros(libros, validarAnio));

        // 2. Validar clientes (mayores de edad)
        Predicate<Cliente> mayorEdad = c -> c.getEdad() >= 18;
        System.out.println("Clientes mayores de edad: " + service.filtrarClientes(clientes, mayorEdad));

        // 3. Transformar libro a resumen
        System.out.println("====================Resumen de libros========================");
        Function<Libro, String> resumenLibro = l -> l.getTitulo() + " - " + l.getAutor();
        System.out.println("Resumen: " + service.transformarLibro(l4, resumenLibro));

        Function<Libro, String> resumenLibro2 = l -> l.getTitulo() + " - " + l.getAutor();
        System.out.println("Resumen: " + service.transformarLibro(l1, resumenLibro2));

        // 4. Venta y factura
        Ventas v1 = new Ventas(c1, Arrays.asList(l1, l4), LocalDate.now());

        c1.agregarCompra(v1);

        Function<Ventas, String> generarFactura = v -> {
            StringBuilder detallesLibros = new StringBuilder();
            for (Libro libro : v.getLibros()) {
                detallesLibros.append(String.format(" - %s (%s)  $%,.2f\n", 
                    libro.getTitulo(), libro.getAutor(), (double) libro.getPrecio()));
            }

            return String.format(
                """
                ==========================================================
                                LIBRERÍA UNIVERSITARIA
                ==========================================================
                Fecha           : %s
                ----------------------------------------------------------
                Cliente          : %s
                Libros comprados :
                %s----------------------------------------------------------
                Total            : $%,.2f
                ----------------------------------------------------------
                        ¡Gracias por su compra, %s!
                ==========================================================
                """,
                v.getFechaVenta(),
                v.getCliente().getNombre(),
                detallesLibros.toString(),
                v.calcularTotal(),
                v.getCliente().getNombre().toUpperCase()
            );
        };


        // Generar el texto de la factura
        String facturaTexto = service.generarFactura(v1, generarFactura);

        // Mostrar en consola
        System.out.println(facturaTexto);

        // Guardar en archivo TXT
        try {
            java.nio.file.Path ruta = java.nio.file.Paths.get("factura_" + v1.getCliente().getNombre() + ".txt");
            java.nio.file.Files.writeString(ruta, facturaTexto);
            System.out.println("Factura guardada en: " + ruta.toAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 5. Consumer - notificar cliente
        System.out.println("====================Ejecutar acciones========================");
        Consumer<Cliente> notificar = c -> System.out.println("Notificación enviada a " + c.getNombre());
        service.ejecutarAccionCliente(c1, notificar);

        // 6. Supplier - fecha actual
        System.out.println("====================Información Automática===================");
        Supplier<LocalDate> hoy = () -> LocalDate.now();
        System.out.println("Fecha generada: " + service.generarDato(hoy));

            // Generar ID de libro
        Supplier<String> idLibro = service.generarIdLibro();
        System.out.println("ID generado para libro: " + service.generarDato(idLibro));

        // 7. Encontrar el libro más caro/barato 
        System.out.println("====================Realizar cálculos========================");
        // BinaryOperator para obtener el libro más caro y más barato
        BinaryOperator<Libro> libroMasCaro = (lA, lB) -> lA.getPrecio() > lB.getPrecio() ? lA : lB;
        BinaryOperator<Libro> libroMasBarato = (lA, lB) -> lA.getPrecio() < lB.getPrecio() ? lA : lB;

        // Usar reduce() para aplicar los operadores sobre la lista
        Libro masCaro = service.encontrarLibro(libros, libroMasCaro);
        Libro masBarato = service.encontrarLibro(libros, libroMasBarato);

        // Mostrar resultados
        if (masCaro != null && masBarato != null) {
            System.out.println("Libro más caro: " + masCaro.getTitulo() + " - $" + masCaro.getPrecio());
            System.out.println("Libro más barato: " + masBarato.getTitulo() + " - $" + masBarato.getPrecio());
        }

        // 8. UnaryOperator - aplicar descuento
        UnaryOperator<Integer> descuento10 = precio -> precio - (precio * 10 / 100);
        System.out.println("Precio del libro '"+ l2.getTitulo() + "' con descuento:  " + service.aplicarDescuento(l2.getPrecio(), descuento10));

    }
}

