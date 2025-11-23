package Operaciones;

import java.util.Scanner;

public class T3Pdf {
    // Instanciamos el Scanner fuera de los métodos para poder usarlo en todos (ámbito de clase)
    Scanner teclado = new Scanner(System.in);

    // --- EJERCICIO 1: Adivinar número (1-50) ---
    public void ejercicio1() {
        // Generamos número aleatorio.
        // 1. Math.random() da 0.0 a 0.99...
        // 2. * 50 estira el rango a 0.0 - 49.99...
        // 3. (int) quita decimales (0 - 49)
        // 4. + 1 ajusta el rango final a (1 - 50) [cite: 610]
        int aleatorio = (int) (Math.random() * 50) + 1;

        // Usamos FOR porque sabemos el límite exacto de intentos (7) [cite: 610]
        for (int i = 1; i <= 7; i++) {
            System.out.println("Introduce un numero (1-50): ");
            int numero = teclado.nextInt();

            // CASO DE VICTORIA [cite: 612]
            if(numero == aleatorio){
                System.out.println("Has acertado!");
                System.out.println("Numero de intentos: " + i);
                break; // IMPORTANTE: Rompe el bucle inmediatamente si gana
            }

            // PISTAS (Mayor / Menor) [cite: 611]
            if (numero > aleatorio){
                System.out.println("el numero introducido es mayor que el elegido");
                System.out.println("Numero de intentos: " + i);
            } else {
                System.out.println("el numero introducido es menor que el elegido");
                System.out.println("Numero de intentos: " + i);
            }

            // CASO DE DERROTA [cite: 613]
            // Si llegamos al intento 7 y no hemos hecho 'break' (ganado), hemos perdido.
            if(i == 7){
                System.out.println("Has perdido, el numero elegido era el " + aleatorio);
            }
        }
    }

    // --- EJERCICIO 2: Wordle (Adivinar palabra) ---
    public void ejercicio2(){
        // Array de Strings: Nuestra "caja" con las palabras posibles [cite: 616]
        String[] palabraSecreta = new String[]{"perro","gatos","silla","balon","raton"};

        // Selección aleatoria usando la longitud del array para ser escalable
        String aleatoria = palabraSecreta[(int) (Math.random() * 5)];
        // System.out.println(aleatoria); // Debugging (comentado para jugar)

        String palabra;
        int intentos = 5; // Contador regresivo de vidas [cite: 617]

        // Bucle Principal del Juego (mientras queden vidas)
        do {
            // Bucle de Validación (DO-WHILE ANIDADO)
            // Atrapa al usuario hasta que escriba una palabra válida de 5 letras
            do {
                System.out.println("Introduce una palabra: ");
                // .toLowerCase() convierte la entrada a minúsculas para coincidir con el array "gatos"
                palabra = teclado.next().toLowerCase();

                if (palabra.length() != 5){
                    System.out.println("Palabra invalida");
                }
            } while (palabra.length() != 5);

            System.out.println("Intento numero: " + intentos);
            intentos--; // Restamos una vida tras el intento

            // Contadores locales: Se reinician a 0 en cada vuelta del bucle principal
            int aciertos = 0, aprox = 0, fallos = 0;

            // CASO VICTORIA INMEDIATA [cite: 623]
            // Usamos .equals() para comparar contenido de texto (nunca ==)
            if (aleatoria.equals(palabra)){
                System.out.println("Has acertado.");
                aciertos = 5;
                break; // Rompe el DO-WHILE principal y sale
            }

            // ANÁLISIS LETRA A LETRA (FOR)
            // Recorremos las posiciones 0, 1, 2, 3, 4

            for (int i = 0; i < aleatoria.length(); i++) {

                // 1. ACIERTO: Misma letra en misma posición [cite: 620]
                if (palabra.charAt(i) == aleatoria.charAt(i)) {
                    aciertos++;

                    // 2. APROXIMACIÓN: La letra existe en la palabra secreta (.contains) [cite: 621]
                    // NOTA: String.valueOf() convierte el char a String porque contains pide String
                } else if (aleatoria.contains(String.valueOf(palabra.charAt(i)))) {
                    aprox++;

                    // 3. FALLO: La letra no existe en absoluto [cite: 622]
                } else {
                    fallos++;
                }
            }

            // Imprimimos el reporte del turno [cite: 619]
            System.out.println("Numero de aciertos: " + aciertos);
            System.out.println("Numero de aproximaciones: " + aprox);
            System.out.println("Numero de fallos: " + fallos);

        } while (intentos > 0); // Repetir si quedan vidas

        // MENSAJE DE DERROTA FINAL
        // OJO: Si ganas justo en el último intento (intentos llega a 0),
        // entras al 'break', sales, y este IF se cumple (imprimiendo que perdiste).
        // Para arreglarlo 100%, usaríamos la bandera 'boolean ganado' que vimos.
        if (intentos == 0){
            System.out.println("has perdido, la palabra era: " + aleatoria);
        }
    }
}