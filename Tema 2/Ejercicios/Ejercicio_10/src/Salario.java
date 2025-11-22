import java.util.Scanner;

public class Salario {

    Scanner teclado;

    public void horas() {

        teclado = new Scanner(System.in);

        /*
        Introduce el salario por hora: 10
        Introduce las horas trabajadas: 45
        ¿Has hecho horas extra? (true/false): true

        Horas normales (máximo 40): 40
        Horas extra: 5

        ¿Trabajaste más de 40 horas?: true
        ¿Tienes derecho a horas extra?: true
        ¿Se aplican horas extra? (>40 AND permitido): true
        Salario por horas normales: 400.0€
        Salario por horas extra (al doble): 100.0€
        Salario total: 500.0€
         */

        System.out.println("Introduce el salario por hora: ");
        int salarioHora = teclado.nextInt();
        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = teclado.nextInt();

        boolean extras = horasTrabajadas > 40;
        System.out.println("¿Has hecho horas extras?: "+extras);

        int salario = 0;
        int salarioExtra = 0;
        int salarioTotal = 0;
        int hExtras = 0;

        if (extras){
            hExtras=horasTrabajadas-40;
           /* System.out.println("Horas extras: "+hExtras);
            salario = salarioHora * (horasTrabajadas-hExtras);
            System.out.println("Salario normal: "+salario);
            salarioExtra = hExtras * (salarioHora *2);
            System.out.println("Salario Extra: "+salarioExtra);
            salarioTotal = salario+salarioExtra;
            System.out.println("Salario total: "+ salarioTotal);*/
        }else {
            hExtras=0;
           /* System.out.println("Horas extras: "+hExtras);
            salario = salarioHora * (horasTrabajadas-hExtras);
            System.out.println("Salario normal: "+salario);
            salarioExtra = hExtras * (salarioHora *2);
            System.out.println("Salario Extra: "+salarioExtra);
            salarioTotal = salario+salarioExtra;
            System.out.println("Salario total: "+ salarioTotal);*/
        }

        System.out.println("Horas extras: "+hExtras);
        salario = salarioHora * (horasTrabajadas-hExtras);
        System.out.println("Salario horas normales: "+salario);
        salarioExtra = hExtras * (salarioHora *2);
        System.out.println("Salario Extra: "+salarioExtra);
        salarioTotal = salario+salarioExtra;
        System.out.println("Salario total: "+ salarioTotal);

        teclado.close();
    }
}