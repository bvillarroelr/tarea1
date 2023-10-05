package org.example;

public class Efectivo extends Pago {
    public float Efectivo;
    public float calcDevolucion() {
        return Efectivo - getMonto();
    }
}
