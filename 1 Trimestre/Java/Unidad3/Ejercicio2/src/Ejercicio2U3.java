/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio2U3 {
    public static void main(String[] args) throws Exception {

        //Inicializo el scanner.
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros que desea convertir a pesetas: ");
        //Declaro la variable euros pidiendo por teclado la cantidad.
        int euros = dato.nextInt();
        dato.close();
        
        //Un euro equivale a 166,386 pesetas.
        double pesetas = 166.386;
        
        System.out.println(euros + " euros equivalen a " + (euros * pesetas) + " pesetas");;
    }
}
