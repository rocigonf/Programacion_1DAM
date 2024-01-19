/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 * aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el
 * ordenador se queda pensando antes de mostrar los números.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ejercicio4Bi {
    public static void main(String[] args) throws InterruptedException {
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
                Thread.sleep(100);
            }
            System.out.printf("|%7d\n", sumaFila);
            Thread.sleep(300);
        }
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
            Thread.sleep(25);
        }
        System.out.println();
        for (y = 0; y < 5; y++) {
            for(x = 0; x < 4; x++) {
                sumaColumna += num[x][y];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%7d ", sumaColumna);
            Thread.sleep(300);
        }
        System.out.printf("|%7d ", sumaTotal);
        Thread.sleep(300);
    }
}
