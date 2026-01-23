package Ejercicio11.Model;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> carrito;
    private ArrayList<Integer> cantidad;


    public Carrito() {
        this.carrito = new ArrayList<>();
        this.cantidad = new ArrayList<>();

    }

    public void aniadirProducto(Producto producto, int cantidad){

        if (producto.getStock()>=cantidad) {
            this.cantidad.add(cantidad);
            carrito.add(producto);
            System.out.printf("Añadiendo %s (%.2f) x%d al carrito...%n%n",producto.getNombre(),producto.getPrecio(),cantidad);
            System.out.println("--- CARRITO DE COMPRA ---\n");
            mostrarCarrito();
        }else {
            System.out.println("Sin stock de este producto%n");
        }

    }

    public void eliminarProducto(Producto producto){

        this.cantidad.remove(carrito.indexOf(producto));
        carrito.remove(producto);

        System.out.printf("Eliminando %s del carrito...%n", producto.getNombre());
        System.out.println("--- CARRITO ACTUALIZADO ---\n");
        mostrarCarrito();

    }

    private void mostrarCarrito (){

        double precioTotal = 0;

        for (int i = 0; i < carrito.size(); i++) {
            System.out.printf("%d. %s x%s - %.2f €%n",i+1,carrito.get(i).getNombre(),
                    cantidad.get(i),carrito.get(i).getPrecio());
            precioTotal += cantidad.get(i) * carrito.get(i).getPrecio();
        }
        System.out.printf("Total: %.2f €%n%n",precioTotal);

    }

    public void finalizarCompra(){

        System.out.println("Finalizando compra...\n");
        int stocktemp = 0;

        for (int i = 0; i < carrito.size(); i++) {
            stocktemp = carrito.get(i).getStock();
            carrito.get(i).setStock(stocktemp-cantidad.get(i));
        }

        carrito.clear();
        cantidad.clear();


        System.out.println("Compra realizada con exito\n");
        System.out.println("Stock actualizado");



    }
}
