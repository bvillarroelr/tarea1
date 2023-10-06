package org.example;

public class Transferencia {
    private String banco;
    private String numCuenta;
    public Transferencia() {
        banco = new String();
        numCuenta = new String();
    }
    public string ToString() {
        return banco + "," + numCuenta;
    }
}
