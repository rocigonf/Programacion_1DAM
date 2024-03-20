/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
public class Ejercicio3U7 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Creamos el array y la variable i.
        System.out.println("Introduce 10 números y los mostraré en orden inverso.");
        int listaNum[] = new int[10]; 
        int i;

        //Utilizamos un bucle for para almacenar en el array los numeros introducidos por teclado.
        for (i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            listaNum[i] = dato.nextInt();
            dato.close(); //Cerramos el Scanner.
        }

        //Utilizamos un bucle for decreciente para mostrar de forma invertida los valores del array.
        for (i = 9; i >= 0; i--) {
            System.out.print(listaNum[i] + " ");
        }
    }
}
