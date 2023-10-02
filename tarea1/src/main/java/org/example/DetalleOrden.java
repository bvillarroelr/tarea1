package org.example;

public class DetalleOrden {
    private int cantidad;
    public DetalleOrden(int cantidad){
        cantidad = this.cantidad;
    }
    public float calcPrecio(Articulo a) {
        float precio = a.getPrecio() * cantidad;
        precio = precio * 1.19f;
        return precio;
    }
    public float calcPrecioSinIVA(Articulo a) {
        float precio = a.getPrecio() * cantidad;
        return precio;
    }
    public float calcIVA(Articulo a) {
        float iva = a.getPrecio() * 0.19f;
        return iva;
    }
    public float calcPeso(Articulo a) {
        float peso = a.getPeso() * this.cantidad;
        return peso;
    }

    public int getCantidad() {
        return cantidad;
    }
}
