/**
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio11U5 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        //Pedimos el número por teclado.
        System.out.print("Introduce un número y te mostraré el cuadrado y el cubo de los 5 primeros números a partir de ese: ");
        int num = dato.nextInt();

        for (int i = num; i < num + 5; i++){
            System.out.printf("%4d %6d %8d %n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
        }

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();
    }
}
