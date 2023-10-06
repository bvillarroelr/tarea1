package org.example;

public class Efectivo extends Pago {
    public float efectivo;
    public float calcDevolucion() {
        return efectivo - getMonto();
    }
    public String ToString() {
        return efectivo;
    }
}