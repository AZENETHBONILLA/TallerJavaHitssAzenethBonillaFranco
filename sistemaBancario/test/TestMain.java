package test;

import clases.CuentasBancarias;
import clases.Transacciones;

public class TestMain {
    public static void main(String[] args) {

         System.out.println("==================Detalle de cuentas=====================");
        CuentasBancarias Cuenta1 = new CuentasBancarias("Ana", 5000);
        System.out.println(Cuenta1);

        CuentasBancarias Cuenta2 = new CuentasBancarias("Luis", 10000); 
        System.out.println(Cuenta2);

        
        System.out.println("==========================CUENTA 1========================");
        Transacciones transAna = new Transacciones("Depósito", 2000, Cuenta1);
        transAna.aplicarTransaccion(); // actualiza el saldo de la cuenta
        System.out.println(transAna);

        Transacciones transAna2 = new Transacciones("Retiro", 1000, Cuenta1);
        transAna2.aplicarTransaccion();
        System.out.println(transAna2);

        System.out.println("=========================CUENTA 2========================");
        Transacciones transLuis = new Transacciones("Depósito", 2000, Cuenta2);
        transLuis.aplicarTransaccion();
        System.out.println(transLuis);

        Transacciones transLuis2 = new Transacciones("Retiro", 1000, Cuenta2);
        transLuis2.aplicarTransaccion();
        System.out.println(transLuis2);
    }
}
