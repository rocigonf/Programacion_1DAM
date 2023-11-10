/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio1U5 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 100; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
