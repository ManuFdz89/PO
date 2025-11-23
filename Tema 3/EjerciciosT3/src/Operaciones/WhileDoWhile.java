package Operaciones;

import java.util.Scanner;
import java.time.LocalTime;

public class WhileDoWhile {

    Scanner teclado = new Scanner(System.in);

    public void ejercicio1(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        System.out.println("Contando con while:");
        int contador = 1;
        while (contador<=numero){
            System.out.println(contador);
            contador++;
        }
        System.out.println("Fin del conteo");
    }
    public void ejercicio2(){
       int contrasenia;

        do {
            System.out.print("Introduce una contraseña: ");
            contrasenia = teclado.nextInt();
            if (contrasenia!=1234) {
                System.out.println("Contraseña Incorrecta");
            }
        }while (contrasenia!=1234);

        System.out.println("Contraseña correcta");
    }
    public void ejercicio3(){
    /*    int numero=1;
        int suma=0;
        while (numero>0){
            System.out.print("introduce un numero (0 o negativo para terminar): ");
            numero = teclado.nextInt();
            if(numero<0){
                break;
            }else {
                suma += numero;
                System.out.println("suma actual: " + suma);
            }
        }
        System.out.println("Programa terminado. Suma total: "+suma);*/
        System.out.print("introduce un numero (0 o negativo para terminar): ");
        int numero = teclado.nextInt();
        int suma=0;

        while (numero>0){
            suma+=numero;
            System.out.println("Suma actual: " + suma);
            System.out.print("introduce un numero (0 o negativo para terminar): ");
            numero = teclado.nextInt();
        }
        System.out.println("Programa terminado. Suma total: "+suma);

    }
    public void ejercicio4(){
        int numeroAleatorio = (int) (Math.random()*10)+1;
        System.out.println("¡Adivina el numero entre 1 y 10!");
        int contador=0;
        int numero;

        do {
            System.out.print("Introduce tu intento: ");
            numero = teclado.nextInt();
            contador++;
            if (numeroAleatorio>numero){
                System.out.println("El numero es mayor. Intentalo de nuevo");
            }else if(numero>numeroAleatorio) {
                System.out.println("El numero es menor. Intentalo de nuevo");
            }
        }while (numeroAleatorio!=numero);

        System.out.printf("¡Correcto! has adivinado el numero en %d intentos%n",contador);


    }
    public void ejercicio5(){

        int opcion;
        LocalTime hora;

        do {
            System.out.println("--- Menú --");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Ver hora");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1 -> System.out.printf("¡Hola! ¿Como estas?%n%n");
                case 2 -> System.out.printf("¡Adiós!%n%n");
                case 3 ->{
                    hora = LocalTime.now();
                    System.out.printf("La hora actual es: %tR%n%n ",hora);
                }
                case 4 -> System.out.printf("¡Hasta luego!%n%n");
                default -> System.out.printf("Introduce un valor valido%n%n");
            }
        }while (opcion!=4);

    }
    public void ejercicio6(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        //int contador = numero;
        while (numero>0){
            System.out.println(numero);
            numero--;
        }
        System.out.println("Despegue!");
    }
    public void ejercicio7(){

        System.out.print("¿Cuantas calificaciones vas a introducir?: ");
        int cantidad = teclado.nextInt();

        int contador = 0;
        double suma = 0;
        double calificacion;

        while (contador!=cantidad){
            contador++;
            System.out.print("Introduce tu calificacion "+contador+": ");
            calificacion = teclado.nextDouble();
            suma += calificacion;
        }

        System.out.println("Suma total: "+suma);
        System.out.println("Promedio de calificaciones: "+(suma/contador));

    }
    public void ejercicio8(){
        int edad;
        do {
            System.out.print("Introduce tu edad: ");
            edad = teclado.nextInt();
            if (edad<0 || edad>120) {
                System.out.println("Edad no válida. Debe estar entre 0 y 120");
            }
        }while (edad<0 || edad>120);
        System.out.printf("Edad válida: %d años. ¡Gracias!%n",edad);
    }
    public void ejercicio9(){

        System.out.print("¿cuantos estudiantes hay?: ");
        int nEstudiantes = teclado.nextInt();
        int contador = 0;
        int[] notas = new int[nEstudiantes];
        String nota;

        while (nEstudiantes!=contador){
            System.out.printf("Introduce la nota del estudiante %d (0-10): ",contador+1);
            notas[contador] = teclado.nextInt();
            while (notas[contador]>10 || notas[contador]<0){
                System.out.print("Introduce una nota válida (0-10): ");
                notas[contador] = teclado.nextInt();
            }
            contador++;
        }
        System.out.println("----- Reporte de calificaciones -----");
        for (int i = 0; i < nEstudiantes; i++) {
            switch (notas[i]){
                case 9,10 -> nota = "A";
                case 7,8 -> nota = "B";
                case 5,6 -> nota = "C";
                case 3,4 -> nota = "D";
                case 0, 1,2 -> nota = "F";
                default -> nota = "Inválida";
            }
            System.out.printf("Estudiante %d: %d puntos = Calificación %s%n",i+1,notas[i],nota);
        }
    }
    public void ejercicio10(){

        int saldo = 1000;
        int opcion;
        int retirada;
        int deposito;

        System.out.println("---  Cajero Automatico  ---");
        System.out.printf("Saldo inicial: %d €%n",saldo);


        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");

            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Tu saldo actual es: "+saldo);
                case 2 -> {
                    System.out.print("¿Cuanto desea retirar?: ");
                    retirada = teclado.nextInt();
                    while (saldo<retirada || retirada<0){
                        System.out.println("Fondos insuficientes. Tu saldo es: "+saldo);
                        System.out.print("¿Cuanto desea retirar?: ");
                        retirada = teclado.nextInt();
                    }
                    System.out.println("Retiro exitoso. Has retirado: "+retirada);
                    saldo -= retirada;
                    System.out.println("Nuevo saldo: "+saldo);
                    }
                case 3 -> {
                    System.out.println("¿Cuanto desea depositar?: ");
                    deposito = teclado.nextInt();
                    while(deposito<0){
                        System.out.println("Deposito erroneo, no puede depositar dinero en negativo");
                        System.out.println("¿Cuanto desea depositar?: ");
                        deposito = teclado.nextInt();
                    }
                    System.out.println("Deposito exitoso. Has depositado: "+deposito);
                    saldo += deposito;
                    System.out.println("Nuevo saldo: "+saldo);
                }
                case 4 -> System.out.println("Gracias por usar el cajero");
                default -> System.out.println("Elija una opcion correcta");
            }
        }while (opcion!=4);
    }


    public void scn(){
        teclado.close();
    }
}
