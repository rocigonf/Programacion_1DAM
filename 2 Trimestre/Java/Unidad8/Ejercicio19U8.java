/**
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 * hexadecimal y octal.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
import Funciones.Matemáticas.*;
public class Ejercicio19U8 {
    public static void main(String[] args) {

        //Inicializamos el Scanner y pedimos un número inicial.
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String num = dato.next();
        
        //Menú de opciones con un switch.
        System.out.println("Seleccione la base de entrada:");
        System.out.println("--------------");
        System.out.println("1. Decimal");
        System.out.println("2. Binario");
        System.out.println("3. Hexadecimal");
        System.out.println("4. Octal");
        int menuOpcion = dato.nextInt();
        String resultado = "";
        switch (menuOpcion) {
            case 1:
                // Decimal a otras bases.
                resultado = Matemáticas.convertirDecimal(num);
                break;
            case 2:
                // Binario a otras bases.
                resultado = Matemáticas.convertirBinario(num);
                break;
            case 3:
                // Hexadecimal a otras bases.
                resultado = Matemáticas.convertirHexadecimal(num);
                break;
            case 4:
                // Octal a otras bases.
                resultado = Matemáticas.convertirOctal(num);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();
        System.out.println("El resultado es \n" + resultado);
    }
}
