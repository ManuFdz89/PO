import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt();

        if (numero%2 == 0){
            System.out.printf("el numero %d es par (resto al dividir entre 2: %d)",numero,numero%2);
        } else {

            System.out.printf("el numero %d es impar(resto al dividir entre 2: %d)",numero,numero%2);
        }
    }
}

