/**
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
import Funciones.Matemáticas.*;
public class Ejercicio18U8 {
    public static void main(String[] args) {
        //Inicializo el Scanner y pido por teclado un número binario.
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduce un número decimal y lo convertiré a binario: ");
        int numDecimal=dato.nextInt();
        //Cierro el Scanner para evitar errores de fuga de memoria.
        dato.close();
        //Creo una variable nueva para llamar a la función pasarABinario().
        String numBinarioString=Matemáticas.pasarABinario(numDecimal);
        //Paso opcional: Convertir la variable numBinario de cadena a número entero.
        int numBinario = Integer.parseInt(numBinarioString);
        System.out.println(numDecimal + " convertido a binario es: " + numBinario);
    }
}
