package org.example;

public class Transferencia {
    private String banco;
    private String numCuenta;
    public Transferencia() {
        banco = new String();
        numCuenta = new String();
    }
    public String ToString() {
        return banco + "," + numCuenta;
    }
}
