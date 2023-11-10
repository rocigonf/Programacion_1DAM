/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio7U5 {
    public static void main(String[] args) throws Exception {
        Scanner dato = new Scanner(System.in);
        System.out.println("Acceso a caja fuerte. Introduce una combinación de 4 cifras para abrirla. Tendrá sólo 4 oportunidades.");
        int password = 7340;
        for (int i = 1; i <= 4; i++){
            int combination = dato.nextInt();
            if (combination != password) {
                System.out.println("Lo siento, esa no es la combinación.");
                
            } else {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            }
        }
        dato.close();
    }
}
