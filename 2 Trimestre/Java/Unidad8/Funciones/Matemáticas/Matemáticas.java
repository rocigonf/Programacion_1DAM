package Funciones.Matemáticas;
/**
 * Biblioteca de funciones matemáticas.(Ejercicios 1-14)
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Matemáticas{

    //Ej1
    /**
     * Función que devuelve true si el número es capicúa y false si no lo es.
     * 
     * @param x número del que se quiere saber si es capicúa
     * @return true si el número es capicúa y false para el caso contrario.
     */
    public static boolean esCapicua(int x){
        int volteado = voltea(x);
        if (volteado == x) {
            return true;
        }
        return false;
    }

    //Ej2
    /**
     * Función que verifica si un número es primo.
     * 
     * @param x Número a verificar
     * @return true si el número es primo, false de lo contrario
     */
    public static boolean esPrimo(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true; // Si no hay ningún divisor, el número es primo
    }

    //Ej3
    /**
     * Función que devuelve el menor primo que es mayor al número dado.
     * 
     * @param x Número de referencia
     * @return El menor primo mayor que el número dado
     */
    public static int siguientePrimo(int x) {
        int siguiente = x + 1;

        while (!esPrimo(siguiente)) {
            siguiente++;
        }

        return siguiente;
    }

    //Ej4
    /**
     * Función que devuelve la potencia de una base y exponente.
     * 
     * @param base base de la potencia
     * @param exponente exponente de la potencia
     * @return potencia
     */
    public static double potencia(double base, double exponente){
        double potenciaNum = Math.pow(base, exponente);
        return potenciaNum;
    }

    //Ej5
    /**
     * Función que cuenta el número de dígitos de un número entero.
     * 
     * @param x número al que se le van a contar los dígitos.
     * @return número de dígitos del número entero.
     */
    public static int digitos(int x){
        int cont = 0;
        if (x == 0){
            return 1;
        }
        while (x != 0) {
            x /= 10;
            cont++;
        }
        return cont;
    }

    //Ej6
    /**
     * Función que le da la vuelta a un número.
     * 
     * @param x número al que se le va a dar la vuelta
     * @return número volteado
     */
    public static int voltea(int x){
        if (x < 0){
            return -voltea(-x);
        }
        int numVolteado = 0;
        while (x > 0) {
            numVolteado = (numVolteado * 10 ) + (x % 10);
            x = x / 10;
        }
        return numVolteado;
    }

    //Ej7
    /**
    * Función que devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
    *
    * @param x número entero
    * @param n posición dentro del número <code>x</code>
    * @return dígito que está en la posición n del número <code>x</code>
    *         empezando a contar por el 0 y de izquierda a derecha
    */
    public static int digitoN(int x, int n) {
        x = voltea(x);
        while (n-- > 0) {
            x = x / 10;
        }
        return (int)x % 10;
    }

    //Ej8
    /**
    * Función que da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
    *
    * @param x número entero
    * @param d dígito a buscar dentro del número
    * @return posición de la primera ocurrencia del dígito dentro del número o
    *         -1 si no se encuentra
    */
    public static int posicionDeDigito(int x, int d) {
        int i;
        for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};
            if (i == digitos(x)) {
                return -1;
            } else {
                return i;
            }
    }

    //Ej9
    /**
     * Función que le quita a un número n dígitos por detrás (por la derecha).
     * 
     * @param x número al cual se quitarán los dígitos
     * @param n cantidad de dígitos que se quitarán
     * @return número resultante después de quitar los dígitos
     */
    public static int quitaPorDetras(int x, int n) {
        if (n < 0) {
            System.out.println("La cantidad no debe ser negativa.");
            return -1;
        }
        if (n >= digitos(x)) {
            System.out.println("La cantidad excede o iguala el número de dígitos.");
            return -1;
        }
        int resultado = x / (int) Math.pow(10, n);
        return resultado;
    }

    //Ej10
    /**
     * Función que quita una cantidad n de dígitos por delante de un número.
     *
     * @param x número al cual se quitarán los dígitos
     * @param n La cantidad de dígitos que se quitarán
     * @return número resultante después de quitar los dígitos
     */
    public static double quitaPorDelante(int x, int n) {
        if (n < 0) {
            System.out.println("La cantidad no debe ser negativa.");
            return -1;
        }
        if (n >= digitos(x)) {
            System.out.println("La cantidad excede o iguala la longitud del número.");
            return -1;
        }
        double potencia = potencia(10, digitos(x) - n);
        double resultado = x % potencia;

        return resultado;
    }
    
    //Ej11
    /**
     * Función que pega por detrás un nuevo dígito a un número.
     * 
     * @param x número al que se le van a pegar números por detrás
     * @param y dígito que se va a pegar por detrás del número original
     * @return el número original con el nuevo dígito pegado por detrás
     */
    public static double pegaPorDetras(int x, int y) {
        return x * 10 + y;
    }
    
    //Ej12
    /**
     * Función que pega por delante un nuevo dígito a un número.
     * 
     * @param x número al que se le van a pegar números por delante
     * @param y dígito que se va a pegar por delante del número original
     * @return el número original con el nuevo dígito pegado por delante
     */
    public static double pegaPorDelante(int x, int y) {
        double nuevoNumero = y * potencia(10, digitos(x)) + x;
        return nuevoNumero;
    }

    //Ej13
    /**
     * Función que toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
     * 
     * @param x número entero
     * @param inicio posición inicial
     * @param fin posición final
     * @return trozo de número compuesto por todos los dígitos que van desde
     *         la posición inicial a la posición final incluyendo ambos
     */
    public static int trozoDeNumero(int x, int inicio, int fin) {
        x = (int) quitaPorDelante(x, inicio);
        x = quitaPorDetras(x, digitos(x) - fin - 1);
        return x;
    }

    //Ej14
    /**
    * Función que pega dos números para formar uno solo.
    *
    * @param x número que se pega por la izquierda
    * @param y número que se pega por la derecha
    * @return número compuesto de x e y
    */
    public static long juntaNumeros(int x, int y) {
        return (long)(x * potencia(10, digitos(y))) + y;
    }

    //Ej15
    /**
     * Función que convierte binario a decimal.
     * 
     * @param x número binario a convertir
     * @return número decimal resultante de la conversión
     */
    public static int pasarADecimal(String x){
        return Integer.parseInt(x,2);
    }

    //Ej16
    /**
     * Función que convierte decimal a binario.
     * @param x número decimal a convertir
     * @return número binario resultante de la conversión
     */
    public static String pasarABinario(int x){
        return Integer.toBinaryString(x);
    }

    //Ej17. Similares a las dos funciones anteriores pero con más opciones.
    /**
     * Función que convierte un número decimal a binario, hexadecimal y octal.
     * 
     * @param x número decimal a convertir
     * @return números resultantes de las conversiones
     */
    public static String convertirDecimal(String x) {
        int decimal = Integer.parseInt(x);
        return "Decimal: " + decimal +
                "\nBinario: " + Integer.toBinaryString(decimal) +
                "\nHexadecimal: " + Integer.toHexString(decimal) +
                "\nOctal: " + Integer.toOctalString(decimal);
    }

    /**
     * Función que convierte un número binario a decimal, hexadecimal y octal.
     * 
     * @param x número binario a convertir
     * @return números resultantes de las conversiones
     */
    public static String convertirBinario(String x) {
        int decimal = Integer.parseInt(x, 2);
        return "Binario: " + x +
                "\nDecimal: " + decimal +
                "\nHexadecimal: " + Integer.toHexString(decimal) +
                "\nOctal: " + Integer.toOctalString(decimal);
    }

    /**
     * Función que convierte un número hexadecimal a decimal, binario y octal.
     * 
     * @param x número hexadecimal a convertir
     * @return números resultantes de las conversiones
     */
    public static String convertirHexadecimal(String x) {
        int decimal = Integer.parseInt(x, 16);
        return "Hexadecimal: " + x +
                "\nDecimal: " + decimal +
                "\nBinario: " + Integer.toBinaryString(decimal) +
                "\nOctal: " + Integer.toOctalString(decimal);
    }

    /**
     * Función que convierte un número octal a decimal, binario y hexadecimal.
     * 
     * @param x número octal a convertir
     * @return números resultantes de las conversiones
     */
    public static String convertirOctal(String x) {
        int decimal = Integer.parseInt(x, 8);
        return "Octal: " + x +
                "\nDecimal: " + decimal +
                "\nBinario: " + Integer.toBinaryString(decimal) +
                "\nHexadecimal: " + Integer.toHexString(decimal);
    }
}
