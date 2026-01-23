package Ejercicio10.Model;

public class Libro {

    private String titulo, autor;
    private boolean disponibilidad;
    private int ISBN;

    public Libro() {
    }

    public Libro(String titulo, String autor, boolean disponibilidad, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
        this.ISBN = ISBN;
    }


    public void mostrarDatos(){

        System.out.println("- "+titulo+" ("+autor+") "+"ISBN: "+ISBN);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
