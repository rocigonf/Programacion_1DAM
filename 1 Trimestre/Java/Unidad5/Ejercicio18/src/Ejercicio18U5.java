/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio18U5 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner y las variables correspondientes.
        Scanner dato = new Scanner(System.in);
        int numIntroducido1 = 0, numIntroducido2 = 0;

        //Mientras ambos números sean iguales, se pedirá que se introduzcan los números.
        while (numIntroducido1 == numIntroducido2) {
            System.out.println("Introduce dos números enteros, deben ser distintos.");
            System.out.print("Introduce el primer número: ");
            numIntroducido1 = dato.nextInt();
            System.out.print("Introduce el segundo número: ");
            numIntroducido2 = dato.nextInt();

            //Cerramos el Scanner para evitar errores de fuga de memoria.
            dato.close();

            //Como se debe ordenar de menor a mayor, si el primer número es mayor que el segundo, se intercambian de lugar utilizando una variable auxiliar "num".
            if (numIntroducido1 > numIntroducido2) {
                int num = numIntroducido1;
                numIntroducido1 = numIntroducido2;
                numIntroducido2 = num;
            }
        }
        //Desde el número menor hasta el número mayor, incrementa de 7 en 7 y se imprime cada resultado en pantalla.
        for (int i = numIntroducido1; i < numIntroducido2; i+=7) {
            System.out.print(i + " ");
        }
    }
}
