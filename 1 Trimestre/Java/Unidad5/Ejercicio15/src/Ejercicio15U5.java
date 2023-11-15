/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio15U5 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        
        //Pedimos la base y el exponente por teclado.
        System.out.println("Voy a calcular las potencias de un número desde el 1 hasta el exponente que introduzcas.");
        System.out.print("Introduce la base: ");
        double base = dato.nextInt();
        System.out.print("Introduce el exponente (entero positivo): ");
        int exponente = dato.nextInt();

        //Inicializamos la variable potencia.
        double potencia = 1;

        //Cerramos el Scanner para evitar error de fuga de memoria.
        dato.close();
        
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
            System.out.printf("%.0f^%d = %.0f %n", base, i, potencia);
        }
    }
}
