/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio16U5 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos el número por teclado.
        System.out.print("Introduce un número y te diré si es primo: ");
        int numIntroducido = dato.nextInt();

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        //Según el resultado de la función esPrimo(), mostrará un resultado u otro.
        if (esPrimo(numIntroducido)) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }

    //Creamos la función esPrimo() utilizando la variable numIntroducido.
    public static boolean esPrimo(int numIntroducido){
        //Creamos la variable booleana "esPrimo", la cual por defecto es verdadera.
        boolean esPrimo = true;
        for (int i = 2; i < numIntroducido; i++) {
            if ((numIntroducido % i) == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }
}
