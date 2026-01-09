package Operaciones;
import java.util.Scanner;

public class ArrMultidimensionales {

    // Scanner global para usar en todos los métodos
    Scanner teclado = new Scanner(System.in);

    // --- EJERCICIO 1: Recorrido Básico ---
    // Concepto: Inicialización directa y doble bucle for anidado.
    public void ejercicio1(){
        // Declaración e inicialización en una línea.
        // Es una matriz de 3 filas y 3 columnas (3x3).
        int[][] matriz = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        // Bucle externo: Recorre las FILAS (i va de 0 a matriz.length)
        for (int i = 0; i < matriz.length; i++) {
            // Bucle interno: Recorre las COLUMNAS de la fila actual (j va de 0 a matriz[i].length)
            for (int j = 0; j < matriz[i].length; j++) {
                // Imprime el elemento sin salto de línea
                System.out.print(matriz[i][j]+" ");
            }
            // Salto de línea al terminar cada fila para dar forma de tabla
            System.out.println();
        }
    }
    // --- EJERCICIO 2: Entrada de Usuario ---
    // Concepto: Llenar una matriz vacía con datos introducidos por teclado.
    public void ejercicio2() {
        // Matriz vacía de 2 filas y 4 columnas. Todos los valores inician en 0.
        int[][] matriz = new int[2][4];

        // FASE 1: Rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce el valor para la posicion [%d][%d]: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        // FASE 2: Mostrar la matriz resultante
        System.out.print("Matriz resultante: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // --- EJERCICIO 3: Suma Total ---
    // Concepto: Acumulador. Recorrer todos los elementos y sumarlos en una variable.
    public void ejercicio3(){
        // Matriz irregular (o rectangular) inicializada con valores.
        int[][] matriz = new int[][]{{1,2,3,13},{4,5,6,14},{7,8,9,15},{10,11,12,16}};

        int suma = 0; // Acumulador iniciado en 0
        System.out.println("Matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
                // Sumamos el elemento actual al acumulador
                suma += matriz[i][j];
            }
            System.out.println();
        }
        System.out.print("\nSuma total de elementos: "+suma);
    }
    // --- EJERCICIO 4: Búsqueda Secuencial ---
    // Concepto: Buscar un valor específico y usar una bandera (flag) para saber si se encontró.
    public void ejercicio4(){
        int[][] matriz = new int[][]{{1,2,3,13,20},{4,5,6,14,24},{7,8,9,15,21}};

        boolean bandera = false; // Flag: false = no encontrado, true = encontrado

        // Imprimir matriz (código estándar de visualización)
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("\nIntroduce el numero a buscar: ");
        int numero = teclado.nextInt();

        // Recorrido de búsqueda
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero == matriz[i][j]){
                    // Si coincide, mostramos coordenadas y activamos la bandera
                    System.out.printf("el numero %d se encuentra en la posicion [%d][%d]%n",numero,i,j);
                    bandera = true;
                    // NOTA: Aquí podrías poner un 'return' o etiquetas si quisieras parar al encontrar el primero.
                }
            }
        }

        // Si al terminar de recorrer toda la matriz la bandera sigue en false...
        if (!bandera) {
            System.out.println("el numero no se encuentra en la matriz");
        }
    }
    // --- EJERCICIO 5: Promedio por Fila ---
    // Concepto: Procesar datos fila a fila. Usamos un array auxiliar para guardar resultados.
    public void ejercicio5(){
        double[][] matriz = new double[4][3];
        // Array unidimensional para guardar el promedio de cada fila
        double[] promedio = new double[matriz.length]; // Tamaño = número de filas (4)

        System.out.println("Matriz: ");

        // Rellenar con aleatorios y mostrar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Aleatorio entre 1.0 y 9.99...
                matriz[i][j] = (Math.random()*9)+1;
                System.out.printf("%.1f ",matriz[i][j]);
            }
            System.out.println();
        }

        // Calcular promedios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Sumamos los valores de la fila 'i' en la posición 'i' del array promedio
                promedio[i] += matriz[i][j];
            }
            // Al terminar la fila (bucle interno), dividimos la suma por la cantidad de columnas
            System.out.printf("Promedio de fila %d: %.2f%n",i,(promedio[i]/ matriz[i].length));
        }
    }
    // --- EJERCICIO 6: Mayor por Columna ---
    // Concepto: Recorrer por COLUMNAS primero. Algoritmo de máximo.
    public void ejercicio6(){
        int[][] matriz = new int[3][4];
        // Array auxiliar para guardar el mayor de cada columna. Tamaño = nº columnas
        int[] mayor = new int[matriz[0].length];

        System.out.println("\nMatriz: \n");
        // Rellenamos e inicializamos el array 'mayor' con valores base
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random()*50));
                System.out.printf("%d ",matriz[i][j]);
                // Inicializamos temporalmente 'mayor' con valores de la matriz para tener algo con qué comparar
                // NOTA: Esto sobrescribe valores en cada fila, pero asegura que 'mayor' tiene datos válidos.
                mayor[j] = matriz[i][j];
            }
            System.out.println("");
        }

        // Recorrido INVERTIDO: Columna externa, Fila interna
        // i recorre COLUMNAS (0 a 3)
        for (int i = 0; i < matriz[0].length; i++) {
            // j recorre FILAS (0 a 2)
            for (int j = 0; j < matriz.length; j++) {
                // Buscamos el mayor en la columna 'i'
                // OJO: Aquí 'mayor[i]' debería haberse reiniciado o usar logica diferente si no se inicializó bien arriba.
                // En este caso, funciona porque compara contra el valor actual guardado.
                if (matriz[j][i] > mayor[i]){
                    mayor[i] = matriz[j][i];
                }
            }
            System.out.printf("%nMayor columna %d: %d",i,mayor[i]);
        }
        System.out.println();
    }
    // --- EJERCICIO 7: Matriz Traspuesta ---
    // Concepto: Cambiar filas por columnas. Imprimir matriz[j][i] en vez de matriz[i][j].
    public void ejercicio7(){
        int[][] matriz = new int[3][4];

        System.out.println("\nMatriz original: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random()*50));
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\nMatriz traspuesta: \n");
        // Bucle externo: Columnas de la original (0 a 3) -> Serán filas de la traspuesta
        for (int i = 0; i < matriz[0].length; i++) {
            // Bucle interno: Filas de la original (0 a 2) -> Serán columnas de la traspuesta
            for (int j = 0; j < matriz.length; j++) {
                // Imprimimos invirtiendo índices: [j][i]
                System.out.printf("%d ",matriz[j][i]);
            }
            System.out.println();
        }
    }
    // --- EJERCICIO 8: Contadores (Pares e Impares) ---
    // Concepto: Contar elementos que cumplen una condición.
    public void ejercicio8(){
        int[][] matriz = new int[4][5];
        int par = 0;
        int imPar = 0;

        System.out.println("\nMatriz: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random()*50));
                System.out.printf("%d ",matriz[i][j]);

                // Operador módulo (%) para saber si es par
                if (matriz[i][j] % 2 == 0){
                    par++;
                } else {
                    imPar++;
                }
            }
            System.out.println();
        }
        System.out.println("\nNumeros pares: "+par);
        System.out.println("Numeros impares: "+imPar);
    }
    // --- EJERCICIO 9: Tabla de Multiplicar (Generativa) ---
    // Concepto: El valor de la celda depende de sus coordenadas (i, j).
    public void ejercicio9(){
        int[][] matriz = new int[10][10];
        System.out.println("Tabla de multiplicar (10x10): ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Valor = (Fila + 1) * (Columna + 1)
                matriz[i][j] = (i+1) * (j+1);
                // Uso de \t (tabulador) para alinear columnas visualmente
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    // --- EJERCICIO 10: Sistema Completo de Notas ---
    // Concepto: Matriz dinámica (tamaño definido por usuario), múltiples cálculos (filas, columnas, máximos) y formateo avanzado.
    public void ejercicio10(){

        System.out.print("Cuantos estudiantes hay?: ");
        int estudiantes = teclado.nextInt(); // Define filas
        System.out.print("Cuantas asignaturas hay?: ");
        int asignaturas = teclado.nextInt(); // Define columnas
        System.out.println();

        double[][] matriz = new double[estudiantes][asignaturas];
        // Arrays auxiliares para guardar resultados y no tener que calcularlos dos veces
        double[] promedio = new double[matriz.length]; // Promedios por Estudiante (filas)
        double[] promedioA = new double[matriz[0].length]; // Promedios por Asignatura (columnas)

        // Inicializamos con un valor seguro (aunque luego se sobreescribirá)
        double notaAlta = 0;

        // 1. Entrada de datos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Introduce la nota del estudiante %d, asignatura %d: ",(i+1),(j+1));
                matriz[i][j] = teclado.nextDouble();
            }
        }

        // 2. Visualización de Tabla Bonita
        System.out.println("\n---  TABLA DE NOTAS  ---\n");
        System.out.print("\t\t"); // Espacio para la cabecera "Est"

        // Cabecera de asignaturas
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("   Asig%d",(i+1));
        }
        System.out.println();

        // Cuerpo de la tabla
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Est %d: ",(i+1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("\t\t%.1f",matriz[i][j]);
            }
            System.out.println();
        }

        // 3. Cálculos: Promedio por Estudiante (Filas)
        System.out.println("\n---  PROMEDIO POR ESTUDIANTE  ---\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                promedio[i] += matriz[i][j];
            }
            System.out.printf("Estudiante %d: %.2f%n",(i+1),(promedio[i]/ matriz[i].length));
        }

        // 4. Cálculos: Promedio por Asignatura (Columnas)
        System.out.println("\n---  PROMEDIO POR ASIGNATURA  ---\n");
        // Recorremos primero por columnas
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                promedioA[i] += matriz[j][i];
            }
            System.out.printf("Asignatura %d: %.2f ",(i+1),(promedioA[i]/matriz.length));
            System.out.println();
        }

        // 5. Cálculos: Nota más alta (Máximo global)
        System.out.println("\n---  NOTA MAS ALTA  ---\n");
        int estudiante = 0;
        int asignatura = 0;
        // Reiniciamos notaAlta con el primer valor real de la matriz para asegurar comparación justa
        notaAlta = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > notaAlta){
                    notaAlta = matriz[i][j];
                    estudiante = i+1; // Guardamos índice + 1 para mostrar
                    asignatura = j+1;
                }
            }
        }
        System.out.printf("La nota mas alta es %.1f (Estudiante %d, Asignatura %d)",notaAlta,estudiante,asignatura);
    }}
