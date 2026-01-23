package Ejercicio5;

import Ejercicio5.Model.CuentaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria("Juan Garcia", 1500);
        CuentaBancaria c2 = new CuentaBancaria("Maria Lopez", 800);
        CuentaBancaria c3 = new CuentaBancaria("Pedro Martin", 1200);


        System.out.printf("Cuenta de %s: %.2f%n",c1.getTitular(),c1.getSaldo());
        c1.depositarSaldo(500);

        System.out.printf("%nCuenta de %s: %.2f%n",c2.getTitular(),c2.getSaldo());
        c2.retiradaSaldo(200);

        System.out.printf("%nCuenta de %s: %.2f%n",c3.getTitular(),c3.getSaldo());
        c3.depositarSaldo(300);


        System.out.println("\nSaldos finales:\n");
        System.out.println(c1.getTitular()+": "+c1.getSaldo());
        System.out.println(c2.getTitular()+": "+c2.getSaldo());
        System.out.println(c3.getTitular()+": "+c3.getSaldo());
    }
}
