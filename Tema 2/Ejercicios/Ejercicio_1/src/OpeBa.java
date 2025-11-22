import java.util.Scanner;

public class OpeBa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int numeroUno = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numeroDos = teclado.nextInt();

        System.out.println("Suma: "+(numeroUno+numeroDos));
        System.out.println("Resta: "+(numeroUno-numeroDos));
        System.out.println("Multiplicación: "+(numeroUno*numeroDos));
        System.out.println("División: "+(numeroUno/numeroDos));
        System.out.println("Módulo: "+(numeroUno%numeroDos));

    }
}
