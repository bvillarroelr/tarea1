package org.example;

public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo() {
        nombre = new String();
        descripcion = new String();
    }

    public float getPeso() {
        return peso;
    }

    public float getPrecio() {
        return precio;
    }
}
