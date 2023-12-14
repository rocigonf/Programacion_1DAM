/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
 * entre 1 y 40 caracteres.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio10U6 {
    public static void main(String[] args) throws Exception {
        //Inicializamos los caracteres.
        char asterisco = '*';
        char guion = '-';
        char igual = '=';
        char punto = '.';
        char barra = '|';
        char arroba = '@';

        //Éste primer for es para pintar las diez líneas.
        for (int i = 0; i < 10; i++) {

            //Generamos números aleatorios para los símbolos y la longitud de las líneas correspondientemente.
            int numAleatorio = (int)(Math.random()*6)+1;
            int longitudLinea = (int)(Math.random()*40)+1;
            
            //En este switch se pintará cada línea con su longitud correspondiente según el número aleatorio (símbolo) generado.
            switch (numAleatorio) {
                //Caso asterisco.
                case 1:
                    for (int j = 0; j < longitudLinea; j++) {
                        System.out.print(asterisco);
                    }
                    System.out.println(" ");
                    break;
                //Caso guión.
                case 2:
                    for (int j = 0; j < longitudLinea; j++) {
                        System.out.print(guion);
                    }
                    System.out.println(" ");
                    break;
                //Caso igual.
                case 3:
                    for (int j = 0; j < longitudLinea; j++) {
                        System.out.print(igual);
                    }
                    System.out.println(" ");
                    break;
                //Caso punto.
                case 4:
                    for (int j = 0; j < longitudLinea; j++) {
                        System.out.print(punto);
                    }
                    System.out.println(" ");
                    break;
                //Caso barra.
                case 5:
                    for (int j = 0; j < longitudLinea; j++) {
                        System.out.print(barra);
                    }
                    System.out.println(" ");
                    break;
                //Caso arroba.
                case 6:
                    for (int j = 0; j < longitudLinea; j++) {
                        System.out.print(arroba);
                    }
                    System.out.println(" ");
                    break;
                default:
                    break;
            }
        }
    }
}
