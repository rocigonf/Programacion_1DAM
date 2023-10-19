/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        //Declaramos variables x e y, valiendo respectivamente 144 y 999.
        float x = 144;
        float y = 999;
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        System.out.println("La suma de ambos es: " + (x + y));
        System.out.println("La resta de ambos es: " + (x - y));
        System.out.println("La multiplicación de ambos es: " + (x * y));
        System.out.println("La división de ambos es: " + (x / y));
    }
}
