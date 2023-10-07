
public class Efectivo extends Pago {
    public Efectivo(float monto) {
            super(monto);
    }
    public float calcDevolucion(float precio) {
        return getMonto() - precio;
    }
    public String toString() {
        return "" + getMonto();
    }
}