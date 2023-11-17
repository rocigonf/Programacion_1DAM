/**
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio17U5 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner y las variables necesarias.
        Scanner dato = new Scanner(System.in);
        int numIntroducido = 0;
        int suma = 0;

        //Mientras el número introducido sea menor a 0, va a volver a pedir número ya que debe ser entero y positivo.
        do {
            System.out.print("Introduce un número entero y positivo: ");
            numIntroducido = dato.nextInt();
        } while (numIntroducido < 0);
        //El bucle for se va a repetir desde el numero introducido hasta el mismo número + cien.
        for (int i = numIntroducido; i < numIntroducido + 100; i++) {
            suma += i;
        }

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();
        
        //Imprimimos el resultado por pantalla.
        System.out.printf("La suma de los siguientes 100 números de %d es %d", numIntroducido, suma);
    }
}
