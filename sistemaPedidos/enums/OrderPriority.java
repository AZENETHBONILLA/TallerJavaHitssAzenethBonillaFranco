package enums;

// Prioridades de un pedido
public enum OrderPriority {
    LOW(1), MEDIUM(2), HIGH(3);

    private int numeroAtencion;

    OrderPriority(int numeroAtencion) {
        this.numeroAtencion = numeroAtencion;
    }

    public int getNumeroAtencion() {
        return numeroAtencion;
    }
}
