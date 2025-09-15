package genericos;

import clases.Fruta;
import clases.Lacteo;
import clases.Limpieza;
import clases.NoPerecible;

public class TestMain {
    public static void main(String[] args) {
        
        // ================== LÁCTEOS ==================
        // Creamos una bolsa de productos lácteos (genérica con tipo Lacteo)
        Bolsa<Lacteo> bolsa = new Bolsa<>();
        bolsa.agregar(new Lacteo("Yogurt Alpura", 7, 6, 12));
        bolsa.agregar(new Lacteo("Crema Lala", 25, 12, 5));
        bolsa.agregar(new Lacteo("Leche Nutri", 22, 12, 7));
        bolsa.agregar(new Lacteo("Yogurt Danone", 12, 6, 10));
        bolsa.agregar(new Lacteo("Queso Manchego", 95, 14, 22));

        // Recorremos con un bucle for-each todos los objetos de tipo Lacteo que están dentro de la bolsa.
        // En cada iteración, la variable "l" representa un producto Lacteo distinto de la lista.
        System.out.println("================== LÁCTEOS ==================");
        for (Lacteo l : bolsa.obtenerProductos()) {
            System.out.println("Nombre: " + l.getNombre() +
                               ", Precio: $" + l.getPrecio() +
                               ", Cantidad: " + l.getCantidad() +
                               ", Proteínas: " + l.getProteinas() + "g");
        }

        // ================== FRUTAS ==================
        Bolsa<Fruta> bolsa2 = new Bolsa<>();
        bolsa2.agregar(new Fruta("Mango", 25, 1.3, "Amarillo"));
        bolsa2.agregar(new Fruta("Plátano", 12, 0.3, "Amarillo"));
        bolsa2.agregar(new Fruta("Pera", 15, 0.27, "Verde"));
        bolsa2.agregar(new Fruta("Uva", 40, 0.05, "Morada"));
        bolsa2.agregar(new Fruta("Sandía", 60, 3.5, "Verde/Roja"));

        System.out.println("\n================== FRUTAS ==================");
        for (Fruta f : bolsa2.obtenerProductos()) {
            System.out.println("Nombre: " + f.getNombre() +
                               ", Precio: $" + f.getPrecio() +
                               ", Peso: " + f.getPeso() + "kg" +
                               ", Color: " + f.getColor());
        }

        // ================== LIMPIEZA ==================
        Bolsa<Limpieza> bolsa3 = new Bolsa<>();
        bolsa3.agregar(new Limpieza("Fabuloso", 25, "Agua", 1.2));
        bolsa3.agregar(new Limpieza("Jabón Zote", 10, "Grasa vegetal", 0.2));
        bolsa3.agregar(new Limpieza("Pinol", 28, "Agua", 1.1));
        bolsa3.agregar(new Limpieza("Ariel Líquido", 50, "Tensioactivos", 2.0));
        bolsa3.agregar(new Limpieza("Suavitel", 35, "Perfume", 1.3));
        
        System.out.println("\n================== LIMPIEZA ==================");
        for (Limpieza li : bolsa3.obtenerProductos()) {
            System.out.println("Nombre: " + li.getNombre() +
                               ", Precio: $" + li.getPrecio() +
                               ", Componentes: " + li.getComponentes() +
                               ", Litros: " + li.getLitros());
        }

        // ================== NO PERECIBLES ==================
        Bolsa<NoPerecible> bolsa4 = new Bolsa<>();
        bolsa4.agregar(new NoPerecible("Arroz", 20, 500, 1800));
        bolsa4.agregar(new NoPerecible("Frijoles enlatados", 25, 400, 1600));
        bolsa4.agregar(new NoPerecible("Atún en lata", 30, 140, 500));
        bolsa4.agregar(new NoPerecible("Aceite vegetal", 50, 900, 800));
        bolsa4.agregar(new NoPerecible("Azúcar", 28, 1000, 3800));

        System.out.println("\n================== NO PERECIBLES ==================");
        for (NoPerecible np : bolsa4.obtenerProductos()) {
            System.out.println("Nombre: " + np.getNombre() +
                               ", Precio: $" + np.getPrecio() +
                               ", Contenido: " + np.getContenido() + "g/ml" +
                               ", Calorías: " + np.getCalorias());
        }
    }
}
