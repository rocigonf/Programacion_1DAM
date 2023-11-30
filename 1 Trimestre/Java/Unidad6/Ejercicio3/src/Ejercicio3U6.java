/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio3U6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Voy a mostrar al azar el nombre de una carta de la baraja española: ");

        //Inicializamos las variables String sin ningún contenido.
        String palo = "", carta = "";

        //Inicializamos las variables que contienen a los números aleatorios; numPalo es del 1 al 4 y numCarta es del 1 al 13.
        int numPalo = (int)(Math.random()*4)+1;
        int numCarta = (int)(Math.random()*13)+1;

        //Utilizamos 2 switches para clasificar los números aleatorios según el resultado.
        switch (numPalo) {
            case 1:
            palo = "oros";
                break;
            case 2:
            palo = "copas";
                break;
            case 3:
            palo = "espadas";
                break;
            case 4:
            palo = "bastos";
                break;
            default:
                break;
        }
        switch (numCarta) {
            case 1:
                carta = "As";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
            //Convertimos los números del 2 al 7 en String y se almacena en la variable carta.
            //Así optimizamos el código del switch evitando poner los case para cada uno de los números.
            carta = String.valueOf(numCarta);
                break;
        }
        
        //Imprimimos el resultado por pantalla.
        System.out.println(carta + " de " + palo);
    }
}
