/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
public class Ejercicio5U7 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        //Declaramos las variables i, max y min. También declaramos el array listaNum[].
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i;
        int listaNum[] = new int[10];

        //Usamos un bucle for para almacenar los 10 números introducidos por teclado en el array y comprobar cuál número es el mayor y cuál es el menor.
        for (i = 0; i < 10; i++) {
            System.out.print("Introduce un número: ");
            listaNum[i] = dato.nextInt();
            if (listaNum[i] < min) {
                min = listaNum[i];
            }
            if (listaNum[i] > max) {
                max = listaNum[i];
            }
        }
        System.out.println();

        //Utilizamos otro bucle for para imprimir por pantalla "máximo" y "mínimo" junto a sus respectivos números.
        for (i = 0; i < 10; i++) {
            System.out.print(listaNum[i]);
            if (listaNum[i] == max) {
                System.out.print(" es el máximo");
            }
            if (listaNum[i] == min) {
                System.out.print(" es el mínimo");
            }

        System.out.println();
        }
        dato.close();
    }
}
