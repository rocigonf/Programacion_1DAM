/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;

public class Ejercicio8U4 {
	
	public static void main (String[] args) {
		
		//Inicializamos el Scanner.
		Scanner dato = new Scanner(System.in);
		
		//Pedimos las notas.
		System.out.print("Por favor, introduzca la primera nota: ");
		double nota1 = dato.nextDouble();
		
		System.out.print("A continuación introduzca la segunda nota: ");
		double nota2 = dato.nextDouble();
		
		System.out.print("Ahora introduzca la tercera nota: ");
		double nota3 = dato.nextDouble();
		
		//Cerramos el Scanner para evitar errores de fuga de memoria.
		dato.close();
		
		//Calculamos la media y redondeamos al entero más cercano para que los decimales no den errores.
		double media = Math.round((nota1 + nota2 + nota3) / 3);
		
		//Usamos un switch para clasificar las notas del boletín.
		switch ((int) media) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Su nota es insuficiente.");
				break;
			case 5:
				System.out.println("Su nota es suficiente.");
				break;
			case 6:
				System.out.println("Su nota es bien.");
				break;
			case 7:
			case 8:
				System.out.println("Su nota es notable.");
				break;
			case 9:
			case 10:
				System.out.println("Su nota es sobresaliente.");
				break;
			default:
				System.out.println("Por favor, introduzca notas correctas.");
		}		
	}
}
