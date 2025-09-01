package enums;

public enum OrderStatus {
    NEW("Pedido creado"),
    PROCESSING("Pedido en proceso"),
    SHIPPED("Pedido enviado"),
    DELIVERED("Pedido entregado"),
    CANCELLED("Pedido cancelado");

    private String mensaje;

    OrderStatus(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

