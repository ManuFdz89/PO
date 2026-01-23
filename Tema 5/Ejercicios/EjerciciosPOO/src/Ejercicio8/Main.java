package Ejercicio8;

import Ejercicio8.Model.Empleado;

public class Main {

    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[5];

        empleados[0] = new Empleado("Ana Perez", "Desarrolladora", 35000.0);
        empleados[1] = new Empleado("Luis Garcia", "Diseñador", 28000.0);
        empleados[2] = new Empleado("Maria Torres", "Project Manajer", 42000.0);
        empleados[3] = new Empleado("Jorge Diaz", "Analista", 32000.0);
        empleados[4] = new Empleado("Laura Sanchez", "Tester", 26000.0);

        double promedio = 0;
        System.out.println("Lista de empleados: ");
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("%d. %s%n",i+1,empleados[i]);
            promedio+=empleados[i].getSalario();
        }
        promedio/= empleados.length;

        Empleado mayorSalario = empleados[0];

        for (int i = 0; i < empleados.length; i++) {

            if (empleados[i].getSalario() > mayorSalario.getSalario()){
                mayorSalario = empleados[i];
            }
        }

        System.out.printf("\nEmpleado con mayor salario: %s (%.2f)%n",mayorSalario.getNombre(),mayorSalario.getSalario());
        System.out.println("Salario promedio: "+promedio);

    }
}
