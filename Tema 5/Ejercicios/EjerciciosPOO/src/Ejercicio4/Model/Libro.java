package Ejercicio4.Model;

public class Libro {

    private String titulo, autor;
    private int paginas;

    public Libro() {
        this.titulo = "Sin titulo";
        this.autor = "Autor desconocido";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
}
