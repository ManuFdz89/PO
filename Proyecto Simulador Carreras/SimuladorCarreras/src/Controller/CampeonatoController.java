package Controller;

import Model.Campeonato;
import Model.Carrera;
import Model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class CampeonatoController {

    private Campeonato campeonato;
    private Scanner teclado = new Scanner(System.in);

    public CampeonatoController() {
    }
    public CampeonatoController(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public void iniciarCampeonato(){

        System.out.print("\n¿Cuantas carreras tendrá el campeonato?: ");
        int nCarreras = teclado.nextInt();

        for (int i = 0; i < nCarreras; i++) {
            System.out.printf("%n¿Cuantos km tendrá la %dº carrera?: ",(i+1));
            int kmCarrera = teclado.nextInt();

            System.out.printf("%n\t\t === CARRERA %d === %n",(i+1));

            Carrera carrera = new Carrera(kmCarrera, new ArrayList<>(campeonato.getParticipantes()));
            CarreraController nueva = new CarreraController(carrera);
            nueva.iniciarCarrera();
            repartirPuntos(carrera);
        }
        mostrarClasificacion();
        resultadoFinal();
    }
    private void repartirPuntos(Carrera carreraTerminada){

        ArrayList<Coche> clasificacion = carreraTerminada.getParticipantes();
        for (int i = 0; i < clasificacion.size(); i++) {
            if (i==3){
                break;
            }
            int puntos = 0;
            if (i == 0) {
                puntos = 10;
            }else if (i == 1) {
                puntos = 8;
            }else if (i == 2) {
                puntos = 6;
            }

            Coche cocheGanador = clasificacion.get(i);
            int indiceGeneral = campeonato.getParticipantes().indexOf(cocheGanador);
            int puntosViejos = campeonato.getPuntos().get(indiceGeneral);
            campeonato.getPuntos().set(indiceGeneral, puntosViejos + puntos);
        }
    }
    private void mostrarClasificacion(){

        System.out.println("\n\n=== CLASIFICACIÓN GENERAL ===");

        ArrayList<Coche> clasificacion = campeonato.getParticipantes();
        ArrayList<Integer> listaPuntos = campeonato.getPuntos();

        for (int i = 0; i < clasificacion.size() - 1; i++) {
            for (int j = 0; j < clasificacion.size() - 1 - i; j++) {

                if (listaPuntos.get(j) < listaPuntos.get(j + 1)) {
                    int auxPuntos = listaPuntos.get(j);
                    listaPuntos.set(j, listaPuntos.get(j + 1));
                    listaPuntos.set(j + 1, auxPuntos);

                    Coche auxCoche = clasificacion.get(j);
                    clasificacion.set(j, clasificacion.get(j + 1));
                    clasificacion.set(j + 1, auxCoche);
                }
            }
        }

        System.out.println("\nPiloto\t\t  Modelo\t\t  Puntos");

        for (int i = 0; i < clasificacion.size(); i++) {

            if (i == 3){
                break;
            }
            System.out.println(clasificacion.get(i).getpiloto()+"\t\t "+clasificacion.get(i).getModelo()+
                    "\t\t "+campeonato.getPuntos().get(i));
        }
    }
    private void resultadoFinal(){
        int maxPuntos = -1;
        int indiceGanador = -1;

        ArrayList<Integer> listaPuntos = campeonato.getPuntos();

        for (int i = 0; i < listaPuntos.size(); i++) {
            if (listaPuntos.get(i) > maxPuntos) {
                maxPuntos = listaPuntos.get(i);
                indiceGanador = i;
            }
        }
        if (indiceGanador != -1) {
            Coche campeon = campeonato.getParticipantes().get(indiceGanador);

            System.out.println("\n***********************************************");
            System.out.println("   ¡EL CAMPEÓN ES: " + campeon.getpiloto() + " - " + campeon.getModelo() + "!");
            System.out.println("   CON UN TOTAL DE " + maxPuntos + " PUNTOS.");
            System.out.println("***********************************************");
        }

    }
}
