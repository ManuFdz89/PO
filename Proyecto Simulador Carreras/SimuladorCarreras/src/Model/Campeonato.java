package Model;

import java.util.ArrayList;

public class Campeonato {

    ArrayList<Coche> participantes;
    ArrayList<Integer> puntos;

    public Campeonato() {    }
    public Campeonato(ArrayList<Coche> participantes) {
        this.participantes = participantes;
        this.puntos = new ArrayList<>();
        for (int i = 0; i < participantes.size(); i++) {
            this.puntos.add(0);
        }
    }
    public ArrayList<Integer> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Integer> puntos) {
        this.puntos = puntos;
    }

    public ArrayList<Coche> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Coche> participantes) {
        this.participantes = participantes;
    }
}
