package Ejercicio10;

import Ejercicio10.Model.Libro;
import Ejercicio10.Model.Prestamo;
import Ejercicio10.Model.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Libro> libros = new ArrayList<>();

        libros.add(new Libro("Don Quijote", "Miguel de Cervantes", true, 001));
        libros.add(new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", true, 002));
        libros.add(new Libro("1984", "George Orwell", false, 003));

        Usuario uno = new Usuario("Juan", 001);
        Usuario dos = new Usuario("Maria", 002);


        Prestamo.prestamo(libros.get(0),uno);

        //libros.forEach();
        for (Libro item:libros){

            if (item.getTitulo().toLowerCase().contains("soledad")){

                Prestamo prestamo = new Prestamo(item,dos,"15/01/25");
                prestamo.prestamo(item,dos);
            }
        }

        for (Libro item:libros){

            if (item.getTitulo().toLowerCase().contains("quijote")){

                Prestamo prestamo = new Prestamo(item,dos,"15/01/25");
                prestamo.prestamo(item,dos);
            }
        }

        for (Libro item:libros){

            if (item.getTitulo().toLowerCase().contains("quijote")){

                Prestamo dev = new Prestamo(item,uno,"22/01/25");
                dev.devolucion(item,uno);
            }
        }

        for (Libro item:libros){

            if (item.getTitulo().toLowerCase().contains("quijote")){

                Prestamo prestamo = new Prestamo(item,dos,"15/01/25");
                prestamo.prestamo(item,dos);
            }
        }


     /*   ArrayList<Usuario> usuarios = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("1 - Agregar usuario: ");
            System.out.println("2 - Salir");
            opcion = teclado.nextInt();
            switch (opcion){

                case 1 -> {
                    System.out.println("Introduce el nombre del usuario: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduce el numero de socio: ");
                    int socio = teclado.nextInt();
                    Usuario entrada = new Usuario(nombre, socio);
                    usuarios.add(entrada);
                }
            }
        }while (opcion!=2);

        int ocio=0;
        usuarios.get(ocio).getNumeroSocio();*/

/* public void  mostrarDisponible(){
        System.out.println("Libros disponibles ahora: ");
        if (disponibilidad) {
            System.out.printf("- %s (%s) ISBN: %d", titulo, autor, ISBN);
        }
    }*/

    }
}
