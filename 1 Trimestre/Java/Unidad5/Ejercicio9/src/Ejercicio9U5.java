/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio9U5 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos el número por teclado.
        System.out.print("Introduce un número y te diré cuántos dígitos tiene: ");
        int num = dato.nextInt();

        for (int i = 0; i < 100; i++){

        }
        dato.close();
    }
}
