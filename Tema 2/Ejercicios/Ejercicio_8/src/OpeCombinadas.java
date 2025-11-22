import java.util.Scanner;

public class OpeCombinadas {

    Scanner teclado;

    public void operacion(){

        teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int nUno = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int nDos = teclado.nextInt();
        System.out.print("Introduce el tercer número: ");
        int nTres = teclado.nextInt();

        int suma = nUno+nDos+nTres;
        System.out.println("Suma de los tres numeros: "+suma);

        double promedio = (double) suma/3;
        System.out.printf("Promedio: %.1f%n",promedio);

        double resultado = (double) (nUno*nDos)/nTres;
        System.out.println("Resultado: "+resultado);



    }

}
