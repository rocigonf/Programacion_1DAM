package clases;
//Se importa DecimalFormat para darle formato a los decimales.
import java.text.DecimalFormat;

public class CuentaCorriente {
    private String numeroCuenta;
    private double saldo;

    public CuentaCorriente(){
        this.saldo = 0;
        this.numeroCuenta = "";
        for (int i = 0; i < 10; i++) {
            this.numeroCuenta += (int)(Math.random() * 10);
        }
    }
    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.numeroCuenta = "";
        for (int i = 0; i < 10; i++) {
            this.numeroCuenta += (int)(Math.random() * 10);
        }
    }

    public void ingreso(double i){
        this.saldo += i;
    }
    public void cargo(double i){
        this.saldo -= i;
    }
    public void transferencia(CuentaCorriente c, double i) {
        this.saldo -= i;
        c.saldo += i;
    }

    public String toString(){
        //Le damos formato a los números decimales para que quede más simétrico.
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        return "Número de cta: " + numeroCuenta + " Saldo: " + dosDecimales.format(saldo) + " euros.";
    }
}
