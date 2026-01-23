package Ejercicio5.Model;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(){}


    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositarSaldo(double saldoSuma){

        this.saldo += saldoSuma;
        System.out.printf("Deposito de  %.2f €. Nuevo saldo: %.2f%n",saldoSuma, saldo);
    }

    public void retiradaSaldo(double saldoResta){

        this.saldo -= saldoResta;
        System.out.printf("Retiro de %.2f €. Nuevo saldo: %.2f%n",saldoResta,saldo);

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
