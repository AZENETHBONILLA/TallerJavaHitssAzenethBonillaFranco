package enums;

public enum PaymentMethod {
    CASH("Efectivo"),
    CARD("Tarjeta de Credito"),
    TRANSFER("Transferencia Bancaria");

    private final String descripcion;

    PaymentMethod(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    



}
