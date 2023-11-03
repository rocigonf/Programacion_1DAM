/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
 * nombre del día de la semana.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */

import java.util.Scanner;
public class Ejercicio3U4 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos el día por teclado.
        System.out.print("Dime un número del 1 al 7:");
        int dia = dato.nextInt();

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        //Creamos un switch para que según el día introducido, se imprima su mensaje correspondiente.
        switch (dia) {
            case 1:
                System.out.println("El primer día de la semana es lunes.");
                break;
            case 2:
                System.out.println("El segundo día de la semana es martes.");
                break;
            case 3:
                System.out.println("El tercer día de la semana es miércoles.");
                break;
            case 4:
                System.out.println("El cuarto día de la semana es jueves.");
                break;
            case 5:
                System.out.println("El quinto día de la semana es viernes.");
                break;
            case 6:
                System.out.println("El sexto día de la semana es sábado.");
                break;
            case 7:
                System.out.println("El séptimo día de la semana es domingo.");
                break;
            default:
                System.out.println("Número incorrecto.");
                break;
        }
    }
}
