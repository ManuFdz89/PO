package Ejercicio4;

import Ejercicio4.Model.Libro;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro("Don quijote", "Miguel de cervantes");
        Libro l3 = new Libro("Cien años de soledad", "Gabriel garcia marquez", 471 );

        System.out.println("Libro 1: "+l1.getTitulo()+", "+l1.getAutor()+", "+l1.getPaginas()+" paginas.");
        System.out.println("Libro 2: "+l2.getTitulo()+", "+l2.getAutor()+", "+l2.getPaginas()+" paginas.");
        System.out.println("Libro 3: "+l3.getTitulo()+", "+l3.getAutor()+", "+l3.getPaginas()+" paginas.");

    }
}
