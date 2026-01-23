package Ejercicio10.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Prestamo {

    private Libro libro;
    private Usuario usuario;
    private String fechaPrestamo;

    public Prestamo() {
    }

    public Prestamo(Libro libro, Usuario usuario, String fechaPrestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public static void prestamo(Libro libro, Usuario usuario){

        System.out.printf("Usuario %s (%s) intenta tomar prestado %s%n",
                usuario.getNombre(), usuario.getNumeroSocio(), libro.getTitulo());
        if (libro.getDisponibilidad()){
            System.out.println("Préstamo realidado el "+ LocalDate.now()+"\n");
            libro.setDisponibilidad(false);
        }else {
            System.out.println("El libro no esta disponible.\n");
        }
    }

    public void devolucion(Libro libro, Usuario usuario){

        System.out.printf("Usuario %s devuelve %s%n",usuario.getNombre(),libro.getTitulo());
        System.out.println("Libro devuelto.\n");
        libro.setDisponibilidad(true);
    }

    public Libro getLibro() {
            return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
}
