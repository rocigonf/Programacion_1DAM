/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio9U6 {
    public static void main(String[] args) throws Exception {

        //Explico el programa e inicializo variables.
        System.out.println("Voy a generar números aleatorios entre 0 y 100 hasta que saque el 24.");
        int numFinal = 24, numAleatorio = 0;

        //Mientras el número generado de forma aleatoria sea distinto a 24, genera un número aleatorio y lo imprime por pantalla, comprobando antes si es par.
        while (numAleatorio != numFinal) {
            numAleatorio = (int)(Math.random()*100)+1;
            if (numAleatorio % 2 == 0) {
                System.out.print(numAleatorio + " ");
            }
        }
    }
}
