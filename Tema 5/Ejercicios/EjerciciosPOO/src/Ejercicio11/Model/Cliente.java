package Ejercicio11.Model;

import java.util.ArrayList;

public class Cliente {

    private String nombre, email;
    private Carrito carrito;

    public Cliente() {
    }

    public Cliente(String nombre, String email, Carrito carrito) {
        this.nombre = nombre;
        this.email = email;
        this.carrito = carrito;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
}
