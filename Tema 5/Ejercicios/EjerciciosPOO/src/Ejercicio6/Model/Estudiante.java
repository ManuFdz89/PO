package Ejercicio6.Model;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {

        if (nota<0 || nota>10){
            System.out.printf("Asignando nota %.2f: Error - La nota debe estar entre 0 y 10%n",nota);
            System.out.printf("Nota actual: %.2f%n",this.nota);
        }else {
            this.nota = nota;
            System.out.printf("Asignando nota %.2f: Correcto%n", this.nota);
            System.out.printf("Nota actual: %.2f", this.nota);
        }
    }
}
