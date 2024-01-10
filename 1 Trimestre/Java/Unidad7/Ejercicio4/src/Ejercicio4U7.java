/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
 * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
 * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
 * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
 * columnas.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ejercicio4U7 {
    public static void main(String[] args) throws Exception {
        //Creamos los tres arrays.
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        //Imprimimos las tres columnas (numero, cuadrado y cubo).
        System.out.println("Num  Num²  Num³");
        //Usamos un bucle for para almacenar 20 números aleatorios en el array. Además almacenamos en cuadrado y cubo los cuadrados y cubos.
        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random() * 100) + 1;
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
            
            //Imprimimos en columnas.
            System.out.println(numero[i] + ",  " + cuadrado[i] + ",  " + cubo[i]);
        }
    }
}
