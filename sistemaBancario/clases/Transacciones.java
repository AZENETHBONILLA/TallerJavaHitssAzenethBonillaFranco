package clases;

public class Transacciones {
    private final int idTrans;
    private String tipoOperacion;
    private int monto;
    private CuentasBancarias cuenta;

    private static int contador = 1;

    public Transacciones(String tipoOperacion, int monto, CuentasBancarias cuenta) {
        this.idTrans = contador++;
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public int getIdTrans() {
        return idTrans;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public CuentasBancarias getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentasBancarias cuenta) {
        this.cuenta = cuenta;
    }

    public void aplicarTransaccion() {
        // Verifica si el tipo de operación es "Depósito" (ignorando mayúsculas/minúsculas)
        if (tipoOperacion.equalsIgnoreCase("Depósito")) {
            cuenta.setSaldoactual(cuenta.getSaldoactual() + monto);// Si es un depósito, suma el monto de la transacción al saldo actual de la cuenta
        
        // Si no es depósito, verifica si el tipo de operación es "Retiro"
        } else if (tipoOperacion.equalsIgnoreCase("Retiro")) {
            // Antes de retirar, verifica que haya saldo suficiente para cubrir el monto
            if (cuenta.getSaldoactual() >= monto) {
                // Si hay suficiente saldo, resta el monto al saldo actual de la cuenta
                cuenta.setSaldoactual(cuenta.getSaldoactual() - monto);
            } else {
                // Si no hay suficiente saldo, muestra un mensaje y no realiza la operación
                System.out.println("No hay saldo suficiente en la cuenta de " + cuenta.getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return "{idTrans=" + idTrans + ", tipoOperacion=" + tipoOperacion + ", monto=" + monto
                + ", cuenta=" + cuenta + "}";
    }

}
