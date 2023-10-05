package org.example;

import java.util.ArrayList;

public class DetalleOrden {
    private int cantidad;
    private ArrayList<Articulo> listaArticulos;
    private OrdenCompra orden;
    public DetalleOrden(int cantidad, Articulo articulo){
        this.cantidad = cantidad;
        listaArticulos.add(articulo);
    }
    public float calcPrecio(Articulo a) {
        float precio = a.getPrecio();
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
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
