/**
 * Realiza un programa que resuelva una ecuación de segundo grado 
 * (del tipo ax^2 + bx + c = 0).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */

import java.util.Scanner;
public class Ejercicio9U4 {
	
    public static void main(String[] args) {
		
        // Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
		
        // Pedimos los datos.
        System.out.print("Introduce el valor de a: ");
        double a = dato.nextDouble();
		
        System.out.print("Ahora introduce el valor de b: ");
        double b = dato.nextDouble();
		
        System.out.print("A continuación introduce el valor de c: ");
        double c = dato.nextDouble();
		
        dato.close();
		
        double cuadrado = Math.pow(b, 2);
        double cuenta = cuadrado - 4 * a * c;
        double raiz = Math.sqrt(cuenta);
        double neg = (-b - raiz) / (2 * a);
        double pos = (-b + raiz) / (2 * a);
		
        if (a == 0) {
            System.out.print("La ecuación no es de segundo grado.");
        } else if (cuenta < 0) {
            System.out.print("La ecuación no tiene solución.");
        } else {
            System.out.printf("Hay dos soluciones: x1 = %s y x2 = %s", pos, neg);
        }
    }
}


