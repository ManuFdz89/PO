package Ejercicio3;

import Ejercicio3.Model.Rectangulo;

public class Main {

    public static void main(String[] args) {

        Rectangulo area = new Rectangulo(5.15,2.20);

        System.out.printf("Rectangulo con base %.2f y altura %.2f%n",area.getBase(),area.getAltura());
        System.out.printf("Area: %.2f%n",area.calcularArea());
        System.out.printf("Perimetro: %.2f%n",area.calcularPerimetro());

    }
}
