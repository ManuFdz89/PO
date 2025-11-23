package Operaciones;

import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class SwitchFor {

    Scanner teclado = new Scanner(System.in);

    public void ejercicio1(){

        teclado = new Scanner(System.in);

        System.out.println("Introduce un número (1-7): ");
        int dia = teclado.nextInt();

        String nombreDia;

        switch (dia){
            case 1 -> nombreDia = "Lunes";
            case 2 -> nombreDia = "Martes";
            case 3 -> nombreDia = "Miercoles";
            case 4 -> nombreDia = "Jueves";
            case 5 -> nombreDia = "Viernes";
            case 6 -> nombreDia = "Sábado";
            case 7 -> nombreDia = "Domingo";
            default -> nombreDia = "Número no válido";
        }

        System.out.printf("el dia %d es: %s%n", dia, nombreDia);

    }
    public void ejercicio2(){

        System.out.println("Introduce tu calificacion (A-F): ");
        String nota = teclado.next();
        String calificacion;

        switch (nota.toLowerCase()){
            case "a" -> calificacion = "Excelente";
            case "b" -> calificacion = "Muy bien";
            case "c" -> calificacion = "Bien";
            case "d" -> calificacion = "Suficiente";
            case "f" -> calificacion = "Insuficiente";
            default -> calificacion = "Nota no válida";
        }
        System.out.printf("Calificacion %s: %s%n", nota.toUpperCase(), calificacion);


    }
    public void ejercicio3(){
        System.out.print("Introduce el primer numero: ");
        int numUno = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numDos = teclado.nextInt();
        System.out.println("Introduce la operación (+, -, *, /): ");
        String operaciones = teclado.next();

        int resultado = switch (operaciones){
            case "+" -> numUno+numDos;
            case "-" -> numUno-numDos;
            case "*" -> numUno*numDos;
            case "/" -> numUno/numDos;
            default -> 0;
        };
        System.out.printf("Resultado: %d %s %d = %d", numUno, operaciones, numDos, resultado);
    }
    public void ejercicio4(){
        System.out.println("----MENU----");
        System.out.println("1. Ver Perfil");
        System.out.println("2. Configuracion");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
        int seleccion = teclado.nextInt();

        String resultado ="";

        resultado= switch (seleccion){
            case 1 -> "Ver perfil";
            case 2 -> "Configuración";
            case 3 -> "Ayuda";
            case 4 -> "Salir";
            default -> "Selecciona un valor admitido.";
        };
        System.out.printf("Has seleccionado: %s%n", resultado);

    }
    public void ejercicio5(){
        System.out.println("Introduce el numero del mes (1-12): ");
        int mes = teclado.nextInt();
        String estacion = "";

        switch (mes){
            case 12, 1, 2:
                estacion = "Invierno";
                break;
            case 3, 4, 5:
                estacion = "Primavera";
                break;
            case 6, 7, 8:
                estacion = "Verano";
                break;
            case 9, 10, 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Selecciona un numero válido";
        }
        System.out.printf("El mes %d corresponde a: %s%n", mes, estacion);
    }
    public void ejercicio6(){
        System.out.print("Introduce un número:");
        int numero = teclado.nextInt();
        int i;
        System.out.printf("-------  Tabla del %d  --------%n",numero);
        for (i=1; i<=10; i++){
            System.out.printf("          %d x %d = %d%n", numero, i, (numero*i));
        }

    }
    public void ejercicio6_2(){
        System.out.print("Introduce un número:");
        int numero = teclado.nextInt();
        System.out.print("Introduce un 2º número:");
        int numero2 = teclado.nextInt();
        int i=0;
        int y;
        int menor;
        int mayor;
        //System.out.printf("-------  Tabla del %d  --------%n",i);
       if (numero>numero2) {
           menor = numero2;
           mayor = numero;
       }else {
           menor = numero;
           mayor = numero2;
       }
       for (i = menor; i <= mayor; i++) {
           // System.out.printf("          %d x %d = %d%n", numero, i, (numero * i));
           System.out.printf("  ----  Tabla del %d  ----  %n%n", i);
           for (y = 1; y <= 10; y++) {
               System.out.printf("         %d x %d = %d%n", i, y, (i * y));
           }
           System.out.println();

       }
    }
    public void ejercicio7(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        int resultado = 0;
        System.out.print("Sumando: ");
        for (int i=1; i<=numero; i++){
            resultado += i;              //resultado = resultado+i; es lo mismo las dos opciones
            if (i!=numero){
                System.out.print(i + " + ");
            }else {
                System.out.println(i);
            }
        }
        System.out.printf("La suma de números del 1 al %d es: %d%n",numero, resultado);
    }
    public void ejercicio8(){
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        int contadorPar=0;
        int contadorImpar=0;

        System.out.printf("Recorriendo numeros del %d al %d%n", 1, numero);

        for (int i = 1; i <= numero; i++) {
            if (i%2==0){
                contadorPar++;
            }else {
                contadorImpar++;
            }
        }
        System.out.println("Numeros pares encontrados: "+contadorPar);
        System.out.println("Numeros impares encontrados: "+contadorImpar);
    }
    public void ejercicio9(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        long resultado = 1;

        System.out.printf("Calculando %d!%n", numero);

        for (int i = numero; i > 0 ; i--) {
            resultado *= i;

            if (i==1) {
                System.out.println(i);
            }else {
                System.out.print(i+" x ");
            }
        }
        System.out.printf("El factorial de %d es: %d",numero ,resultado);
    }
    public void ejercicio10(){
        System.out.println("--- EJERCICIOS ---");
        System.out.println("1. Flexiones");
        System.out.println("2. Abdominales");
        System.out.println("3. Sentadillas");

        System.out.print("Elige un ejercicio (1-3):");
        int ejercicio = teclado.nextInt();

        String nEjercicio="";

        switch (ejercicio){
            case 1 -> nEjercicio= "Flexiones";
            case 2 -> nEjercicio= "Abdominales";
            case 3 -> nEjercicio= "Sentadillas";
        }
        if (ejercicio<1 || ejercicio>3){
            System.out.println("Introduce un valor válido");
        }else {
            System.out.print("¿Cuantas repeticiones?");
            int repeticiones = teclado.nextInt();
            System.out.println("Has Elegido: " + nEjercicio);
            for (int i = 1; i <= repeticiones; i++) {
                System.out.printf("Repeticion %d completada%n", i);
            }
            System.out.printf("¡Ejercicio completado! Has hecho %d %s.%n", repeticiones, nEjercicio);
        }
    }





    public void scn(){
        teclado.close();
    }


}
