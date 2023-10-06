package org.example;
import org.example.Direccion;
import java.util.ArrayList;
import org.example.Direccion;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = new String(nombre);
        this.rut = new String(rut);
        this.direccion = direccion;

    }
    public String ToString() {
        return "Cliente: " + nombre + " RUT: " + rut + " Direccion: " + direccion.ToString();
    }
}
