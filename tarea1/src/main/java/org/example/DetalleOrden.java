package org.example;

public class DetalleOrden {
    private int cantidad;
    public DetalleOrden(){
        ;
    }
    public float calcPrecio(Articulo a) {
        float precio = a.getPrecio() * cantidad;
        precio = precio * 1.19; // float o double ? D:
        return precio;
    }
    public float calcPrecioSinIVA(Articulo a) {
        float precio = a.getPrecio() * cantidad;
        return precio;
    }
    public float calcIVA() {
        return 0;
    }
    public float calcPeso() {
        return 0;
    }
}
