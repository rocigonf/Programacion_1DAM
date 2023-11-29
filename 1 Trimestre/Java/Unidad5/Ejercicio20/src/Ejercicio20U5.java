/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio20U5 {
    public static void main(String[] args) throws Exception {
        //EJERCICIO INCOMPLETO
        //EJERCICIO INCOMPLETO
        //EJERCICIO INCOMPLETO
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos datos por teclado e inicializamos las variables necesarias.
        System.out.println("Voy a pintar una pirámide hueca.");
        System.out.print("Introduce la altura: ");
        int altura = dato.nextInt();
        System.out.print("Introduce un símbolo con el que pintar la pirámide: ");
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
