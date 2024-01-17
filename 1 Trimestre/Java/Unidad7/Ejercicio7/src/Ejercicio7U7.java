/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre 
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos 
 * valores y a continuación cambiará todas las ocurrencias del primer valor por el 
 * segundo en la lista generada anteriormente. Los números que se han cambiado deben 
 * aparecer entrecomillados.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
public class Ejercicio7U7 {
    public static void main(String[] args) throws Exception {
        //Explicamos el programa e inicializamos el Scanner y el array.
        System.out.println("Voy a mostrar una lista de números e intercambiaré cualquiera de los valores por otro que introduzcas:");
        Scanner dato = new Scanner(System.in);
        int lista[] = new int[100];
        //Generamos los 100 números aleatorios entre 0 y 20 y muestra el array por pantalla.
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int)(Math.random()*21);
            System.out.print(lista[i] + " ");
        }
        //Creamos las variables número escogido y número nuevo cuyos valores son introducidos por teclado.
        System.out.print("\nEscoge uno de los números: ");
        int numEscog = dato.nextInt();
        System.out.print("\nIntroduce el número nuevo: ");
        int numNuevo = dato.nextInt();
        //Cerramos el Scanner para evitar fallos de fuga de memoria.
        dato.close();
        //En este bucle se intercambian el número escogido por el número nuevo y se muestra en el array entre comillas.
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numEscog) {
                lista[i] = numNuevo;
                System.out.print("'" + lista[i] + "' ");
            } else {
                System.out.print(lista[i] + " ");
            }
        }
    }
}
