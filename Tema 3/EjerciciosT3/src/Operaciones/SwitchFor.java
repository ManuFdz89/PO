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


    public void scn(){
        teclado.close();
    }


}
