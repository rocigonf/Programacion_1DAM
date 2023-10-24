/**
 * Escribe un programa que calcule el total de una factura a partir de la base imponible.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio7U3 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Declaramos las variables de la base imponible y el IVA (21%).
        System.out.print("Introduce la base imponible (precio sin IVA): ");
        double baseImp = dato.nextDouble();
        double IVA = 1.21;

        dato.close();
		
		double total = (baseImp * IVA);
		
		System.out.println("El precio sin IVA es de " + baseImp + " euros y el precio con IVA (total) es de " + total + " euros");
    }
}
