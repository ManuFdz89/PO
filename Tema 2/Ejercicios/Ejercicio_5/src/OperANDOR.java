import java.util.Scanner;

public class OperANDOR {

    Scanner teclado;

    public void alquilerCoche(){

      teclado = new Scanner(System.in);

      System.out.print("Introduce tu edad: ");
      int edad = teclado.nextInt();
      System.out.print("¿Tienes carnet de conducir?");
      boolean carnet = teclado.nextBoolean();

      boolean coche = (edad>=21 && carnet==true);
      System.out.print("¿puedes alquilar un coche?: "+coche);

      teclado.close();

    }
}
