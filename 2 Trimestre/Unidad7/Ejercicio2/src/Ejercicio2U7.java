/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio2U7 {
    public static void main(String[] args) throws Exception {
        char simbolo[] = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        System.out.println("Índice:    0    1    2    3    4    5    6    7    8    9");
        System.out.println("Valor:     " + simbolo[0] + "    " + simbolo[1] + "    " + simbolo[2] + "     " + simbolo[3] + "     " + simbolo[4] + "    " + simbolo[5] + "     " + simbolo[6] + "    " + simbolo[7] + "    " + simbolo[8] + "    " + simbolo[9]);
    }
}

