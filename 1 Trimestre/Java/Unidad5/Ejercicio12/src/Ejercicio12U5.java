/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio12U5 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos el número por teclado.
        System.out.println("Voy a mostrar los n primeros números de la serie de Fibonacci.");
        System.out.print("Introduce un número: ");
        int numIntroducido = dato.nextInt();

        //Inicializamos las variables correspondientes.
        int anterior = 1;
        int posterior = 1;
        int suma;
        
        //Creamos un bucle que se repita desde 1 hasta el número introducido por teclado.
        for(int i = 1; i <= numIntroducido; i++){
            System.out.println(anterior);
            suma = anterior + posterior;
            anterior = posterior;
            posterior = suma;
        }

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();
    }
}
