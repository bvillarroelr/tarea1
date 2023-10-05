package org.example;

public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(int cantidad, Articulo articulo){
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
    public float calcPrecio() {
        float precio = articulo.getPrecio();
        precio = precio * 1.19f;
        return precio;
    }
    public float calcPrecioSinIVA() {
        float precio = articulo.getPrecio() * cantidad;
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
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Articulo getArticulo() {
        return articulo;
    }
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
