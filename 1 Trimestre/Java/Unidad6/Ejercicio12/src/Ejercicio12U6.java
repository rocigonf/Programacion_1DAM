/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio12U6 {
    public static void main(String[] args) throws Exception {
        //Inicializo variables de maximo y minimo para poder generar un rango de números aleatorios concreto.
        int maximo = 126;
        int minimo = 32;
        //Creo un bucle que imprima, por ejemplo, 2000 caracteres ya que el programa debe llenar la pantalla.
        for (int i = 0; i < 2000; i++) {
            //Genero los números aleatorios.
            int matrix = (int)Math.floor(Math.random() *(maximo - minimo + 1) + minimo);
            //Hago casting a char para que los números se conviertan a sus correspondientes en ascii y los imprimo.
            char simbolo = (char)matrix;
            System.out.print(simbolo);
            //Para dar un efecto más matrix, cada caracter se imprime cada 10 milisegundos.
            Thread.sleep(10);
        }
    }
}
