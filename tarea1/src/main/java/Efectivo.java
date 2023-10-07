
public class Efectivo extends Pago {
    public Efectivo(float monto) {
            super(monto);
    }
    public float calcDevolucion(OrdenCompra orden) {
        return getMonto() - orden.calcPrecio();
    }
    public String toString() {
        return "" + getMonto();
    }
}