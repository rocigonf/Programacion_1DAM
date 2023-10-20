/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio4U3 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        System.out.println("Dime dos números y los sumo, resto, multiplico y divido. ");

        //Pedimos el primer número.
        System.out.print("Introduce un número: ");
        double num1 = dato.nextDouble();

        //Pedimos el segundo número.
        System.out.print("Introduce otro número: ");
        double num2 = dato.nextDouble();
        
        //Cerramos el Scanner para evitar un error de fuga de memoria.
        dato.close();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma de los dos números es: " + suma);
		System.out.println("La resta de los dos números es: " + resta);
        System.out.println("La multiplicación de los dos números es: " + multiplicacion);
		System.out.println("La división de los dos números es: " + division);
		
    }
}
