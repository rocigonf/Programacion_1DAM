/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle while.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio5U5 {
    public static void main(String[] args) throws Exception {
        //Inicializamos la variable i.
        int i = 320;

        //En este bucle, mientras i sea mayor o igual a 160, imprimirá i disminuyendo en 20 cada vuelta.
        while (i >= 160) {
            System.out.println(i);
            i = i - 20;
        }
    }
}
