/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio14U5 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        
        //Pedimos la base y el exponente por teclado.
        System.out.println("Voy a calcular una potencia.");
        System.out.print("Introduce la base: ");
        int base = dato.nextInt();
        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = dato.nextInt();

        //Cerramos el Scanner para evitar error de fuga de memoria.
        dato.close();
        
        //Calculamos la potencia e imprimimos el resultado.
        double potencia = Math.pow(base, exponente);
        System.out.printf("La potencia %s^%s es %.0f %n", base, exponente, potencia);
    }
}