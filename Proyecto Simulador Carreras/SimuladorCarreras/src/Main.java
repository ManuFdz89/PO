import Controller.CampeonatoController;
import Model.Campeonato;
import Model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Coche> garage = new ArrayList<>();

        System.out.print("¿Cuantos coches van a participar?: ");
        int nCoches = teclado.nextInt();

        teclado.nextLine();

        for (int i = 0; i < nCoches; i++) {
            System.out.print("Introduce el nombre del piloto del coche: ");
            String piloto = teclado.next();
            System.out.print("Introduce el modelo del coche: ");
            String modelo = teclado.next();
            Coche nuevoCoche = new Coche(piloto,modelo);
            garage.add(nuevoCoche);
        }
        Campeonato nuevoCampeonato = new Campeonato(garage);
        CampeonatoController inicioCampeonato = new CampeonatoController(nuevoCampeonato);

        inicioCampeonato.iniciarCampeonato();


    }


}
