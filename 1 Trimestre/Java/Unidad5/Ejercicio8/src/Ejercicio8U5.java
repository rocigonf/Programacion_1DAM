/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio8U5 {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce un número y te mostraré su tabla de multiplicar:");
        int num = dato.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
        dato.close();
    }
}
