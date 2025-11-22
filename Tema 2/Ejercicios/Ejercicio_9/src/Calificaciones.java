import java.util.Scanner;

public class Calificaciones {

    Scanner teclado;

    public void calificacion(){

        teclado = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        int nUno = teclado.nextInt();
        System.out.print("Introduce la nota del segundo examen: ");
        int nDos = teclado.nextInt();
        System.out.print("Introduce la nota del tercer examen: ");
        int nTres = teclado.nextInt();

        double promedio = (double) (nUno+nDos+nTres)/3;
        System.out.println("Nota media: "+promedio);

        boolean aprobado = promedio >=5;
        System.out.println("¿Ha aprobado?: "+aprobado);

        boolean notable = promedio >=7;
        System.out.println("¿tiene notable?: "+notable);

        boolean sobresaliente = promedio >=9;
        System.out.println("¿Tiene sobresaliente?: "+sobresaliente);

        teclado.close();

    }
}
