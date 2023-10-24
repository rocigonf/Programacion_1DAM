/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio12U3 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos la primera nota y la multiplicamos por 0.4.
        System.out.print("Introduce la nota de tu primer exámen: ");
		double primerExamen = dato.nextDouble();
		double nota1 = primerExamen * 0.4;
		
		System.out.print("Introduce la nota que quieres sacar en el trimestre: ");
		double notaTrimestre = dato.nextDouble();

        //Cerramos el Scanner para evitar errores de fuga de memoria.
		dato.close();
		
        //Calculamos la nota necesaria.
		double segundoExamen = (notaTrimestre - nota1) / 0.6;
		
		System.out.printf("Para obtener un %.0f, debes sacar un %.2f en el segundo exámen", notaTrimestre, segundoExamen);
    }
}
