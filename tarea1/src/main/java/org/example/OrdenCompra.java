package org.example;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> listaDetalles;
    private Pago pago;
    private DocTributario docTributario;
    private Cliente cliente;
    private DocTributario documento;
    public OrdenCompra(Cliente cliente) {
        this.cliente = cliente;
    }
    public float calcPrecioSinIVA() {
        float sumaPrecios = 0;
        for(int i = 0; i<listaDetalles.size(); i++) {
            sumaPrecios = sumaPrecios + listaDetalles.get(i).calcPrecioSinIVA();
        }
        return sumaPrecios;
    }
    public float calcIVA() {
        float sum = 0;
        for(int i = 0; i<listaDetalles.size(); i++) {
            sum = sum + listaDetalles.get(i).calcPrecioSinIVA();
        }
        return sum * 0.19f;
    }
    public float calcPrecio() {
        float sumaPrecios = 0;
        for(int i = 0; i<listaDetalles.size(); i++) {
            sumaPrecios = sumaPrecios + listaDetalles.get(i).calcPrecio();
        }
        return sumaPrecios;
    }
    public float calcPeso() {
        float pesoTotal = 0;
        for(int i = 0; i<listaDetalles.size(); i++) {
            pesoTotal = pesoTotal + listaDetalles.get(i).calcPeso();
        }
        return pesoTotal;
    }
    public void addDetalle(DetalleOrden detalle) {
        listaDetalles.add(detalle);
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String ToString() {
        return "Fecha: " + fecha + ", Estado: " + estado + "Pago: " + pago;
    }
}
