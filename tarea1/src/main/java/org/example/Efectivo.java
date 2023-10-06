package org.example;
import org.example.Pago;
    public class Efectivo extends Pago {
    public float efectivo;

        public Efectivo(float monto) {
            super(monto);
        }

        public float calcDevolucion() {
        return efectivo - getMonto();
    }
    public String toString() {
        return "" + efectivo;
    }
}