/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio1U6 {
    public static void main(String[] args) throws Exception {
        double suma = 0;
        System.out.print("Voy a tirar tres dados: ");
        for (int i = 0; i < 3; i++) {
            double dados = Math.random()*6+1;
            System.out.printf("%.0f ", dados);
            suma += Math.round(dados);
        }
        System.out.printf("\nLa suma de los tres dados es: %.0f", suma);
    }
}
