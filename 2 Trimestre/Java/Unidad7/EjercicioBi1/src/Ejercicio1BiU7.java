/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ejercicio1BiU7 {
    public static void main(String[] args) {
        int[][] num = new int[3][6];

        //Almacenamos los datos correspondientes.
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        //Imprimimos parte de la tabla.
        System.out.print("Array num ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Columna " + i + " ");
        }
        System.out.println();
        
        //Imprimimos el resto de la tabla con sus respectivos valores.
        for (int i = 0; i < num.length; i++) {
            System.out.print("  Fila " + i + "      ");
            for(int j = 0; j < 6; j++) {
                System.out.print(num[i][j] + "         ");
            
            }
            System.out.println();
        }
    }
}