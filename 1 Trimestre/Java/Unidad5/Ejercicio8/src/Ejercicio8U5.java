/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio8U5 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        
        //Pedimos el número por teclado.
        System.out.print("Introduce un número y te mostraré su tabla de multiplicar:");
        int num = dato.nextInt();

        //Utilizamos un bucle for que recorra desde el 0 hasta el 10 e imprima la multiplicación correspondiente en cada vuelta.
        for (int i = 0; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
        dato.close();
    }
}
