package Ejercicio1y2;

import Ejercicio1y2.Model.Persona;

public class Main {
    public static void main(String[] args) {

        String nombre = "Manuel";
        int edad = 36;

        Persona nuevaPersona = new Persona(nombre,edad);
        System.out.printf("Nombre: %s%nEdad: %d%n",nuevaPersona.getNombre(),nuevaPersona.getEdad());

        nuevaPersona.setEdad(30);
        nuevaPersona.setNombre("Maria");

        System.out.printf("Nombre: %s%nEdad: %d%n",nuevaPersona.getNombre(),nuevaPersona.getEdad());
    }
}
