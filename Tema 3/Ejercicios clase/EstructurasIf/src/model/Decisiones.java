package model;

public class Decisiones {

    public void estructuraIF(int nota){

        System.out.println( ("vamos a explicar la estructura IF"));

        if (nota>=5){
            System.out.println("examen aprobado");
        }else {
            System.out.println("examen suspenso");
        }

        System.out.println("Evaluacion terminada");




    }
    
    
    public void estructuraIFELSEIF(double nota){
        
        //0 -> DESASTROSO
        // 1-3 -> MAL
        // 4-4,99 -> RASPADO
        // 5-7,99 -> bien
        // 8-8.99 -> notable
        // 9-9.99 -> sobresaliente
        // 10 -> MH
        if(nota>=0 && nota<=10){ System.out.println("Iniciando la evaluazion del examen");
            if (nota<1){
                System.out.println("Examen desastroso");
            } else if (nota<4){
                System.out.println("Examen mal");
            } else if (nota<5) {
                System.out.println("Examen raspado");
            } else if (nota<8) {
                System.out.println("Examen bien");
            } else if (nota<9) {
                System.out.println("Examen notable");
            } else if (nota<10) {
                System.out.println("Examen sobresaliente");
            }else {
                System.out.println("MH");
            }}
        else {
                System.out.println("fuera de rango");
        }
        System.out.println("Evaluacion terminada");

    }
}
