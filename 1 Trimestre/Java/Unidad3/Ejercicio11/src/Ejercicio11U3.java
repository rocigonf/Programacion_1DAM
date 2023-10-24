/**
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Rocío Alejandra Gonfaus Luengo
 */
import java.util.Scanner;
public class Ejercicio11U3 {
    public static void main(String[] args) throws Exception {
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        System.out.print("Conversor de Kb a Mb. Introduce la cantidad a convertir: ");
        int kilobit = dato.nextInt();

        //Cerramos el Scanner para evitar un error de fuga de memoria.
        dato.close();

        //1000 Kb equivalen a 1 Mb.
        int megabit = kilobit / 1000;
        
        System.out.printf("%d Kb equivalen a %d Mb.", kilobit, megabit);
    }
}
