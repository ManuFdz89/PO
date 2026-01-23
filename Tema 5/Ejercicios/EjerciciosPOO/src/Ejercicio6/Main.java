package Ejercicio6;

import Ejercicio6.Model.Estudiante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Estudiante e1 = new Estudiante();
        double nota = 0;

        System.out.print("Introduce el nombre del estudiante: ");
        String estudiante = teclado.nextLine();
        e1.setNombre(estudiante);
        System.out.print("Introduce la edad del estudiante: ");
        int edad = teclado.nextInt();
        e1.setEdad(edad);

       // do {
            System.out.print("Introduce la nota del estudiante: ");
            nota = teclado.nextDouble();
            e1.setNota(nota);

        //}while (nota<0 || nota>10);
    }
}
