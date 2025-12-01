package Operaciones;

import java.util.Scanner;

public class ArrUnidimensionales {

    Scanner teclado = new Scanner(System.in);

    public void ejercicio1(){
        String[] frutas = new String[]{"Manzana", "Platano", "Naranja", "Fresa", "Uva"};
        System.out.println("Frutas del Array: ");
        for(String item : frutas){
            System.out.println(item);
        }

    }
    public void ejercicio2(){

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*60)+1;
            System.out.println("Posicion "+i+": "+numeros[i]);
        }
    }
    public void ejercicio3(){
        String[] nombres = new String[5];
        for (int i = 0; i < nombres.length ; i++) {
            System.out.print("Introduce el nombre "+(i+1)+": ");
            nombres[i] = teclado.nextLine();
        }
        System.out.println("Nombres introducidos: ");
        for (String item:nombres){
            System.out.println(item);
        }
    }
    public void ejercicio4(){
        int[] numeros = new int[7];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*20)+1;
        }
        System.out.print("Array: [");
        for (int item : numeros) {
            if (item == numeros[numeros.length - 1]) {
                System.out.print(item + "]");
            } else {
                System.out.print(item + ", ");
            }
        }
        System.out.print("\nIntroduce el numero a buscar: ");
        int numeroB = teclado.nextInt();
        boolean aparece = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeroB==numeros[i]){
                System.out.printf("El numero %d se encuentra en la posicion %d%n",numeroB,i);
                aparece = true;
                break;
            }
        }
        if (!aparece) {
            System.out.printf("El numero %d no se encuentra en el array%n", numeroB);
        }
    }
    public void ejercicio5(){
        int[] numeros = new int[10];
        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
            if (numeros[i] == numeros[numeros.length - 1]) {
                System.out.println(numeros[i] + "]");
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>50){
                contador++;
            }
        }
        System.out.println("Cantidad de numeros mayores que 50: "+contador);

    }
    public void ejercicio6(){
        double[] numeros = new double[8];
        System.out.print("Array: [");
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (Math.random() * 10) + 1;
            suma += numeros[i];
            if (numeros[i] == numeros[numeros.length - 1]) {
                System.out.printf("%.1f]",numeros[i]);
            } else {
                System.out.printf("%.1f, ",numeros[i]);
            }
        }
        double resultado = suma/ numeros.length;
        System.out.printf("%nSuma: %.1f%n",suma);
        System.out.printf("Promedio: %.1f%n",resultado);


    }
    public void ejercicio7(){
        int[] numeros = new int[6];
        System.out.print("Array: [");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 25) + 1;
            if (numeros[i] == numeros[numeros.length - 1]) {
                System.out.println(numeros[i] + "]");
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("EL número mayor es: "+mayor);
        System.out.println("EL número menor es: "+menor);

    }
    public void ejercicio8(){
        String[] nombres = new String[]{"gato","perro","gato","pajaro","gato","pez","perro"};
        System.out.println("Introduce la palabra a buscar: ");
        String palabra = teclado.next().toLowerCase();
        int contador = 0;

        for (int i = 0; i < nombres.length; i++){
            if (palabra.equalsIgnoreCase(nombres[i])){
                contador++;
            }
        }
        System.out.printf("La palabra %s aparece %d veces en el array",palabra,contador);
    }
    public void ejercicio9(){
        int[] numeros = new int[7];
        int[] numerosInvertidos = new int[numeros.length];
        int j = numerosInvertidos.length - 1;
        System.out.print("Array: [");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 25) + 1;
            if (numeros[i] == numeros[numeros.length - 1]) {
                System.out.println(numeros[i] + "]");
            } else {
                System.out.print(numeros[i] + ", ");
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[j]=numeros[i];
            j--;
        }
        System.out.print("Array invertido: [");
        for (int i=0; i < numerosInvertidos.length;i++){
            if (numerosInvertidos[i] == numerosInvertidos[numerosInvertidos.length - 1]) {
                System.out.println(numerosInvertidos[i] + "]");
            } else {
                System.out.print(numerosInvertidos[i] + ", ");
            }
        }
    }
    public void ejercicio10(){
        System.out.print("Introduce cuantos estudiantes hay en clase: ");
        int estudiantes = teclado.nextInt();
        double[] calificaciones = new double[estudiantes];
        int contador=0;
        double promedio =0;

        do {
            contador++;
            System.out.print("Introduce la nota del estudiante "+contador+": ");
            calificaciones[contador-1]=teclado.nextDouble();

        }while (contador!=estudiantes);

        double mayor=0;
        double menor=calificaciones[0];
        contador = 0;

        System.out.println("\n--- REPORTE DE CALIFICACIONES ---");
        System.out.print("Calificaciones: [");
        for (int i = 0; i < calificaciones.length; i++) {

            if (mayor<calificaciones[i]){
                mayor=calificaciones[i];
            }
            if (menor>calificaciones[i]){
                menor=calificaciones[i];
            }

            if (calificaciones[i]>=5){
                contador++;
            }

            promedio += calificaciones[i];

            if (calificaciones[i] == calificaciones[calificaciones.length - 1]) {
                System.out.print(calificaciones[i] + "]");
            } else {
                System.out.print(calificaciones[i] + "; ");
            }
        }
        promedio = promedio/estudiantes;
        System.out.printf("\nEl promedio de la clase es: %.2f",promedio);
        System.out.print("\nEstudiantes aprobados: "+contador);
        System.out.print("\nNota mas alta: "+mayor);
        System.out.print("\nNota mas baja: "+menor);




    }



}
