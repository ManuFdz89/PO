package Controller;

import Model.Carrera;
import Model.Coche;

public class CarreraController {

    private Carrera carrera;

    public CarreraController() {    }

    public CarreraController(Carrera carrera) {
        this.carrera = carrera;
    }
    private void resetCoches() {

        for (int i = 0; i < carrera.getParticipantes().size(); i++) {
            carrera.getParticipantes().get(i).setKm(0);
        }

    }
    private boolean vueltas(){

        for (int i = 0; i < carrera.getParticipantes().size(); i++) {


            int nuevoKm =  carrera.getParticipantes().get(i).getKm();
            nuevoKm += (int) (Math.random()*31)+20;
            carrera.getParticipantes().get(i).setKm(nuevoKm);

            if(carrera.getParticipantes().get(i).getKm()>= carrera.getKmTotales()){
                return true;
            }
        }
        return false;
    }
    private void ordenarClasificacion() {

        for (int i = 0; i < carrera.getParticipantes().size(); i++) {
            for (int j = 0; j < carrera.getParticipantes().size()-1; j++) {
                Coche cocheActual = carrera.getParticipantes().get(j);
                Coche cocheSiguiente = carrera.getParticipantes().get(j+1);
                if (cocheSiguiente.getKm() > cocheActual.getKm()) {
                    carrera.getParticipantes().set(j,cocheSiguiente);
                    carrera.getParticipantes().set(j + 1, cocheActual);

                }
            }
        }
    }
    private void mostrarPodio(){
        for (int i = 0; i < carrera.getParticipantes().size(); i++) {
            if (i==3){
                break;
            }
            Coche c = carrera.getParticipantes().get(i);
            int puntos = 0;
            if (i == 0) {
                puntos = 10;
            }else if (i == 1) {
                puntos = 8;
            }else if (i == 2) {
                puntos = 6;
            }
            System.out.println((i + 1) + "º " + c.getpiloto() + " - " + c.getModelo() + " - [" + puntos + " puntos]");
        }
    }
    public void iniciarCarrera(){

        boolean ganador = false;
        resetCoches();
        while (!ganador){
            ganador = vueltas();
        }
        ordenarClasificacion();
        mostrarPodio();
    }
}