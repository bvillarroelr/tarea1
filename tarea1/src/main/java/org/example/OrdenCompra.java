package org.example;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;
// Falta ver como crear correctamente los objetos, y ver como funcionarán los parámetros del constructor.
// También, OrdenCompra debe tener la suma total de los precios dependiendo de LOS articulos que vaya a comprar el cliente
// OrdenCompra : métodos deben devolver suma de todos los precios. DetalleOrden: precio articulo * cantidad.
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
        listaDetalles.size();
        return 0;
    }
    public float calcIVA() {
        return 0;
    }
    public float calcPrecio() {
        return 0;
    }
    public float calcPeso() {
        return 0;
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
}
