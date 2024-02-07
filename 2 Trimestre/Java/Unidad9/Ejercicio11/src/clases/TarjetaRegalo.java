package clases;
//Se importa DecimalFormat para darle formato a los decimales.
import java.text.DecimalFormat;

/**
 * Clase TarjetaRegalo.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class TarjetaRegalo {

    //Atributos //////////
    private double saldo;
    private String numero;

    //Métodos //////////

    //Constructor
    public TarjetaRegalo(double s){
        this.saldo = s;
        this.numero = "";
        for (int i = 0; i < 5; i++) {
            this.numero += (int)(Math.random() * 10);
        }
    }

    /**
     * Se resta el precio a el sueldo. Si no tienes suficiente saldo, sale un mensaje de aviso.
     * @param precio el precio que gasta del sueldo
     */
    public void gasta(double precio){
        if (precio > saldo) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f euros.\n", precio);
        } else{
            saldo -= precio;
        }
    }

    /**
     * Fusiona dos tarjetas regalo.
     * @param t tarjeta regalo que se quiere fusionar con la principal.
     * @return devuelve un nuevo objeto TarjetaRegalo usando de parámetro el nuevo saldo.
     */
    public TarjetaRegalo fusionaCon(TarjetaRegalo t){
        double newSaldo = this.saldo += t.saldo;
        this.saldo = 0;
        t.saldo = 0;
        return new TarjetaRegalo(newSaldo);
    }

    /**
     * Método toString().
     */
    public String toString(){
        //Le damos formato a los números decimales para que quede más simétrico.
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + " euros.";
    }
}
