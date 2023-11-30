/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
 * 1). Para convertir un número en una cadena de caracteres podemos usar
 * String.valueOf(n).
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio2U6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Voy a mostrar al azar el nombre de una carta de la baraja francesa: ");

        //Inicializamos las variables String sin ningún contenido.
        String palo = "", carta = "";

        //Inicializamos las variables que contienen a los números aleatorios; numPalo es del 1 al 4 y numCarta es del 1 al 13.
        int numPalo = (int)(Math.random()*4)+1;
        int numCarta = (int)(Math.random()*13)+1;

        //Utilizamos 2 switches para clasificar los números aleatorios según el resultado.
        switch (numPalo) {
            case 1:
            palo = "picas";
                break;
            case 2:
            palo = "corazones";
                break;
            case 3:
            palo = "diamantes";
                break;
            case 4:
            palo = "tréboles";
                break;
            default:
                break;
        }

        switch (numCarta) {
            case 1:
                carta = "As";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
            //Convertimos los números del 2 al 10 en String y se almacena en la variable carta.
            //Así optimizamos el código del switch evitando poner los case para cada uno de los números.
            carta = String.valueOf(numCarta);
                break;
        }
        
        //Imprimimos el resultado por pantalla.
        System.out.println(carta + " de " + palo);
    }
}
