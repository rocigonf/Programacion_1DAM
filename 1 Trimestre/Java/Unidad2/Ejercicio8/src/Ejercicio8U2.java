/**
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación
 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 * 
 */
public class Ejercicio8U2 {
    public static void main(String[] args) throws Exception {
        char a = 'A';
        char d = 'd';
        char i = 'i';
        char o = 'ó';
        char s = 's';

        String resultado = a + "" + d + "" + i + "" + o + "" + s;

        System.out.println("El resultado de concatenar los char en un String es: " + resultado);
    }
}
