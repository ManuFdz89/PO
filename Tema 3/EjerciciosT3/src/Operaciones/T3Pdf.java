package Operaciones;

import java.util.Scanner;

public class T3Pdf {
    Scanner teclado = new Scanner(System.in);

    public void ejercicio1() {
        int aleatorio = (int) (Math.random() * 50) + 1;
        for (int i = 1; i <= 7; i++) {
            System.out.println("Introduce un numero (1-50): ");
            int numero = teclado.nextInt();
            if(numero==aleatorio){
                System.out.println("Has acertado!");
                System.out.println("Numero de intentos: "+i);
                break;
            }
            if (numero>aleatorio){
                System.out.println("el numero introducido es mayor que el elegido");
                System.out.println("Numero de intentos: "+i);
            }else {
                System.out.println("el numero introducido es menor que el elegido");
                System.out.println("Numero de intentos: "+i);
            }
            if(i==7){
                System.out.println("Has perdido, el numero elegido era el "+aleatorio);
            }

        }
    }
    public void ejercicio2(){
        String palabraSecreta [] = new String[]{"perro","Gatos","silla","balon","raton"};
        String aleatoria = palabraSecreta[(int) (Math.random()*5)];
        System.out.println(aleatoria);
        String palabra;
        int intentos = 5;

        do {
            do {
                System.out.println("Introduce una palabra: ");
                palabra = teclado.next().toLowerCase();
                if (palabra.length()!=5){
                    System.out.println("Palabra invalida");
                }
            }while (palabra.length()!=5);

            System.out.println("Intento numero: "+intentos);
            intentos--;
            int aciertos = 0, aprox = 0, fallos = 0;

            for (int i = 0; i < palabraSecreta.length; i++) {
                

            }

            if (aleatoria.equals(palabra)){
                System.out.println("Has acertado");
                break;
            }
        }while (intentos>0);

        /*for (int i = 0; i < palabra.length; i++) {

        }*/


    }
}
