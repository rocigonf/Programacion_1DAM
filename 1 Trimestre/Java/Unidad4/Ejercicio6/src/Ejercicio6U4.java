/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una 
 * altura h. Aplica la fórmula t = √2h/g siendo g = 9.81m/s^2.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio6U4 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        System.out.println("Voy a calcular cuánto tarda en caer un objeto desde una altura.");
        System.out.print("Introduce la altura: ");
        double h = dato.nextInt();
        double t;
        double g = 9.81;

        t = Math.sqrt((2*h)/g);

        System.out.printf("El tiempo que tardará en caer el objeto es: %.2f segundos.%n", t);

        //Cerramos el Scanner para evitar un error de fuga de memoria.
        dato.close();
    }
}
