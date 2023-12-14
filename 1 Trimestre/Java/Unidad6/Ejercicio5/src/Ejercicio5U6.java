/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio5U6 {
    public static void main(String[] args) throws Exception {
        int num;
        int min = 199, max = 100, suma = 0;
        for (int i = 0; i < 50; i++) {
            num = (int)(Math.random()*100)+100;
            System.out.print(num + " ");
            suma += num;

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double media = suma / 50;
        System.out.printf("El mayor número es: %s\nEl menor número es: %s\nLa media de todos los números es: %.0f", max, min, media);
    }
}
