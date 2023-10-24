/**
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio6U3 {
    public static void main(String[] args) throws Exception {
        
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        System.out.println("Calculadora del área de un triángulo.");

        //Pedimos la base en cm.
        System.out.print("Introduce el tamaño en cm de la base: ");
        double base = dato.nextDouble();

        //Pedimos la altura en cm.
        System.out.print("Introduce el tamaño en cm de la altura: ");
        double altura = dato.nextDouble();

        //Cerramos el Scanner para evitar un error de fuga de memoria.
        dato.close();

        //Calculamos el área.
        double area = (base * altura)/2;

        System.out.println("El área del triángulo de medidas: " + base + "cm x " + altura + "cm es de: " + area + "cm².");
    }
}
