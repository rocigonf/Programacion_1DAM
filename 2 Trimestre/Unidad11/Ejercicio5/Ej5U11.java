import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa capaz de quitar los comentarios de un programa de Java.
 * Se utilizaría de la siguiente manera:
 * quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero
 * sin los comentarios.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ej5U11 {
    public static void main(String[] args) {

        //Argumentos
        if (args.length != 2) {
            System.out.println("Uso del programa: java Ej5U11 FICHERO_ANTIGUO FICHERO_NUEVO");
            System.exit(-1);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            FileWriter newFile = new FileWriter(args[1]);
            BufferedWriter bw = new BufferedWriter(newFile);

            //EJERCICIO INCOMPLETO
            //EJERCICIO INCOMPLETO
            //EJERCICIO INCOMPLETO

            br.close();
            bw.close();
            //Sale un mensaje de fichero creado con éxito.
            System.out.println("Se han eliminado los comentarios correctamente. Comprueba el nuevo archivo.");
        //Si hay un error al compilar, se imprimirá este mensaje junto al error correspondiente.
        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}
