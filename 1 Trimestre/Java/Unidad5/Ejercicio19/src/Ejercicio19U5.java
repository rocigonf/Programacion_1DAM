/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio19U5 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos datos por teclado e inicializamos las variables necesarias.
        System.out.println("Voy a pintar una pirámide.");
        System.out.print("Introduce la altura: ");
        int altura = dato.nextInt();
        System.out.print("Introduce un carácter con el que quieres que pinte la pirámide: ");
        String simbolo = dato.next();

        int base = 1, fila = 1;
        int espacio = altura - 1;

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        //Mientras la base sea menor o igual a la altura de la pirámide:
        while (base <= altura) {
            //Dibujamos los espacios.
            for (int i = 0; i < espacio; i++) {
                System.out.print(" ");
            }
            //Dibujamos los carácteres.
            for (int i = 0; i < fila; i++) {
                System.out.print(simbolo);
            }

            System.out.println(" ");

            //Cada línea la base aumenta en 1, los espacios disminuyen en 1 y la fila aumenta en 2.
            base += 1;
            espacio -= 1;
            fila += 2;
        }
    }
}
