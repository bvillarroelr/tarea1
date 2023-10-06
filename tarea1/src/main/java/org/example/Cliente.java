package org.example;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = new String(nombre);
        this.rut = new String(rut);
        this.direccion = new Direccion(direccion)

    }
    public String ToString() {
        return "Cliente: " + nombre, "RUT: " + rut,"Direccion: " + direccion;
    }
}
