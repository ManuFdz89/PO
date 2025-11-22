import java.util.Scanner;

public class ConversionTemp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la temperatura en ºC");
        int celsius = teclado.nextInt();

        System.out.println("Temperatura en Celsius: "+celsius);
        System.out.println("Temperatura en Fahrenheit: "+((celsius*9/5)+32));

    }
}
