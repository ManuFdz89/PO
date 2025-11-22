import java.util.Scanner;

public class Operadores {
    Scanner lectorTeclado;

    public void operadoresAritmeticos() {
        System.out.println("Explicacion de los operadores aritmeticos");
        // unarios -> solo necesitan un operando
        int operandoUno = 7;
        operandoUno++; // operandoUno = operandoUno + 1
        System.out.println("Despues de incrementar " + operandoUno);
        operandoUno--; //  operandoUno = operandoUno -1;
        System.out.println("Despues de decrementar " + operandoUno);
        operandoUno = -operandoUno; // estoy calculcudo su inverso -8 -> 8
        // Binarios
        int operandoDos = 6;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es " + (operandoUno + operandoDos));
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es " + (operandoUno - operandoDos));
        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        double division = (double) operandoUno / operandoDos;
        // System.out.println("El resultado de la division es "+division);
        System.out.printf("El resultado de la division es %.4f", division);
        int modulo = operandoUno % 2; // el resto de la division
        System.out.println(modulo);
    }

    public void operadoresAsignacion() {
        int operandoUno = 6;
        operandoUno += 6; // operandoUno = operandoUno + 6; // 12
        operandoUno -= 3; // 9
        operandoUno *= 2; // 18
        operandoUno /= 2; // 9
        operandoUno %= 3; // 0
    }

    public void operadoresComparacion() {
        int numeroUno = 1;
        int numeroDos = 4;

        boolean resultado = numeroUno > numeroDos; // false
        System.out.println("El resultado de > es " + resultado);
        resultado = numeroUno >= numeroDos; // false
        System.out.println("El resultado de >= es " + resultado);
        resultado = numeroUno < numeroDos; // true
        System.out.println("El resultado es < " + resultado);
        resultado = numeroUno <= numeroDos; // true
        System.out.println("El resultado es <= " + resultado);
        resultado = numeroUno == numeroDos; // false
        System.out.println("El resultado es == " + resultado);
        resultado = numeroUno != numeroDos; // true
        System.out.println("El resultado es != " + resultado);

    }

    public void operadoresLogicos() {
        lectorTeclado = new Scanner(System.in);
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        // true && true && true && true -> true
        boolean resultadoLogicoAND = numeroUno > 1 && numeroDos < 11 && numeroDos != numeroTres && numeroTres % 2 != 0;
        // true && true && true && false -> false
        System.out.println("El resultado logico del AND es " + resultadoLogicoAND);
        boolean resultadoLogicoOR = numeroUno != 10 || numeroDos > 10 || numeroTres < numeroDos || numeroDos % 2 != 0;
        // true || false || false || false -> true
        System.out.println("El resultado logico del OR es " + resultadoLogicoOR);
        boolean resultadoCon = (numeroUno > 0 || numeroTres < 0) && (numeroDos != 9 && numeroUno < 0);
        // (true || false) && (true && false)
        // true && false
        // false
        System.out.println("El resultado logico del OR y AND es " + resultadoCon);

        numeroTres = 20;
        numeroDos = 10;
        numeroUno = 0;

        boolean resultadoTotal = numeroUno >= 0 && numeroDos < 20 && false; // false
        System.out.println("El resultado total es " + resultadoTotal);
        boolean resultadoTotalInv = !resultadoTotal;
        System.out.println("El resultado total inverso es " + resultadoTotalInv);
        lectorTeclado.close();
    }

    public void evaluarCandidato() {
        lectorTeclado= new Scanner(System.in);
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombre = lectorTeclado.next();
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Que salario quieres cobrar");
        double salario = lectorTeclado.nextDouble();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();

        // edad inferior a 40 y sueldo < 40000 y experiencia
        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;
        System.out.println("El resultado de la evaluacion es que el candidato es: "
                +resultadoEvaluacion);
        lectorTeclado.close();
    }

    public void cambiosTipo(){
        // int letraASCII = 115;
        // char letra = 'w';
        // System.out.println((int)letra);
        // String palabra = "7"; //
        // System.out.println(Integer.parseInt(palabra)+10);
        // String palabra = "1";
        // System.out.println(Boolean.parseBoolean(palabra));

        // int numero = 123;
        // System.out.println(String.valueOf(123)+1);
        // boolean cierto = true;
        // System.out.println(String.valueOf(cierto)+"asd");
        char letra = 'a';
        System.out.println(String.valueOf(letra)+123);
    }


}
