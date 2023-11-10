/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle do-while.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio6U5 {
    public static void main(String[] args) throws Exception {
        //Inicializamos la variable i.
        int i = 320;

        //Este bucle imprime la variable i disminuyendo en 20 cada vuelta hasta que i sea 160.
        do {
            System.out.println(i);
            i = i - 20;
        } while (i >= 160);
    }
}