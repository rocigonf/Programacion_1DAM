package Funciones;
/**
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ejercicio15U8 {
    public static void main(String[] args) {
        System.out.println("Números primos del 1 al 1000: ");
        for (int i = 0; i < 1000; i++) {
            if (Funciones.esPrimo(i) == true) {
                System.out.println(i);
            }
        }
    }
}
