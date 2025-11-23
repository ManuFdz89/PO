package Operaciones;

import java.util.Scanner;
import java.time.LocalTime; // Importamos LocalTime para el Ejercicio 5

public class WhileDoWhile {

    // Creamos el Scanner a nivel de clase para reutilizarlo en todos los métodos
    Scanner teclado = new Scanner(System.in);

    // --- EJERCICIO 1: Contador Básico (WHILE) ---
    // Concepto: El bucle while evalúa la condición ANTES de entrar.
    public void ejercicio1(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        System.out.println("Contando con while:");
        int contador = 1;
        while (contador <= numero){
            System.out.println(contador);
            contador++; // Importante: Incrementar para evitar bucle infinito
        }
        System.out.println("Fin del conteo");
    }

    // --- EJERCICIO 2: Validar Contraseña (DO-WHILE) ---
    // Concepto: Do-While asegura AL MENOS UNA ejecución (ideal para pedir datos obligatorios).
    public void ejercicio2(){
        int contrasenia;

        do {
            System.out.print("Introduce una contraseña: ");
            contrasenia = teclado.nextInt();

            // Mensaje de error solo si falla
            if (contrasenia != 1234) {
                System.out.println("Contraseña Incorrecta");
            }
        } while (contrasenia != 1234); // Repite MIENTRAS sea incorrecta

        System.out.println("Contraseña correcta");
    }

    // --- EJERCICIO 3: Suma Acumulativa (WHILE con Lectura Anticipada) ---
    // Concepto: "Lectura Anticipada" (Priming Read). Pedimos el dato una vez fuera
    // y luego lo actualizamos al final del bucle. Evita usar banderas o breaks forzados.
    public void ejercicio3(){
        /* Versión comentada con Break (válida pero menos académica) */

        // Versión Limpia (Clean Code):
        System.out.print("introduce un numero (0 o negativo para terminar): ");
        int numero = teclado.nextInt(); // 1. Lectura inicial
        int suma = 0; // Acumulador (empieza en 0 para sumas)

        while (numero > 0){ // 2. Evaluación
            suma += numero; // 3. Proceso
            System.out.println("Suma actual: " + suma);

            // 4. Actualización para la siguiente vuelta
            System.out.print("introduce un numero (0 o negativo para terminar): ");
            numero = teclado.nextInt();
        }
        System.out.println("Programa terminado. Suma total: "+suma);
    }

    // --- EJERCICIO 4: Adivinar Número (DO-WHILE + RANDOM) ---
    // Concepto: Generación de aleatorios y pistas condicionales.
    public void ejercicio4(){
        // Fórmula: (Math.random() * RANGO) + INICIO
        int numeroAleatorio = (int) (Math.random() * 10) + 1;

        System.out.println("¡Adivina el numero entre 1 y 10!");
        int contador = 0;
        int numero;

        do {
            System.out.print("Introduce tu intento: ");
            numero = teclado.nextInt();
            contador++; // Contamos intentos

            // Pistas con IF-ELSE IF para cubrir las 3 posibilidades (mayor, menor, igual)
            if (numeroAleatorio > numero){
                System.out.println("El numero es mayor. Intentalo de nuevo");
            } else if(numero > numeroAleatorio) {
                System.out.println("El numero es menor. Intentalo de nuevo");
            }
            // Si son iguales, no entra en los IF y el while termina.

        } while (numeroAleatorio != numero);

        System.out.printf("¡Correcto! has adivinado el numero en %d intentos%n", contador);
    }

    // --- EJERCICIO 5: Menú Recurrente (DO-WHILE + SWITCH) ---
    // Concepto: Menús que vuelven a aparecer. Uso de LocalTime y printf.
    public void ejercicio5(){
        int opcion;
        LocalTime hora;

        do {
            // Pintamos el menú dentro del DO para que se repita
            System.out.println("--- Menú --");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Ver hora");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            // Switch moderno (Java 14+) con flechas -> (más limpio, sin breaks explícitos)
            switch (opcion){
                case 1 -> System.out.printf("¡Hola! ¿Como estas?%n%n");
                case 2 -> System.out.printf("¡Adiós!%n%n");
                case 3 -> {
                    hora = LocalTime.now(); // Hora del sistema
                    // %tR formatea la hora como HH:MM (sin segundos)
                    System.out.printf("La hora actual es: %tR%n%n ", hora);
                }
                case 4 -> System.out.printf("¡Hasta luego!%n%n");
                default -> System.out.printf("Introduce un valor valido%n%n");
            }
        } while (opcion != 4); // Condición de salida: Opción 4
    }

    // --- EJERCICIO 6: Cuenta Atrás (WHILE Decremental) ---
    // Concepto: Restar en lugar de sumar dentro del bucle.
    public void ejercicio6(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        while (numero > 0){
            System.out.println(numero); // Imprimimos primero (5, 4, 3...)
            numero--; // Restamos después
        }
        System.out.println("Despegue!");
    }

    // --- EJERCICIO 7: Promedio (Contador + Acumulador + Tipos) ---
    // Concepto: Uso de 'double' para no perder decimales en la división.
    public void ejercicio7(){
        System.out.print("¿Cuantas calificaciones vas a introducir?: ");
        int cantidad = teclado.nextInt();

        int contador = 0;
        double suma = 0; // OJO: double para acumular decimales
        double calificacion;

        while (contador != cantidad){
            contador++; // Incrementamos antes para mostrar "calificacion 1" al usuario
            System.out.print("Introduce tu calificacion " + contador + ": ");
            calificacion = teclado.nextDouble();
            suma += calificacion;
        }

        System.out.println("Suma total: " + suma);
        // Al dividir double entre int, el resultado es double (correcto)
        System.out.println("Promedio de calificaciones: " + (suma / contador));
    }

    // --- EJERCICIO 8: Validación de Rango (Filtro DO-WHILE) ---
    // Concepto: "El Portero". No deja pasar hasta que el dato es válido.
    public void ejercicio8(){
        int edad;
        do {
            System.out.print("Introduce tu edad: ");
            edad = teclado.nextInt();

            // Lógica de error: Menor que 0 O (||) Mayor que 120
            if (edad < 0 || edad > 120) {
                System.out.println("Edad no válida. Debe estar entre 0 y 120");
            }
        } while (edad < 0 || edad > 120); // Repetir mientras sea inválida

        System.out.printf("Edad válida: %d años. ¡Gracias!%n", edad);
    }

    // --- EJERCICIO 9: Sistema de Notas (ARRAYS + VALIDACIÓN ANIDADA) ---
    // Concepto: Separar la Entrada de la Salida usando Arrays.
    // Lógica compleja: Bucle WHILE para recorrer estudiantes, y otro WHILE dentro para validar nota.
    public void ejercicio9(){

        System.out.print("¿cuantos estudiantes hay?: ");
        int nEstudiantes = teclado.nextInt();
        int contador = 0;
        int[] notas = new int[nEstudiantes]; // Creamos la "estantería" vacía
        String nota;

        // FASE 1: Recogida de datos
        while (nEstudiantes != contador){
            System.out.printf("Introduce la nota del estudiante %d (0-10): ", contador + 1);
            notas[contador] = teclado.nextInt();

            // VALIDACIÓN ANIDADA: Bucle "trampa" hasta que la nota sea correcta
            while (notas[contador] > 10 || notas[contador] < 0){
                System.out.print("Introduce una nota válida (0-10): ");
                notas[contador] = teclado.nextInt();
            }
            contador++; // Solo avanzamos si la nota era válida
        }

        // FASE 2: Reporte (Procesamiento posterior)
        System.out.println("----- Reporte de calificaciones -----");
        for (int i = 0; i < nEstudiantes; i++) {
            switch (notas[i]){
                case 9, 10 -> nota = "A";
                case 7, 8 -> nota = "B";
                case 5, 6 -> nota = "C";
                case 3, 4 -> nota = "D";
                case 0, 1, 2 -> nota = "F"; // OJO: Incluimos 0, 1 y 2
                default -> nota = "Inválida";
            }
            System.out.printf("Estudiante %d: %d puntos = Calificación %s%n", i + 1, notas[i], nota);
        }
    }

    // --- EJERCICIO 10: Cajero Automático (EL JEFE FINAL) ---
    // Concepto: Combina odo (Menú, Switch, While anidado, Validaciones complejas).
    public void ejercicio10(){

        int saldo = 1000;
        int opcion;
        int retirada;
        int deposito;

        System.out.println("---  Cajero Automatico  ---");
        System.out.printf("Saldo inicial: %d €%n", saldo);

        do {
            System.out.println("--- MENU ---");
            // ... (Opciones del menú) ...
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");

            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Tu saldo actual es: " + saldo);
                case 2 -> {
                    System.out.print("¿Cuanto desea retirar?: ");
                    retirada = teclado.nextInt();

                    // SEGURIDAD BANCARIA: Validamos que tenga saldo Y que no retire negativos
                    while (saldo < retirada || retirada < 0){
                        System.out.println("Fondos insuficientes o cantidad inválida. Tu saldo es: " + saldo);
                        System.out.print("¿Cuanto desea retirar?: ");
                        retirada = teclado.nextInt();
                    }
                    System.out.println("Retiro exitoso. Has retirado: " + retirada);
                    saldo -= retirada; // Actualizamos saldo
                    System.out.println("Nuevo saldo: " + saldo);
                }
                case 3 -> {
                    System.out.println("¿Cuanto desea depositar?: ");
                    deposito = teclado.nextInt();
                    // Validación simple de negativos
                    while(deposito < 0){
                        System.out.println("Deposito erroneo, no puede depositar dinero en negativo");
                        System.out.println("¿Cuanto desea depositar?: ");
                        deposito = teclado.nextInt();
                    }
                    System.out.println("Deposito exitoso. Has depositado: " + deposito);
                    saldo += deposito; // Actualizamos saldo
                    System.out.println("Nuevo saldo: " + saldo);
                }
                case 4 -> System.out.println("Gracias por usar el cajero");
                default -> System.out.println("Elija una opcion correcta");
            }
        } while (opcion != 4);
    }

    // Metodo para cerrar el scanner (buena práctica al terminar el programa)
    public void scn(){
        teclado.close();
    }
}