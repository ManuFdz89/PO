package Ejercicio7;

import Ejercicio7.Model.Cliente;
import Ejercicio7.Model.Direccion;
import Ejercicio7.Model.Producto;

public class Main {

    public static void main(String[] args) {

        /*Producto teclado = new Producto("teclado", 10, 45.99);
        Producto raton = new Producto("raton", 25, 25.50);
        Producto monitor = new Producto("monitor", 5, 299.99);

        System.out.println(teclado);
        System.out.println(raton);
        System.out.println(monitor);
*/
        Direccion direccion = new Direccion("Calle Mayor, 15", "Madrid", 28001);
        Cliente carlos = new Cliente("Carlos Ruiz","carlos.ruiz@gmail.com",direccion);

        System.out.println("\nCliente: "+carlos.getNombre());
        System.out.println("Email: "+carlos.getEmail());
        System.out.println("Direccion: "+carlos.getDireccion());
    }
}
