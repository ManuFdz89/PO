import java.util.Scanner;

public class PresentacionPersonal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a crear una presentacion, sigue los pasos: ");

        System.out.println("Introduce tu nombre y apellido:");
        String nombreApellido = teclado.nextLine();
        System.out.println("¿de donde eres?: ");
        String ciudad = teclado.nextLine();
        System.out.println("¿Cual es tu edad? ");
        int edad = teclado.nextInt();

        System.out.println("¡Hola! Me llamo "+nombreApellido+".");
        System.out.println("Tengo "+edad+" años y vivo en "+ciudad+".");

    }
}
