package org.example;

import java.util.ArrayList;
import org.example.Articulo;
import org.example.OrdenCompra;
import org.example.Cliente;
import org.example.Pago;
import org.example.DocTributario;
import org.example.DetalleOrden;

public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    private OrdenCompra orden;
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
    public float calcIVA() {
        float iva = articulo.getPrecio() * 0.19f;
        return iva;
    }
    public float calcPeso() {
        float peso = articulo.getPeso() * this.cantidad;
        return peso;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String ToString() {
        return "Articulo: [" + articulo.ToString() + "] , Cantidad:" + cantidad;
    }
}
