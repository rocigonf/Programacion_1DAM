package Funciones;
/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ejercicio16U8 {
    public static void main(String[] args) {
        System.out.println("Números capicúa que hay entre 1 y 9999: ");
        for (int i = 0; i < 9999; i++) {
            if (Funciones.esCapicua(i) == true) {
                System.out.println(i);
            }
        }
    }
}
