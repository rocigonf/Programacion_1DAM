/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
public class Ejercicio6U7 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner, el array, un array auxiliar, una variable auxiliar y una variable i.
        Scanner dato = new Scanner(System.in);
        int listaNum[] = new int[15];
        int listaAux[] = new int[15];
        int aux, i;
        //Usamos un bucle for para almacenar en el array uno a uno los números introducidos por teclado.
        for (i = 0; i < 15; i++) {
            System.out.print("Introduce un número: ");
            listaNum[i] = dato.nextInt();
            //Copiamos el array original al array auxiliar para imprimirlo por pantalla en el resultado.
            listaAux[i] = listaNum[i];
            //Cerramos el Scanner.
            if (i == 15) {
                dato.close();
            }
        }
        //Copiamos el último valor del array original a la variable auxiliar.
        aux = listaNum[14];
        //Se rota el array usando un bucle que disminuye.
        for (i = 14; i > 0; i--) {
            listaNum[i] = listaNum[i - 1];
            
        }
        //Copiamos la variable auxiliar al primer valor del array para terminar la rotación.
        listaNum[0] = aux;
        //Imprimimos el resultado por pantalla.
        System.out.printf("Original         Rotado\n");
        for (i = 0; i < 15; i++) {
            System.out.printf("%-13d    %-1d\n", listaNum[i], listaAux[i]);
        }
        
    }
}
