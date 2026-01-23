package Ejercicio11.Model;

public class Producto {

    private int codigo, stock;
    private double precio;
    private String nombre;

    public Producto(int codigo, int stock, double precio, String nombre) {
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
