package org.example;

public class Cliente {
    private String nombre;
    private String rut;
    public Cliente(String nombre, String rut) {
        this.nombre = new String(nombre);
        this.rut = new String(rut);
    }
    public String ToString() {
        return "Cliente: " + nombre, "RUT: " + rut;
    }
}
