import java.util.Scanner;

public class Operaciones {

    Scanner teclado;

    public void calculadora(){

        teclado = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = teclado.nextDouble();
        System.out.print("Introduce el porcentaje de descuento: ");
        int porcentaje = teclado.nextInt();

        double descuento = precio * porcentaje/100;
        double precioFinal = precio - descuento;

        System.out.printf("Precio Original: %.1f%n", precio);
        System.out.printf("Descuento (%d%%): %.1f%n",porcentaje, descuento);
        System.out.println("Precio final: "+ precioFinal);



    }

}
