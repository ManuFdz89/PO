package Model;

public class Coche {

    private String piloto, modelo;
    private int km;

    public Coche() {    }
    public Coche(String piloto, String modelo) {
        this.piloto = piloto;
        this.modelo = modelo;
        this.km = 0;
    }


    public String getpiloto() {
        return piloto;
    }
    public void setpiloto(String piloto) {
        this.piloto = piloto;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }
}
