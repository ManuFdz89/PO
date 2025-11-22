import java.util.Scanner;

public class CompNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int numUno = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int numDos = teclado.nextInt();

        boolean resul = numUno>numDos;
        System.out.println("¿"+numUno+" es mayor que "+numDos+"?: "+resul);
        resul = numUno<numDos;
        System.out.println("¿"+numUno+" es menor que "+numDos+"?: "+resul);
        resul = numUno==numDos;
        System.out.println("¿"+numUno+" es igual que "+numDos+"?: "+resul);
        resul = numUno!=numDos;
        System.out.println("¿"+numUno+" es diferente que "+numDos+"?: "+resul);
        resul = numUno>=numDos;
        System.out.println("¿"+numUno+" es mayor o igual que "+numDos+"?: "+resul);
        resul = numUno<=numDos;
        System.out.println("¿"+numUno+" es menor o igual que "+numDos+"?: "+resul);

        teclado.close();

    }
}
