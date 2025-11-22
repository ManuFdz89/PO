import java.rmi.UnexpectedException;
import java.util.Scanner;

public class InformacionProducto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la información del producto: ");

        System.out.println("Nombre Producto: ");
        String nombre = teclado.nextLine();
        System.out.println("Precio: ");
        String precio = teclado.nextLine();
        System.out.println("Código: ");
        String codigo = teclado.nextLine();
        boolean disponibilidad = true;

        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("---------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio+"€");
        System.out.println("Código: "+codigo);
        System.out.println("Disponible: "+disponibilidad);

    }
}
