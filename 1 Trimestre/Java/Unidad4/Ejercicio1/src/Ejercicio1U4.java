/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio1U4 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos el día de la semana y convertimos el dato introducido por teclado a minúscula para evitar problemas.
        System.out.print("Dime un día de la semana (sin tildes) y te diré qué asignatura hay a primera hora ese día: ");
        String dia = dato.nextLine().toLowerCase();

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        switch(dia){
            case "lunes":
            case "martes":
                System.out.println("Sistemas Informáticos");
                break;
            case "miercoles":
                System.out.println("Bases de Datos");
                break;
            case "jueves":
                System.out.println("Lenguajes de Marcas");
                break;
            case "viernes":
                System.out.println("Bases de Datos");
                break;
            default:
        }
    }
}
