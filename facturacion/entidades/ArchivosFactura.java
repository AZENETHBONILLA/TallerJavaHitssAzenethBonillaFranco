package entidades;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class ArchivosFactura {

    private static final String CARPETA = "facturas";

    // 1. Guardar factura en archivo
    public static void guardarFactura(Factura factura) {
        try {
            // Crear carpeta "facturas" si no existe
            Path carpeta = Paths.get(CARPETA);
            if (!Files.exists(carpeta)) {
                Files.createDirectories(carpeta);
            }

            // Crear nombre del archivo factura_id.txt
            Path ruta = carpeta.resolve("factura_" + factura.getId() + ".txt");

            // Guardar el reporte en el archivo
            Files.writeString(ruta, factura.generarReporte(), 
                    StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Factura guardada en: " + ruta.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error al guardar la factura: " + e.getMessage());
        }
    }

    // 2. Leer una factura desde archivo y mostrar
    public static void leerFactura(int idFactura) {
        Path ruta = Paths.get(CARPETA, "factura_" + idFactura + ".txt");
        try {
            String contenido = Files.readString(ruta);
            System.out.println("=== Contenido de la factura " + idFactura + " ===");
            System.out.println(contenido);
        } catch (IOException e) {
            System.out.println("Error al leer la factura: " + e.getMessage());
        }
    }

    // 3. Listar nombres de todas las facturas en la carpeta

    public static void listarNombres() {
        File carpeta = new File(CARPETA);
        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("No hay facturas guardadas.");
            return;
        }

        File[] archivos = carpeta.listFiles((dir, name) -> name.endsWith(".txt"));
        if (archivos == null || archivos.length == 0) {
            System.out.println("No hay facturas guardadas.");
            return;
        }

        System.out.println("Facturas existentes:");
        for (File archivo : archivos) {
            System.out.println(archivo.getName());
        }
    }

}
