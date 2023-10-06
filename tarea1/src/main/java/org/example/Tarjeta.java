package org.example;

public class Tarjeta {
    private String tipo;
    private String numTransaccion;
    public Tarjeta() {
        tipo = new String();
        numTransaccion = new String();
    }
    public String toString() {
        return tipo + ", " + numTransaccion;
    }
}
