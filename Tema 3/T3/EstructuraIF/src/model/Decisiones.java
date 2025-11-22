package model;

import java.util.Scanner;

public class Decisiones {
    Scanner lectorTeclado;
    public void estructuraIF(int nota) {
        // 8
        System.out.println("Vamos a explicar la estructura IF");
        if (nota >= 5) {
            System.out.println("El examen esta aprobado");
        } else {
            System.out.println("El examen esta suspenso");
        }
        System.out.println("Terminando evaluacion");
    }

    public void estructuraIFELSEIF(double nota) {
        // 0 -> desastroso
        // 1-3.99 -> mal
        // 4-4.99 -> raspado
        // 5-7.99 -> bien
        // 8-8.99 -> notable
        // 9-9.99 -> sobresaliente
        // 10 -> MH
        System.out.println("Iniciando la evaluacion del examen");
        if (nota >= 0 && nota <= 10) {
            if (nota < 1) {
                System.out.println("Examen desastroso");
            } else if (nota < 4) {
                System.out.println("Examen mal");
            } else if (nota < 5) {
                System.out.println("Examen suspendo raspado");
            } else if (nota < 8) {
                System.out.println("Examen bien");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("Examen de MH");
            }
        } else {
            System.out.println("Rango incorrecto");
        }
        /*if (nota < 1) {
            System.out.println("Examen desastroso");
        } else if (nota < 4) {
            System.out.println("Examen mal");
        } else if (nota < 5) {
            System.out.println("Examen suspendo raspado");
        } else if (nota < 8) {
            System.out.println("Examen bien");
        } else if (nota < 9) {
            System.out.println("Examen notable");
        } else if (nota < 10) {
            System.out.println("Examen sobresaliente");
        } else{
            System.out.println("Examen de MH");
        }*/
        System.out.println("Finalizando la evaluacion");
    }

    public void ejercicio4T2() {
        /*
        Desarrolla un programa que pida un número al usuario
        y determine si es par o impar usando el operador módulo.
        Muestra el resultado por consola.
         */
        lectorTeclado = new Scanner(System.in);
        System.out.println("Dime que numero quieres evaluar");
        int numero = lectorTeclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero "+ numero+" es par%n");
        } else {
            System.out.printf("El numero %d es impar%n",numero);
        }
        // lectorTeclado.close();
        lectorTeclado = null;

    }

    public void ejercicio10T2(int horas){
        /*
        Crea un programa que pida el salario base por hora,
        las horas trabajadas y si ha hecho horas extra (true/false).
        Si ha hecho horas extra y trabajó más de 40 horas,
        las horas que excedan de 40 se pagan al doble.
         */

        lectorTeclado = new Scanner(System.in);
        System.out.println("Indica cuando cobras por hora");
        int salarioHora = lectorTeclado.nextInt();
        System.out.println("Indica cuantas horas has trabajado");
        int horasTrabajadas = lectorTeclado.nextInt();
        System.out.println("Has trabajado horas extras");
        boolean horasExtras = lectorTeclado.nextBoolean();
        // 35
        int salarioTotal=0;

        if (horasExtras && horasTrabajadas>horas){
            // 55 - 35 = 20
            int numeroHorasExtras = horasTrabajadas-horas;
            salarioTotal = numeroHorasExtras * (salarioHora*2) ;
        }
        salarioTotal += horas *salarioHora;
        // System.out.println("El salario cobrado este mes es "+salarioTotal+" euros");
        // 3.19 -> %.2f
        // 3 -> %d
        // "Euros" -> %s
        // true -> %b
        // A -> %c
        System.out.printf("\nEl salario cobrado este mes es %d %s\n",salarioTotal,"Dolar");
        lectorTeclado.close();
    }

    public void ejercicio10() { //Calculadora de salario con condiciones
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Introduce el salario por hora: ");
        int salarioHora = lectorTeclado.nextInt();
        System.out.print("Introduce las horas trabajadas: ");
        int horas = lectorTeclado.nextInt();
        lectorTeclado.nextLine(); // Limpiar el buffer
        System.out.println("¿Has hecho horas extra? (true/false): " +(horas > 40));

        int horasNormales = Math.min(horas, 40);
        System.out.println("Horas normales (máximo 40): " +horasNormales);

        System.out.println("Horas extras: " + Math.max(0, horas - 40));

        int horasExtra = Math.max(0, horas - 40);
        boolean horasExtraSiNo = horas>40;
        System.out.println("Trabajaste más de 40 horas?: " +horasExtraSiNo);
        System.out.println("Tienes derecho a horas extra?: " +horasExtraSiNo);
        System.out.println("Se aplican horas extra (>40 AND permitido)?: " +horasExtraSiNo);

        double salarioNormales = (double)salarioHora*horasNormales;
        System.out.printf("Salario por horas normales: %.2f\n",salarioNormales);

        double salarioExtras = (double)horasExtra*(salarioHora*2);
        System.out.printf("Salario por horas extra (al doble): %.2f\n",salarioExtras);

        double salarioTotal = (double)salarioExtras+salarioNormales;
        System.out.printf("Salario TOTAL: %.2f\n",salarioTotal);
    }
}

