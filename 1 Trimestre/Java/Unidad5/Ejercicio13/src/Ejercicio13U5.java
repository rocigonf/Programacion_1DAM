/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio13U5 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        System.out.println("Introduce 10 números y te diré cuántos son positivos y cuántos son negativos: ");
        int positivos = 0;
        int negativos = 0;
        for (int i = 1; i <= 10; i++){
            System.out.print("Introduce un número: ");
            int num = dato.nextInt();
            if (num >= 0) {
                positivos += 1;
            } else {
                negativos += 1;
            }
        }
        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();
        System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos.");
    }
}
