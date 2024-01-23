/**
 * Biblioteca de funciones matemáticas.(Ejercicios 1-14)
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Funciones{

    public static long voltea(long x){
        if (x < 0){
            return -voltea(-x);
        }
        long numVolteado = 0;
        while (x > 0) {
            numVolteado = (numVolteado * 10 ) + (x % 10);
            x = x / 10;
        }
        return numVolteado;
    }

}