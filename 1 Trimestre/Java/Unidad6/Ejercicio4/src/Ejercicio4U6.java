/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
 * por espacios.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio4U6 {
    public static void main(String[] args) throws Exception {
        
        //Bucle que llega hasta 20.
        for (int i = 0; i < 20; i++) {
            //Imprimimos por pantalla el número aleatorio redondeado según sus decimales.
            System.out.print( (Math.round((Math.random()*11))) + " ");
        }
    }
}
