/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ejercicio10U7 {
    public static void main(String[] args) throws Exception {
        //Inicializamos arrays y la variable i.
        int lista[] = new int[20];
        int listaAux[] = new int[20];
        int i;
        //Generamos los 20 números aleatorios entre 0 y 100 y muestra el array por pantalla.
        System.out.println("Array original:");
        for (i = 0; i < lista.length; i++) {
            lista[i] = (int)(Math.random()*101);
            System.out.print(lista[i] + " ");
        }
        //Espacios.
        System.out.println();
        System.out.println();
        //Se comprueba si cada número del array es par y se imprimen primero.
        System.out.println("Array rotado por pares e impares:");
        for (i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                listaAux[i] = lista[i];
                System.out.print(listaAux[i] + " ");
            }
        }
        //Se comprueba si cada número del array es impar y se imprimen detrás de los pares.
        for (i = 0; i < listaAux.length; i++) {
            if (lista[i] % 2 != 0){
                listaAux[i] = lista[i];
                System.out.print(listaAux[i] + " ");
            }
        }
    }
}
