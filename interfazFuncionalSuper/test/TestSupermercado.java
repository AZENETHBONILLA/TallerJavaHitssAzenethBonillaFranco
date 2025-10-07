package test;

import java.util.List;
import entidades.Cliente;
import entidades.Empleado;
import entidades.Producto;
import entidades.Venta;
import enumeracion.TipoCliente;
import interfaz.SupermercadoService;

public class TestSupermercado {
    public static void main(String[] args) {

        //Creamos los productos 
        Producto p1 = new Producto(01, "Leche Lala", 34, 75);
        Producto p2 = new Producto(02, "Queso Crema", 45, 4);
        Producto p3 = new Producto(03, "Mantequilla Santa Clara", 16, 20);
        Producto p4 = new Producto(04, "Papel Vogue", 36, 120);
        Producto p5 = new Producto(05, "Yogurt Alpura", 5.50, 60);
        Producto p6 = new Producto(06, "Chocolate Abuelita", 38, 70);
        Producto p7 = new Producto(07, "Jamón Viva", 38, 3);

        //Creamos los clientes 
        Cliente cliente1 = new Cliente(102, "Roberto", TipoCliente.NORMAL);
        Cliente cliente2 = new Cliente(103, "Eli", TipoCliente.VIP);
        Cliente cliente3 = new Cliente(104, "Antonio", TipoCliente.VIP);
        Cliente cliente4 = new Cliente(108, "José Luis", TipoCliente.VIP);

        //Creamos los empleados del supermercado
        Empleado empleado1 = new Empleado(24, "Ana", "Cajero");
        Empleado empleado3 = new Empleado(29, "Pilar", "Cajero");

        System.out.println("============Punto de Venta de Supermercado======");
        //Creamos el servicio del supermercado
        SupermercadoService service = new SupermercadoService();

        //Lista de productos para la venta
        List<Producto> productosVenta = List.of(p1, p2, p3, p4, p5, p6, p7);

        //Filtrar productos con stock bajo (menos de 5 unidades)
        List<Producto> stockBajo = service.filtrarProductos(productosVenta, p -> p.getStock() < 5);
        System.out.println("Productos con stock bajo:");
        stockBajo.forEach(p -> System.out.println(p.getNombre() + " - Stock: " + p.getStock()));

        //Calcular el total de la venta
        double total = service.calcularTotal(productosVenta, lista -> 
            lista.stream().mapToDouble(Producto::getPrecio).sum()
        );

        //Crear la venta
        Venta venta = new Venta(1, cliente4, empleado3, productosVenta, total);

        //Imprimir detalles de la venta (formato tipo ticket)
        service.imprimirVenta(venta, v -> {
            System.out.println("\n=========== TICKET DE VENTA ===========");
            System.out.printf("Venta No: %03d%n", v.getId());
            System.out.println("------------------------------------------");
            System.out.println("Cliente : " + v.getCliente().getNombre() + 
                            " (" + v.getCliente().getTipo() + ")");
            System.out.println("Atendió : " + v.getEmpleado().getNombre());
            System.out.println("------------------------------------------");
            System.out.println(String.format("%-25s %10s", "Producto", "Precio"));
            System.out.println("------------------------------------------");

            v.getProductos().forEach(p -> 
                System.out.println(String.format("%-25s $%9.2f", p.getNombre(), p.getPrecio()))
            );

            System.out.println("------------------------------------------");
            System.out.printf("%-25s $%9.2f%n", "TOTAL:", v.getTotal());
            System.out.println("========================================== \n");
        });


        //Generar producto de muestra
        Producto muestra = service.generarProducto(() -> new Producto(99, "Bombones Bianchi", 121.0, 5));
        System.out.println("Producto de muestra generado: " + muestra.getNombre() + " $" + muestra.getPrecio());

        //Aplicar descuento del 10% a un producto
        Producto conDescuento = service.aplicarDescuento(muestra, p -> {
            p.setPrecio(p.getPrecio() * 0.9);
            return p;
        });
        System.out.println("Producto con descuento: " + conDescuento.getNombre() + " $" + conDescuento.getPrecio());

        //Comparar dos productos y devolver el más caro
        System.out.println("\n======== COMPARAR PRODUCTOS ========");

        // Mostrar los productos a comparar
        System.out.printf("Producto A: %-20s $%.2f%n", p1.getNombre(), p1.getPrecio());
        System.out.printf("Producto B: %-20s $%.2f%n", p2.getNombre(), p2.getPrecio());

        // Realizar la comparación usando la función del servicio
        Producto masCaro = service.compararProductos(p1, p2,
                (a, b) -> a.getPrecio() > b.getPrecio() ? a : b);

        // Mostrar el resultado
        System.out.println("--------------------------------------");
        System.out.println("Producto más caro: " + masCaro.getNombre() +
                        " ($" + String.format("%.2f", masCaro.getPrecio()) + ")");
        System.out.println("======================================");


        //Verificar si un cliente puede acceder a un descuento
         System.out.println("\n======== VERIFICAR DESCUENTO ========");
        boolean tieneDescuento = service.verificarDescuento(cliente4, venta,
            (c, v) -> c.getTipo().equals(TipoCliente.VIP) && v.getTotal() > 1000
        );
        System.out.println("Verificar: "+cliente4+ ", ¿Tiene descuento?: " + tieneDescuento);

        // Generar ticket de venta
        String ticket = service.generarTicket(cliente4, venta, (c, v) -> 
            "\n----- TICKET DE VENTA -----\nCliente: " + c.getNombre() + 
            "\nTotal a pagar: $" + v.getTotal() + 
            "\n---------------------------" ); 
        System.out.println(ticket);


        // Notificar al cliente que su compra fue procesada
        service.notificarCliente(cliente4, empleado3,
                (c, e) -> System.out.println(
                        "Estimado " + c.getNombre() +
                        ", su compra ha sido procesada exitosamente por " +
                        e.getNombre() + ".")
        );  
    }
}
