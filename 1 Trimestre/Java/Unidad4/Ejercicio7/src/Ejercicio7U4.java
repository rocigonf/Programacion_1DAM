/**
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Rocio Alejandra Gonfaus Luengo 2023
 * 
 */

import java.util.Scanner;

public class Ejercicio7U4 {
	
	public static void main (String[] args) {
		
        //Inicializamos el Scanner.
		Scanner dato = new Scanner(System.in);
		
        //Pedimos las 3 notas.
		System.out.print("Por favor, introduzca la primera nota: ");
		double nota1 = dato.nextDouble();
		
		System.out.print("A continuación introduzca la segunda nota: ");
		double nota2 = dato.nextDouble();
		
		System.out.print("Ahora introduzca la tercera nota: ");
		double nota3 = dato.nextDouble();
		
        //Cerramos el Scanner para evitar errores de fuga de memoria.
		dato.close();

        //Calculamos la media.
		double media = (nota1 + nota2 + nota3) / 3;
		
        //Imprimimos el resultado.
		System.out.printf("Su nota media es : %.2f", media);
		
	}
}

