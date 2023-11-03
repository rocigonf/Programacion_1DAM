/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b=0).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio5U4 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos los valores de a y b.
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = dato.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        double b = dato.nextDouble();

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        //Si a es cero, la ecuación no tendrá solución. Si no es cero, se calcula e imprime el resultado.
        if (a==0) {
			System.out.println("Esta ecuación no tiene solución real");
		} else {
			double total = b * -1 / a;
			System.out.println("x = " + total);
			}
    }
}
