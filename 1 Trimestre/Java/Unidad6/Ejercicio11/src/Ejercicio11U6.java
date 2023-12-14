/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author Rocío Alejandra Gonfaus Luengo 2023
*/
public class Ejercicio11U6 {
    public static void main(String[] args) throws Exception {
        int suspensos = 0, suficientes = 0, bienes = 0, notables = 0, sobresalientes = 0;
        for (int i = 0; i < 20; i++) {
            int notaAleatoria = (int)(Math.random()*10)+1;
            switch (notaAleatoria) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Suspenso ");
                    suspensos++;
                    break;
                case 5:
                    System.out.print("Suficiente ");
                    suficientes++;
                    break;
                case 6:
                    System.out.print("Bien ");
                    bienes++;
                    break;
                case 7:
                case 8:
                    System.out.print("Notable ");
                    notables++;
                    break;
                case 9:
                case 10:
                    System.out.print("Sobresaliente ");
                    sobresalientes++;
                    break;
                default:
                    break;
            }
        }
        System.out.println(" ");
        System.out.println("Nº Suspensos = " + suspensos);
        System.out.println("Nº Suficientes = " + suficientes);
        System.out.println("Nº Bienes = " + bienes);
        System.out.println("Nº Notables = " + notables);
        System.out.println("Nº Sobresalientes = " + sobresalientes);
    }
}
