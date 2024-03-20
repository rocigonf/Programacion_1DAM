/**
 * Escribe un programa que pase de binario a decimal.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
import Funciones.Matemáticas.*;
public class Ejercicio17U8 {
    public static void main(String[] args) {
        //Inicializo el Scanner y pido por teclado un número binario.
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce un número binario y lo convertiré a decimal: ");
        String numBinario=dato.nextLine();
        //Cierro el Scanner para evitar errores de fuga de memoria.
        dato.close();
        //Creo una variable nueva para llamar a la función pasarADecimal().
        int numDecimal=Matemáticas.pasarADecimal(numBinario);
        System.out.println(numBinario + " convertido a decimal es: " + numDecimal);
    }
}
