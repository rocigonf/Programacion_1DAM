/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula: 
 * V = (π * r² * h)/3
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio9U3 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        System.out.println("Calculadora del volumen de un cono. Introduce el radio y la altura: ");
        
        //Pedimos el radio y la altura.
        System.out.print("Radio: ");
        double r = dato.nextDouble();
        System.out.print("Altura: ");
        double h = dato.nextDouble();

        //Cerramos el Scanner para evitar un error de fuga de memoria.
        dato.close();

        double volumen = (Math.PI * (r*r) * h)/3;

        System.out.printf("El volumen del cono es de: %.2f cm².", volumen);
    }
}
