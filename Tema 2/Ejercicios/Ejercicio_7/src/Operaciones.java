import java.util.Scanner;

public class Operaciones {
    Scanner teclado;

    public void condiciones(){

        teclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextByte();
        System.out.println("¿Eres estudiante? (true/false)");
        boolean estudiante = teclado.nextBoolean();

        boolean descuentoJoven = edad < 26;
        boolean descuentoEstudiante = estudiante;
        boolean descuentoEspecial = descuentoJoven && descuentoEstudiante;

        System.out.println("¿eres menor de 26 años?"+ descuentoJoven);
        System.out.println("¿eres estuadiante?"+estudiante);
        System.out.println("¿no eres estudiante?"+!estudiante);
        System.out.println("¿Tienes descuento joven?: "+descuentoJoven);
        System.out.println("¿Tienes descuento estudiante?"+estudiante);
        System.out.println("¿Tienes descuento especial?: "+descuentoEspecial);

    }

}
