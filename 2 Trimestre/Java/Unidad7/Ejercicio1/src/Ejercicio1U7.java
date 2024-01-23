/**
 * Define un array de 12 números enteros con nombre num y asigna los valores
 * según la tabla que se muestra a continuación. Muestra el contenido de todos
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no
 * han sido inicializados?
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio1U7 {
    public static void main(String[] args) throws Exception {
        int num[] = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        System.out.println("Índice:    0    1    2    3    4    5    6    7    8    9    10    11");
        System.out.println("Valor:     " + num[0] + "  " + num[1] + "    " + num[2] + "    " + num[3] + "    " + num[4] + "    " + num[5] + "    " + num[6] + "   " + num[7] + "    " + num[8] + "    " + num[9] + "  " + num[10] + "     " + num[11] + "    ");
    }
}
