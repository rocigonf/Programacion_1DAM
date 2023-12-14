/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio13U6 {
    public static void main(String[] args) throws Exception {
        //Explicamos el programa e inicializamos variables.
        System.out.println("Voy a tirar dos dados hasta que ambos dados tengan el mismo valor.\n");
        int primerDado, segundoDado;
        //Generamos e imprimimos ambos dados mientras sus valores sean distintos.
        do {
            primerDado = (int)(Math.random()*6)+1;
            segundoDado = (int)(Math.random()*6)+1;
            System.out.println("Primer dado: " + primerDado);
            System.out.println("Segundo dado: " + segundoDado);
            System.out.println(" ");
        } while (primerDado != segundoDado);
    }
}
