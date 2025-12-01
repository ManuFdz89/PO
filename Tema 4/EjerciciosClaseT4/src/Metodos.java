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
    void imprimirArray(int[] listaNumeros){
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print(listaNumeros[i]+"\t");
        }
    }
    void imprimirArrayDouble(double[] listaNumeros){
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.print(listaNumeros[i]+"  ");
        }
    }
    void moverAlaIz(int[] listaNumeros){
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
    void moverAlaDe(int[] listaNumeros){
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
    void invertirArray(int[] listaNumeros){
        int[] listaNumerosInvertidos = new int[listaNumeros.length];
        int j = listaNumerosInvertidos.length - 1;
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
            switch (opcion){
                case 'a' ->{
                    System.out.println("\n---  Aqui puedes ver el array generado  ---");
                    imprimirArray(listaNumeros);
                }
                case 'b' -> moverAlaIz(listaNumeros);
                case 'c' -> moverAlaDe(listaNumeros);
                case 'd' ->invertirArray(listaNumeros);
                default -> {
                    System.out.println("Selecciona una opcion correcta");
                }
            }
        }while ('e'!=opcion);
    }
    public void ejercicio3(){

        /*3. Desarrolla un programa en Java que permita registrar, calcular e informar
             las notas de varios alumnos utilizando arrays.
                a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
                b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
                   nota inferior a 0 y superior a 10 volverá a pedirla
                c. Calcula y muestra:
                    i. La nota media de la clase.
                    ii. La nota más alta y la más baja.
                    iii. Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
                         suspendido.*/
        double[] calificaciones = new double[10];
        double promedio = 0;
        double mayor = 0;
        double menor = 0;
        int contadorAprobado = 0;
        int contadorSupenso = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.printf("\nIntroduce la nota del alumno nº %d: ",(i+1));
            calificaciones[i] = teclado.nextDouble();
            if (i==0){
                mayor = calificaciones[0];
                menor = calificaciones[0];
            }
            if (calificaciones[i]<0 || calificaciones[i]>10){
                System.out.print("\nIntroduce la nota correcta: ");
                calificaciones[i] = teclado.nextDouble();
            }
            if (mayor<calificaciones[i]){
                mayor = calificaciones[i];
            }
            if (menor>calificaciones[i]) {
                menor = calificaciones[i];
            }
            if (calificaciones[i]>=5){
                contadorAprobado++;
            }
            if (calificaciones[i]<5){
                contadorSupenso++;
            }
            promedio += calificaciones[i];
        }
        //imprimirArrayDouble(calificaciones);
        promedio = promedio/calificaciones.length;
        System.out.println("\nLa nota media de la clase es: "+ promedio);
        System.out.println("\nLa nota mas alta es "+mayor+" y la nota mas baja "+menor);
        System.out.println("\nHan aprobado: "+contadorAprobado+" y han suspendido: "+contadorSupenso);


    }
    public void ejercicio4(){
        /*4. Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
             sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
             Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
             que un mismo equipo no puede jugar más de un partido*/
        



    }
}
