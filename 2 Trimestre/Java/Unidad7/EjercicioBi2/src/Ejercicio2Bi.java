/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
public class Ejercicio2Bi {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        int[][] num = new int[4][5];
        int x,y;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaTotal = 0;
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 5; y++) {
                System.out.println("Fila " + x + " Columna " + y);
                num[x][y] = dato.nextInt();
            }
        }

        for (x = 0; x < 4; x++) {
            for(y = 0; y < 5; y++) {
                System.out.printf("%7d ", num[x][y]);
                sumaFila += num[x][y];
            }
            System.out.printf("%7d\n", sumaFila);
        }
        for (y = 0; y < 5; y++) {
            for(x = 0; x < 4; x++) {
                sumaColumna += num[x][y];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%7d ", sumaColumna);
        }
        System.out.printf("%7d ", sumaTotal);
    }
}
