/**
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 * mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 * de Java (con un solo println) ¿es posible?
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 * 
 */
public class Ejercicio7U2 {
    public static void main(String[] args) throws Exception {
        //Declaramos las variables de las letras que conforman las palabras "Buenas tardes".
        char a1 = 'B';
		char a2 = 'u';
		char a3 = 'e';
		char a4 = 'n';
        char a5 = 'a';
        char a6 = 's';
        char a7 = 't';
        char a8 = 'r';
        char a9 = 'd';
		
		String frase1 = ", ¿cómo estás?";
		
        //Imprimo el texto concatenando cada caracter con un texto vacío "" para evitar que se sumen las variables como números enteros.
		System.out.println(a1 + "" + a2 + "" + a3 + "" + a4 + "" + a5 + "" + a6 + " " + a7 + "" + a5 + "" + a8 + "" + a9 + "" + a3 + "" + a6 + "" + frase1);
		//Otra forma de hacerlo es formateando.
		System.out.printf("%s%s%s%s%s%s %s%s%s%s%s%s", a1, a2, a3, a4, a5, a6, a7, a5, a8, a9, a3, a6 + frase1);
    }
}
