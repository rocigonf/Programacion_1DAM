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

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Decimos qué es el programa e inicializamos las variables necesarias.
        System.out.println("Acceso a caja fuerte.");
        int combinacion = 7342;
        int claveIntroducida = 0;
        int cont = 0;

        //Si contador es menor a 4 y la clave introducida sea distinta a la combinación, se sigue introduciendo la clave.
        while (cont < 4 && claveIntroducida != combinacion) {
            System.out.print("Introduce una clave de 4 cifras: ");
            claveIntroducida = dato.nextInt();
            cont++;

            //Si la clave introducida es errónea, se muestra el mensaje de que la combinacion es incorrecta y vuelve a pedir que la introduzcas.
            if (claveIntroducida != combinacion) {
                System.out.println("Lo siento, esa no es la combinación.");
            }

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();
        }

        //Si la clave introducida es correcta, se muestra el mensaje de que la caja se ha abierto.
        if (claveIntroducida == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
            }
    }
}
