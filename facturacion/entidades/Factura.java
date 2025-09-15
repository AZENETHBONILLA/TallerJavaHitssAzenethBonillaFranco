package entidades;

import java.util.ArrayList;
import java.util.List;

import genericos.Idendificable;

public class Factura implements Idendificable<Integer> {
    private Cliente cliente;
    private Integer id;
    private List<Producto> productos;
    
    public Factura(Cliente cliente, Integer id, List<Producto> productos) {
        this.cliente = cliente;
        this.id = id;
        this.productos = new ArrayList<>(productos);
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    //Método dinamico para agregar un elemento a la lista de productos 
    public void agregarElemento(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado: "+ producto);
    }

    //Método dinámico para eliminar un producto a la lista de productos 
    public boolean eliminarProducto(int id){
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == id) {
                System.out.println("Producto eliminado"+ productos.get(i));
                Producto producto = productos.remove(i);
                return true;
            }
        }
        System.out.println("No se encontrp el producto con Id"+ id);
        return false;
    }

    public double calcularTotal(){
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }


    public String generarReporte() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("============================================\n");
        sb.append(String.format("               FACTURA #%d\n", id));
        sb.append("============================================\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("--------------------------------------------\n");
        sb.append(String.format("%-25s %10s\n", "Descripción", "Precio"));
        sb.append("--------------------------------------------\n");

        for (Producto producto : productos) {
            sb.append(String.format("%-25s %10.2f\n", 
                    producto.getDescripcion(), producto.getPrecio()));
        }

        sb.append("--------------------------------------------\n");
        sb.append(String.format("%-25s %10.2f\n", "TOTAL:", calcularTotal()));
        sb.append("============================================\n");

        return sb.toString();
    }


    @Override
    public String toString() {
        return "{cliente=" + cliente + ", id=" + id + ", productos=" + productos +"Total:"+ calcularTotal()+"}";
    }

    

}
