import enums.Order;
import enums.OrderStatus;
import enums.OrderPriority;
import enums.PaymentMethod;

public class testMain {

    public static void main(String[] args) {
        // Crear 3 pedidos diferentes

        Order pedido1 = new Order("Ana", OrderStatus.NEW, OrderPriority.HIGH, PaymentMethod.CARD);
        Order pedido2 = new Order("Luis", OrderStatus.SHIPPED, OrderPriority.MEDIUM, PaymentMethod.CASH);
        Order pedido3 = new Order("Marta", OrderStatus.DELIVERED, OrderPriority.LOW, PaymentMethod.TRANSFER);

        // Mostrar detalles
        pedido1.showDetails();
        pedido2.showDetails();
        pedido3.showDetails();
    }
    
}
