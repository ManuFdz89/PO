package Ejercicio9.Model;

public class Calculadora {

    public static double  sumar(double uno, double dos){

        System.out.printf("Suma: %.2f + %.2f = %.2f%n",uno,dos,uno+dos);
        return uno + dos;
    }
    public static double  restar(double uno, double dos){
        System.out.printf("Resta: %.2f - %.2f = %.2f%n",uno,dos,uno-dos);

        return uno - dos;
    }
    public static double  multiplicar(double uno, double dos){
        System.out.printf("Multiplicacion: %.2f * %.2f = %.2f%n",uno,dos,uno*dos);

        return uno * dos;
    }
    public static double  dividir(double uno, double dos){
        System.out.printf("Division: %.2f / %.2f = %.2f%n",uno,dos,uno/dos);

        return uno / dos;
    }
    public static double  potencia(double uno, double dos) {

        double resultado = 1;
        for (int i = 0; i < dos; i++) {
            resultado = uno * resultado;
        }
        System.out.printf("Potencia: %.2f ^ %.2f = %.2f%n",uno,dos,resultado);

        return resultado;
    }
}
