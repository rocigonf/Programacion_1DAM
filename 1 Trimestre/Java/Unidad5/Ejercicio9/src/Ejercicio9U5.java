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

        //Pedimos el número por teclado e inicializamos variables.
        System.out.print("Introduce un número y te diré cuántos dígitos tiene: ");
        int numIntroducido = dato.nextInt();
        int digitos = 1;
        int cont = numIntroducido;

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        //El número de veces que la cifra se puede dividir entre 10, es el número de cifras que tiene. Cada vez que "cont" se divide entre 10, la variable "digitos" aumenta en 1.
        while (cont > 10) {
            cont = cont / 10;
            digitos++;
            }

        //Imprimimos el resultado por pantalla.
        System.out.println("El número " + numIntroducido + " tiene " + digitos + " dígitos.");
    }
}
