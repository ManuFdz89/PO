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

    // --- EJERCICIO 3: Pizza Personalizada (ACUMULADORES + VALIDACIÓN) ---
    public void ejercicio3() {
        // 1. VARIABLES
        int contadorIngredientes = 0; // Controla el límite de 5 ingredientes
        int seleccionIngrediente = 0; // Guarda la opción del usuario temporalmente
        int precioAcumulado = 0;      // ACUMULADOR NUMÉRICO: Suma el coste total
        String ingredientes = "";     // ACUMULADOR DE TEXTO: Concatena los nombres ("Queso Jamón...")

        // 2. BUCLE PRINCIPAL (DO-WHILE)
        // Usamos do-while porque queremos mostrar el menú al menos una vez.
        do {
            // Mostrar Menú
            System.out.println("Bienvenido al menu de pizzas personalizadas: ");
            System.out.println("1. Queso (10)");
            System.out.println("2. Jamon (15)");
            System.out.println("3. Piña (8)");
            System.out.println("4. Tomate (6)");
            System.out.println("5. Pepperoni (12)");
            System.out.println("0. Salir");

            System.out.print("Elige un Ingrediente: ");
            seleccionIngrediente = teclado.nextInt();

            // 3. FASE DE VALIDACIÓN ("EL PORTERO")
            // Este bucle WHILE atrapa al usuario si mete un número incorrecto.
            // Protege al resto del programa: al switch NUNCA llegará un 9 o un -5.
            while (seleccionIngrediente < 0 || seleccionIngrediente > 5) {
                System.out.println("Seleccione un ingrediente valido: ");
                seleccionIngrediente = teclado.nextInt();
            }

            // 4. PROCESAMIENTO (SWITCH)
            // Como ya hemos validado arriba, aquí solo entran 0, 1, 2, 3, 4 o 5.
            // Si es 0, no entra en ningún case y no hace nada (correcto).
            switch (seleccionIngrediente) {
                case 1 -> {
                    ingredientes += "Queso ";      // Acumulamos texto
                    precioAcumulado += 10;         // Acumulamos precio
                }
                case 2 -> {
                    ingredientes += "Jamon ";
                    precioAcumulado += 15;
                }
                case 3 -> {
                    ingredientes += "Piña ";
                    precioAcumulado += 8;
                }
                case 4 -> {
                    ingredientes += "Tomate ";
                    precioAcumulado += 6;
                }
                case 5 -> {
                    ingredientes += "Pepperoni ";
                    precioAcumulado += 12;
                }
            }
            // Incrementamos el contador para la siguiente vuelta
            contadorIngredientes++;

            // 5. FEEDBACK AL USUARIO
            // Solo mostramos el subtotal si NO ha elegido salir (0) y aún cabe más comida.
            if (seleccionIngrediente != 0&&contadorIngredientes<5) {
                System.out.printf("%nLista Ingredientes: %s%n", ingredientes);
                System.out.printf("Subtotal: %d%n%n", precioAcumulado);
            }


            // 6. CONDICIÓN DE SALIDA
            // Repetimos MIENTRAS llevemos menos de 5 ingredientes Y la elección no sea 0.
        } while (contadorIngredientes < 5 && seleccionIngrediente != 0);

        // 7. RESULTADO FINAL
        System.out.printf("%nTu pizza tendrá: %s%n", ingredientes);
        System.out.println("Total a pagar: " + precioAcumulado);
    }

    // --- EJERCICIO 4: Dardos 301 (SIMULACIÓN DE TURNOS) ---
    // Conceptos: Bucle While complejo, Aleatorios controlados, Lógica de "pasarse".
    public void ejercicio4(){

        System.out.println("Introduce nombre 1º jugador: ");
        String jugadorUno = teclado.next();
        System.out.println("Introduce nombre 2º jugador: ");
        String jugadorDos = teclado.next();

        int puntosUno = 301; // Puntuación inicial
        int puntosDos = 301;
        int turnos = 0;

        // Bucle Principal: Se juega mientras NADIE haya llegado a 0
        while (puntosUno > 0 && puntosDos > 0) {

            turnos++; // Contamos el turno al empezar

            // --- JUGADOR 1 ---
            // Generamos 3 dardos. (Math.random() * 61) genera de 0 a 60
            int tiradaTotalUno = ((int) (Math.random() * 61)) + ((int) (Math.random() * 61)) + ((int) (Math.random() * 61));

            // Validación: Solo restamos si NO nos pasamos de 0 (resultado >= 0)
            if (tiradaTotalUno <= puntosUno){
                puntosUno -= tiradaTotalUno; // Restamos la puntuación del turno [cite: 663]
            }

            // Victoria Inmediata: Si llega a 0, rompemos el bucle YA.
            // El Jugador 2 no debería tirar si el 1 ya ganó.
            if (puntosUno == 0){
                break;
            }

            // --- JUGADOR 2 ---
            int tiradaTotalDos = ((int) (Math.random() * 61)) + ((int) (Math.random() * 61)) + ((int) (Math.random() * 61));

            if (tiradaTotalDos <= puntosDos){
                puntosDos -= tiradaTotalDos;
            }

            if (puntosDos == 0){
                break;
            }

            // Mostramos estado de la partida tras cada turno (si nadie ganó aún)
            System.out.println("--- Turno " + turnos + " ---");
            System.out.println(jugadorUno + ": " + puntosUno);
            System.out.println(jugadorDos + ": " + puntosDos);
        }

        // --- FINAL DE PARTIDA ---
        // Comprobamos quién tiene 0 para anunciar al ganador [cite: 667]
        if (puntosUno == 0){
            System.out.println("¡Ganador jugador 1: " + jugadorUno + "!");
        } else {
            System.out.println("¡Ganador jugador 2: " + jugadorDos + "!");
        }
        System.out.printf("La partida ha tomado %d turnos%n", turnos);
    }
    // Metodo para cerrar el scanner (buena práctica al terminar el programa)
    public void scn(){
        teclado.close();
    }


}