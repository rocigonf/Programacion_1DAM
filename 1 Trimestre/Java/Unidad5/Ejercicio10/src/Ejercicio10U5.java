/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio10U5 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Explicamos el programa al usuario e inicializamos el resto de variables necesarias.
        System.out.println("Voy a calcular la media de los números positivos que introduzcas. Cuando desees terminar, introduce un número negativo.");
        int num = 0;
        int suma = 0;
        //El contador comienza en -1 para no contar el número negativo que se introduzca.
        int cont = -1;

        //En este while, permitirá introducir números mientras que estos sean positivos.
        while (num>=0) {
            System.out.print("Introduce un número: ");
            num = dato.nextInt();
            //Si el número es positivo, se añade a la suma.
            if (num>=0){
                suma += num;
            }
            cont++;
        }
        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();
        //Calculamos la media.
        double media = suma / cont;
        System.out.printf("La media de los números es: %.2f %n", media);
    }
}
