package Operaciones;

import javax.swing.plaf.PanelUI; // (Esta librería no se usa, podrías borrarla)
import java.util.Scanner;

public class SwitchFor {

    Scanner teclado = new Scanner(System.in);

    // --- EJERCICIO 1: Días de la Semana ---
    // Uso del SWITCH como EXPRESIÓN (con '->'). Es más limpio y no necesita 'break'.
    public void ejercicio1(){

        teclado = new Scanner(System.in); // Reinicias el scanner (correcto, aunque no estrictamente necesario si ya es global)

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

    // --- EJERCICIO 2: Calificaciones (String) ---
    // El switch funciona con cadenas de texto.
    // Usamos .toLowerCase() para que funcione igual con "A" que con "a".
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
        // Usamos .toUpperCase() en el print para mostrarlo en mayúscula aunque el usuario lo pusiera en minúscula.
        System.out.printf("Calificacion %s: %s%n", nota.toUpperCase(), calificacion);

    }

    // --- EJERCICIO 3: Calculadora ---
    // Aquí el switch RETORNA un valor ('int') directamente a la variable 'resultado'.
    // Esto es muy útil para asignar valores limpiamente.
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
            case "/" -> numUno/numDos; // Nota: Al ser enteros, se pierden los decimales.
            default -> 0; // Obligatorio devolver algo por defecto.
        };
        System.out.printf("Resultado: %d %s %d = %d", numUno, operaciones, numDos, resultado);
    }

    // --- EJERCICIO 4: Menú Simple ---
    // Otro ejemplo de switch que retorna un valor (String en este caso).
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

    // --- EJERCICIO 5: Estaciones (Agrupación de Casos) ---
    // Aquí usas la sintaxis CLÁSICA (con dos puntos ':').
    // Nota cómo agrupas varios casos (12, 1, 2) para una misma lógica.
    // ¡IMPORTANTE! Aquí SÍ hace falta el 'break' para no saltar al siguiente caso.
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

    // --- EJERCICIO 6: Tabla de Multiplicar (Bucle FOR) ---
    // Estructura básica: for(inicio; condición; actualización).
    // Ideal cuando sabemos exactamente cuántas vueltas dar (10 en este caso).
    public void ejercicio6(){
        System.out.print("Introduce un número:");
        int numero = teclado.nextInt();
        int i;
        System.out.printf("-------  Tabla del %d  --------%n",numero);
        for (i=1; i<=10; i++){
            System.out.printf("          %d x %d = %d%n", numero, i, (numero*i));
        }

    }

    // --- EJERCICIO 6_2: Tablas en Rango (FOR ANIDADO) ---
    // Este ejercicio demuestra dos conceptos clave:
    // 1. Lógica de SWAP: Ordenar menor y mayor para que el bucle funcione siempre.
    // 2. Bucles Anidados: Un bucle dentro de otro (para cada número 'i', hacemos 10 multiplicaciones 'y').
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

        // Determinamos cuál es el rango correcto
        if (numero>numero2) {
            menor = numero2;
            mayor = numero;
        }else {
            menor = numero;
            mayor = numero2;
        }

        // Bucle externo: Recorre los números de las tablas
        for (i = menor; i <= mayor; i++) {
            // System.out.printf("          %d x %d = %d%n", numero, i, (numero * i));
            System.out.printf("  ----  Tabla del %d  ----  %n%n", i);

            // Bucle interno: Hace las 10 multiplicaciones de esa tabla
            for (y = 1; y <= 10; y++) {
                System.out.printf("         %d x %d = %d%n", i, y, (i * y));
            }
            System.out.println();

        }
    }

    // --- EJERCICIO 7: Suma Acumulativa ---
    // Concepto de ACUMULADOR: La variable 'resultado' guarda la suma vuelta tras vuelta.
    // Debe inicializarse en 0 para sumas.
    public void ejercicio7(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        int resultado = 0;
        System.out.print("Sumando: ");
        for (int i=1; i<=numero; i++){
            resultado += i;              // resultado = resultado+i; es lo mismo las dos opciones

            // Lógica visual para poner el '+' solo entre números
            if (i!=numero){
                System.out.print(i + " + ");
            }else {
                System.out.println(i);
            }
        }
        System.out.printf("La suma de números del 1 al %d es: %d%n",numero, resultado);
    }

    // --- EJERCICIO 8: Pares e Impares ---
    // Uso del operador MÓDULO (%) para saber si es par.
    // Aquí usamos CONTADORES (suman 1) en vez de acumuladores (suman valor).
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

    // --- EJERCICIO 9: Factorial ---
    // Concepto crítico: Acumulador de MULTIPLICACIÓN debe empezar en 1.
    // Usamos 'long' porque los factoriales crecen muy rápido y 'int' se queda corto.
    public void ejercicio9(){
        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();
        long resultado = 1;

        System.out.printf("Calculando %d!%n", numero);

        // Bucle inverso (decremental): i--
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

    // --- EJERCICIO 10: Menú Gimnasio ---
    // Combina SWITCH (para elegir nombre) y FOR (para contar repeticiones).
    // Incluye validación simple con IF.
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

        // Validación del rango
        if (ejercicio<1 || ejercicio>3){
            System.out.println("Introduce un valor válido");
        }else {
            System.out.print("¿Cuantas repeticiones?");
            int repeticiones = teclado.nextInt();
            System.out.println("Has Elegido: " + nEjercicio);

            // Bucle for para ejecutar las repeticiones
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