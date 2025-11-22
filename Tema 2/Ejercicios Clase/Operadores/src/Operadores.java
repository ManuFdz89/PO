import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos(){
        System.out.println("Explicacion de los operadores aritmeticos");
        //unarios -> solo necesitan un operando

        int operandoUno =5;

        operandoUno++; //operandoUno = operandoUno + 1
        System.out.println("Despues de incrementar "+operandoUno);

        operandoUno--; //operandoUno = operandoUno - 1
        System.out.println("Despues de decrementar "+operandoUno);

        operandoUno = -operandoUno; //calculamos su inverso en este caso de 5 a -5
        System.out.println("El inverso del operando 1 es "+operandoUno);

        //Binarios -> 2 o mas operandos
        int operandoDos = 2;

        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);

        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es "+resta);

        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicacion es "+multiplicacion);

        double division = (double)operandoUno / operandoDos;
        /*
         al dividir entre dos enteros,
         aunque pongamos double siempre recorta y da un resultado entero
         para evitar, transformamos temporalmente una de las variables de int a double
         para ello delande de la variable colocamos (double)
        */
        System.out.println("El resultado de la division es "+division);

        int modulo = operandoUno%operandoDos; //aqui sacamos el resto de la division, lo podemos usar por ejemplo para ver numeros pares
        System.out.println("El resto de la division es: "+modulo);




    }

    public void operadoresAsignacion(){

        int operandoUno = 6;
        operandoUno += 10; // las dos formas significan lo mismo -> operandoUno = operandoUno +10; // = 16
        operandoUno -= 2;
        operandoUno *= 2;
        operandoUno /= 2;
        operandoUno %= 2;

    }

    public void operadoresComparacion(){
         int numeroUno =4;
         int numeroDos =7;

         boolean resultado = numeroUno>numeroDos;
         System.out.println(resultado);
         resultado = numeroUno>=numeroDos;
         System.out.println(resultado);
         resultado = numeroUno<numeroDos;
         System.out.println(resultado);
         resultado = numeroUno<=numeroDos;
         System.out.println(resultado);
         resultado = numeroUno==numeroDos;
         System.out.println(resultado);
         resultado = numeroUno!=numeroDos;
         System.out.println(resultado);


    }

    public void operadoresLogicos(){
        int numeroUno =4;
        int numeroDos =10;
        int numeroTres =17;

        boolean resltadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!= numeroTres && numeroTres%2!=0;
        // True && True && True && True, el resultado sera TRUE
        boolean resltadoLogicoOR = numeroUno!=10 || numeroDos>10 || numeroTres<numeroDos || numeroDos%2!=0;

        boolean resltadoLogicoNOT = numeroUno>1 && numeroDos<11 && numeroDos!= numeroTres && numeroTres%2!=0;



    }

    public void evaluarCandidatos(){

        Scanner lectorTeclado = new Scanner(System.in); // declaramos variable compleja, en este caso Scanner

        System.out.println("Dime tu nombre y apellido");
        String nombreApellido = lectorTeclado.nextLine(); // creamos la variable nombre y apellido, pero le asignamos el valor de la variable lectorTeclado, tras el punto (nextLine) seleccionamos el formato de entrada
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Que salario quieres cobrar");
        double salario = lectorTeclado.nextDouble();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();
        System.out.println(nombreApellido+" "+edad);

        // edad inferior a 40 años y sueldo < 40000 y con experiendia
        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;

        System.out.println("El resultado de la evaluacion es: "+resultadoEvaluacion);

        lectorTeclado.close();


    }

}
