/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio3U3 {
    public static void main(String[] args) throws Exception {

        //Inicializo el scanner.
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce la cantidad de pesetas que desea convertir a euros: ");
        //Declaro la variable pesetas pidiendo por teclado la cantidad.
        int pesetas = dato.nextInt();
        dato.close();
        
        //Una peseta equivale a 0,00601012 euros.
        double euros = 0.00601012;

        double resultado = (double)(euros * pesetas);
        
        System.out.println(pesetas + " pesetas equivalen a " + resultado + " euros");
    }
}
