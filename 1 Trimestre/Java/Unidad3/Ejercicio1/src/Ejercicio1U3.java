/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio1U3 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el scanner.
        Scanner datos = new Scanner(System.in);

        System.out.println("Dime dos números y te los multiplico: ");
        System.out.println("Primer número: ");
        int num1 = datos.nextInt();
        System.out.println("Segundo número: ");
        int num2 = datos.nextInt();

        datos.close();

        int resultado = num1 * num2;

        System.out.println("El resultado es: " + num1 + " * " + num2 + " = " + resultado);
    }
}
