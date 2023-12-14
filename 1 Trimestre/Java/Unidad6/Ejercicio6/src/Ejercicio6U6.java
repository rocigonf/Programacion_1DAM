/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe
 * adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el
 * programa dirá cuántas oportunidades quedan y si el número introducido es menor o
 * mayor que el que ha pensado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio6U6 {
    public static void main(String[] args) throws Exception {

        Scanner dato = new Scanner(System.in);
        int numIntroducido = 0;
        int numCorrecto = (int)(Math.random()*100)+1;
        int intentos = 5;

        System.out.println("Adivina un número entre 0 y 100. Tienes 5 oportunidades.");
        do {
            System.out.print("Introduce un número: ");
            numIntroducido = dato.nextInt();
            
            if (numIntroducido != numCorrecto){
                System.out.println("Has fallado, te quedan " + (intentos-1) + " intentos.");
            } else{
                System.out.println("Enhorabuena, has acertado.");
            }
            intentos--;
        } while (intentos > 0 && numCorrecto != numIntroducido);   
        if (intentos == 0){
            System.out.println("Has perdido, vuelve a intentarlo.");
        }
        dato.close();
    }
}
