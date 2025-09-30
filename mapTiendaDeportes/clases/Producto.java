package clases;

public class Producto {
    private int codigo;
    private String nombreProducto;
    private int stock;
    private Categoria categoria;
    
    public Producto(int codigo, String nombreProducto, int stock, Categoria categoria) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
         return String.format("%s - %s (%s) | Stock: %d", codigo, nombreProducto, categoria, stock);
    }

}
