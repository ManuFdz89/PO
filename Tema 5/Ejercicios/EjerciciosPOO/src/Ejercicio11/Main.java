package Ejercicio11;

import Ejercicio11.Model.Carrito;
import Ejercicio11.Model.Cliente;
import Ejercicio11.Model.Producto;

public class Main {

    public static void main(String[] args) {

        Producto p1 = new Producto(1,10,899.99,"Portatil");
        Producto p2 = new Producto(2, 50, 25.50, "Ratón");
        Producto p3 = new Producto(3, 20, 45.99, "Teclado");

        Cliente primero = new Cliente("Ana Martinez","ana@gmail.com",new Carrito());

        System.out.println("--- Tienda Online ---");
        System.out.printf("Cliente: %s (%s)%n%n",primero.getNombre(),primero.getEmail());

        primero.getCarrito().aniadirProducto(p1,12);
        primero.getCarrito().aniadirProducto(p2,10);
        primero.getCarrito().aniadirProducto(p3,5);
        primero.getCarrito().aniadirProducto(p1,4);


        primero.getCarrito().eliminarProducto(p2);

        primero.getCarrito().finalizarCompra();

        System.out.println(p1.getStock()+" "+ p2.getStock()+" "+ p3.getStock());





    }
}
