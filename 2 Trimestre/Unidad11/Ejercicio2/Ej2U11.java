import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ej2U11 {
    public static void main(String[] args) throws Exception {
        try {
            //Se lee el archivo "primos.dat" creado en el ejercicio anterior.
            BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
            String linea = "";

            //Imprime por pantalla cada línea.
            while (linea != null) {
                linea = br.readLine();
                System.out.println(linea);
            }

            br.close();
        //Si hay un error al compilar, se imprimirá este mensaje junto al error correspondiente.
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
            System.err.println(ioe.getMessage());
        }
    }
}
