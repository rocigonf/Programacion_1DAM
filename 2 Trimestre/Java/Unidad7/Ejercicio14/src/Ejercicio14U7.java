/**
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import java.util.Scanner;
public class Ejercicio14U7 {
    public static void main(String[] args) throws Exception {
        //Me falta poner comentarios, optimizar y mostrar el array original junto a los indices.
        Scanner dato = new Scanner(System.in);
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] listaPalabras = new String[8];
        String[] listaAux = new String[8];
        int i, j = 0;
        System.out.println("Introduce 8 palabras de una en una: ");
        for (i = 0; i < listaPalabras.length; i++) {
            listaPalabras[i] = dato.next();

            for (String c : colores) {
                if (listaPalabras[i].equals(c)) {
                    //Se copia el valor de c a la lista auxiliar e incrementa la j en cada repetición.
                    listaAux[j++] = c;
                }
            }
            if (i == 8) {
                dato.close();
            }
        }
        for (i = 0; i < listaPalabras.length; i++) {
            boolean esColor = false;
            for (String c : colores) {
                if (listaPalabras[i].equals(c)) {
                    //Se copia el valor de c a la lista auxiliar e incrementa la j en cada repetición.
                    esColor = true;
                }
            }
            if (!esColor) {
                listaAux[j++] = listaPalabras[i];
            }
        }
        for (String r : listaAux) {
            System.out.printf("%-8s", r);
        }
        
    }
}
