/**
 * Modifica el programa anterior de tal forma que los números que se introducen en
 * el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ejercicio3Bi {
    public static void main(String[] args) throws Exception {
        int[][] num = new int[4][5];
        int x,y;
        int sumaFila = 0;
        int sumaColumna = 0;
        int sumaTotal = 0;
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 5; y++) {
                num[x][y] = (int)((Math.random()*900)+100);
            }
        }

        for (x = 0; x < 4; x++) {
            for(y = 0; y < 5; y++) {
                System.out.printf("%7d ", num[x][y]);
                sumaFila += num[x][y];
            }
            System.out.printf("|%7d\n", sumaFila);
        }
        System.out.println("---------------------------------------------------");
        for (y = 0; y < 5; y++) {
            for(x = 0; x < 4; x++) {
                sumaColumna += num[x][y];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%7d ", sumaColumna);
        }
        System.out.printf("|%7d ", sumaTotal);
    }
}
