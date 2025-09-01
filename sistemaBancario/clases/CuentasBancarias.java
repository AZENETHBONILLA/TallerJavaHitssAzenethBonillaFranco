package clases;

public class CuentasBancarias {
    private final int id;
    private String nombre;
    private int saldoactual; 

    private static int contador = 1;

    public CuentasBancarias(String nombre, int saldoactual) {
        this.id = contador++;
        this.nombre = nombre;
        this.saldoactual = saldoactual;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", nombre=" + nombre + ", saldoactual=" + saldoactual + "}";
    } 

    

    


}
