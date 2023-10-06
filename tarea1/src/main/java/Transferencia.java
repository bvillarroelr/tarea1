package main.java;

public class Transferencia {
    private String banco;
    private String numCuenta;
    public Transferencia() {
        banco = new String();
        numCuenta = new String();
    }
    public String toString() {
        return banco + "," + numCuenta;
    }
}
