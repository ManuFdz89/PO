import java.util.Scanner;

public class Metodos {

    Scanner teclado = new Scanner(System.in);


    void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%d\t", m[i][j]); // \t es tabulador para alinear
            }
            System.out.println(); // Salto de línea al acabar la fila
        }
    }
    void imprimirArray(int[] numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"\t");
        }
    }
    public void ejercicio1(){

       /*1. Crea un programa que permita sumar arrays multidimensionales. Para ello
        siguiente estos pasos:
            a. Pide al usuario el tamaño de las matrices
            b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y 50
            c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
               de las celdas de las generadas en el punto anterior
            d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
               para poder identificarlas*/

        System.out.println("Introduce el numero de filas de las matrices: ");
        int filas = teclado.nextInt();
        System.out.println("Introduce el numero de columnas de las matrices: ");
        int columnas = teclado.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] sumaMatrices = new int[filas][columnas];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random()*50)+1;
                matriz2[i][j] = (int) (Math.random()*50)+1;
                sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("\n\t\t\t--- Matriz 1 ---\n");
        imprimirMatriz(matriz1);
        System.out.println("\n\t\t\t--- Matriz 2 ---\n");
        imprimirMatriz(matriz2);
        System.out.println("\n\t\t--- Suma de Matrices ---\n");
        imprimirMatriz(sumaMatrices);

    }


    public void ejercicio2(){

       /*2. Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
            y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
            seleccione la acción que quiere realizar:
                a. Imprimir array
                b. Mover a izquierda
                c. Mover a derecha
                d. Invertir*/

        int[] listaNumeros = new int[10];
        int[] listaNumerosInvertidos = new int[listaNumeros.length];
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = (int) (Math.random()*20)+1;
        }
        char opcion;
        do {
            System.out.println("\n");
            System.out.println("a. Imprimir array");
            System.out.println("b. Mover a la izquierda");
            System.out.println("c. Mover a la derecha");
            System.out.println("d. Invertir");
            System.out.println("e. Salir");
            System.out.print("Selecciona la accion que quiere realizar: ");
            opcion = teclado.next().toLowerCase().charAt(0);
            int j = listaNumerosInvertidos.length - 1;
            switch (opcion){
                case 'a' ->{
                    System.out.println("\n---  Aqui puedes ver el array generado  ---");
                    /*for (int i = 0; i < listaNumeros.length; i++) {
                        System.out.print(listaNumeros[i]+"\t");
                    }*/
                    imprimirArray(listaNumeros);
                }
                case 'b' -> {
                    int primero = listaNumeros[0];
                    for (int i = 0; i < listaNumeros.length-1; i++) {
                        listaNumeros[i] = listaNumeros[i+1];
                    }
                    listaNumeros[listaNumeros.length-1] = primero;
                    System.out.println("\n---  Array movido a la izquierda  ---");
                    for (int item:listaNumeros){
                        System.out.print(item+"\t");
                    }
                }
                case 'c' -> {
                    int ultimo = listaNumeros[listaNumeros.length-1];
                    for (int i = listaNumeros.length-1; i > 0; i--) {
                        listaNumeros[i] = listaNumeros[i-1];
                    }
                    listaNumeros[0] = ultimo;
                    System.out.println("\n---  Array movido a la derecha  ---");
                    for (int item:listaNumeros){
                        System.out.print(item+"\t");
                    }
                }
                case 'd' ->{
                    for (int i = 0; i < listaNumeros.length; i++) {
                        listaNumerosInvertidos[i] = listaNumeros[j];
                        j--;
                    }
                    listaNumeros = listaNumerosInvertidos;
                    System.out.println("---  Array Invertido  ---");
                    for (int item:listaNumeros){
                        System.out.print(item+"\t");
                    }
                }
                default -> {
                    System.out.println("Selecciona una opcion correcta");
                }
            }
        }while ('e'!=opcion);
    }
}
