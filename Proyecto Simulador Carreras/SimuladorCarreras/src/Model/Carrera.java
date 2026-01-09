package Model;

import java.util.ArrayList;

public class Carrera {

    private int kmTotales;
    private ArrayList<Coche> participantes;


    public Carrera() {    }

    public Carrera(int kmTotales, ArrayList<Coche> participantes) {
        this.kmTotales = kmTotales;
        this.participantes = participantes;
    }

    public int getKmTotales() {
        return kmTotales;


    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}
