package test;

import java.util.Arrays;

import entidades.ArchivosFactura;
import entidades.Cliente;
import entidades.Factura;
import entidades.Producto;
import genericos.ServicioGenerico;

public class Facturacion {
    public static void main(String[] args) {

        //Servicios 
        ServicioGenerico<Cliente, String> clienteServicio = new ServicioGenerico<>();
        ServicioGenerico<Producto, Integer> productoServicio = new ServicioGenerico<>();
        ServicioGenerico<Factura, Integer> facturaServicio = new ServicioGenerico<>();

        //No se acepta la entidad Estudiante porque no implementa la interfaz identidicable
        //ServicioGenerico<Estudiante, String> estudianteServicio = new ServicioGenerico<>();

        //Clientes
        Cliente c1 = new Cliente("C001", "Azeneth");
        Cliente c2 = new Cliente("C001", "Antonio");
        Cliente c3 = new Cliente("C002", "Luis");
        
        clienteServicio.guardar(c1);
        clienteServicio.guardar(c2);//No se guarda porque esta duplicado
        clienteServicio.guardar(c3);

        //PRODUCTOS
        Producto p1 = new Producto(100, "Laptop", 13000);
        Producto p2 = new Producto(200, "Teclado", 600);
        Producto p3 = new Producto(300, "Mouse", 500);
        
        productoServicio.guardar(p3);
        productoServicio.guardar(p2);
        productoServicio.guardar(p1);

        //FACTURAS
        Factura f1 = new Factura(c1, 1, Arrays.asList(p1, p2));
        Factura f2 = new Factura(c3, 2, Arrays.asList(p1,p2,p3));

        facturaServicio.guardar(f1);
        facturaServicio.guardar(f2);

        //Buscar ID
        System.out.println("Buscar cliente C002");
        System.out.println(clienteServicio.buscarPorId("C002"));
        System.out.println("Buscar cliente C003");
        System.out.println(clienteServicio.buscarPorId("C003"));

        //Actualizar 
        System.out.println("Actualizando cliente");
        clienteServicio.actualizar("C002", new Cliente("C002", "Victor"));

        //Eliminar cliente por ID
        System.out.println("Eliminando cliente C003 ");
        clienteServicio.eliminar("C003");

        //Dentro de la factura
        System.out.println("Eliminar y agregar productos");
        Producto p4 = new Producto(400, "TV", 6000);
        productoServicio.guardar(p4);

        f2.eliminarProducto(300);
        f2.agregarElemento(p4);

        // Guardar facturas en archivos
        ArchivosFactura.guardarFactura(f1);
        ArchivosFactura.guardarFactura(f2);

        // Leer factura por ID
        ArchivosFactura.leerFactura(1);
        ArchivosFactura.leerFactura(2);

        // Listar todas las facturas
        ArchivosFactura.listarNombres();


    }
}

