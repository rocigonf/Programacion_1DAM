/**
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio10U3 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        System.out.print("Conversor de Mb a Kb. Introduce la cantidad a convertir: ");
        int megabit = dato.nextInt();

        //Cerramos el Scanner para evitar un error de fuga de memoria.
        dato.close();

        //Un Mb equivale a 1000 Kb.
        int kilobit = megabit * 1000;
        
        System.out.printf("%d Mb equivalen a %d Kb.", megabit, kilobit);
    }
}
