package Funciones.Array1D;
/**
 * Biblioteca de funciones para arrays.(Ejercicios 20-28)
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Unidimensionales {
    
    /**
     * Función que genera un array de tamaño n con números aleatorios 
     * cuyo intervalo (mínimo y máximo) se indica como parámetro.
     * 
     * @param n tamaño del array
     * @param minimo mínimo del array
     * @param maximo máximo del array
     * @return array de tamaño n generado de forma aleatoria
     */
    public static int[] generaArrayInt(int n, int minimo, int maximo){
        //Crea un array de tamaño x.
        int[] arrayAleatorio = new int[n];
        //Llena el array con números aleatorios dentro del intervalo minimo-maximo.
        for (int i = 0; i < n; i++) {
            //Genera un número aleatorio.
            double numAleatorio = Math.random();
            //Escala y mueve el número aleatorio al intervalo minimo-maximo.
            int numFinal = (int) (numAleatorio * (maximo - minimo + 1) + minimo);
            //Asigna el número final al array.
            arrayAleatorio[i] = numFinal;
        }
        return arrayAleatorio;
    }

    /**
     * Función que devuelve el mínimo del array que se pasa como parámetro.
     * 
     * @param x array que se pasa como parámetro
     * @return número más pequeño (el mínimo) que contiene el array
     */
    public static int minimoArrayInt(int[] x) {
        //Inicializa el mínimo con el primer elemento del array
        int minimo = x[0];

        //Itera sobre el array para encontrar el valor mínimo
        for (int i = 1; i < x.length; i++) {
            if (x[i] < minimo) {
                minimo = x[i];
            }
        }
        return minimo;
    }

    /**
     * Función que devuelve el máximo del array que se pasa como parámetro.
     * 
     * @param x array que se pasa como parámetro
     * @return número más grande (el máximo) que contiene el array
     */
    public static int maximoArrayInt(int[] x) {
        //Inicializa el mínimo con el primer elemento del array
        int maximo = x[0];

        //Itera sobre el array para encontrar el valor mínimo
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maximo) {
                maximo = x[i];
            }
        }
        return maximo;
    }
    
    /**
     * Función que devuelve la media del array que se pasa como parámetro.
     * 
     * @param x 
     * @return
     */
    public static double mediaArrayInt(int[] x){
        //Inicializa la suma.
        int suma = 0;
        //Recorre el array para calcular la suma de los elementos
        for (int numero : x) {
            suma += numero;
        }
        //Calcula la media dividiendo la suma por la cantidad de elementos.
        double media = (double) suma / x.length;
        return media;
    }

    /**
     * Función que dice si un número está o no dentro de un array.
     * 
     * @param x número el cual se busca en el array
     * @param array array donde se busca el número
     * @return true si el número está en el array, false en caso contrario
     */
    public static boolean estaEnArrayInt(int x, int[] array){
        //Recorre el array para verificar si el número está presente
        for (int verifNum : array) {
            if (verifNum == x) {
                return true; // El número está presente en el array
            }
        }
        //Si no se encuentra el número en el array, devuelve false.
        return false;
    }

    /**
     * Función que busca un número en un array y devuelve la posición en la que se encuentra.
     * 
     * @param x número que se busca en el array
     * @param array array en el que se busca el número
     * @return i (posición del número) en caso de que sí esté el número en el array y -1 en caso contrario
     */
    public static int posicionEnArray(int x, int[] array) {
        //Recorre el array para buscar la posición del número
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i; // Devuelve la posición del número en el array.
            }
        }
        //Si no se encontró el número en el array devuelve -1.
        return -1;
    }

    /**
     * Función que le da la vuelta a un array.
     * 
     * @param array array al que se le da la vuelta
     * @return array invertido
     */
    public static int[] volteaArrayInt(int[] array) {
        //Crea un nuevo array con la misma longitud
        int[] arrayInvertido = new int[array.length];
        //Rellena el nuevo array invirtiendo el orden
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }

    /**
     * Función que rota n posiciones a la derecha los números de un array.
     * 
     * @param array array al que se le rotan los números
     * @param n número de posiciones a las que rotan los números hacia la derecha
     * @return devuelve el array con los números rotados n posiciones
     */
    public static int[] rotaDerechaArrayInt(int[] array, int n) {
        //Realiza la rotación a la derecha n veces.
        int longitud = array.length;
        n = n % longitud;
        //Realiza la rotación y devuelve el array rotado.
        for (int i = 0; i < n; i++) {
            int ultimo = array[longitud - 1];
            for (int j = longitud - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = ultimo;
        }
        return array;
    }

    /**
     * Función que rota n posiciones a la izquierda los números de un array.
     * 
     * @param array array al que se le rotan los números
     * @param n número de posiciones a las que rotan los números hacia la izquierda
     * @return devuelve el array con los números rotados n posiciones
     */
    public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
        //Realiza la rotación a la izquierda n veces.
        int longitud = array.length;
        n = n % longitud;

        //Realiza la rotación y devuelve el array rotado.
        for (int i = 0; i < n; i++) {
            int primero = array[0];
            for (int j = 0; j < longitud - 1; j++) {
                array[j] = array[j + 1];
            }
            array[longitud - 1] = primero;
        }

        return array;
    }
}
