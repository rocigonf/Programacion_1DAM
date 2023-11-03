/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. Respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio2U4 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos la hora por teclado.
        System.out.println("Introduce la hora actual. (En formato 24h y sin tener en cuenta los minutos.)");
        int hora = dato.nextInt();
        
        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        //Creamos una serie de if que comprueba los tramos horarios e imprime el saludo correspondiente.
        if ((hora >= 6) && (hora <= 12)){
            System.out.println("Son las " + hora + ", buenos días.");
        } else if ((hora >= 13) && (hora <= 20)){
            System.out.println("Son las " + hora + ", buenas tardes.");
        } else if ((hora >= 21) && (hora <= 24)){
            System.out.println("Son las " + hora + ", buenas noches.");
        } else if (hora <= 5){
            System.out.println("Son las " + hora + ", buenas noches.");
        } else {
            System.out.println("Has introducido una hora incorrecta.");
        }

    }
}
