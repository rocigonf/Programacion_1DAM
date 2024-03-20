import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ej4U11 {
    public static void main(String[] args) throws Exception {

        //Argumentos
        if (args.length != 1) {
            System.out.println("Uso del programa: java Ej4U11 FICHERO");
            System.exit(-1);
        }
        try {
            //Se lee el archivo (lista de palabras desordenadas).
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            //Creamos variables para determinar la posición en el nombre del nuevo archivo añadiendo "_sort" al final.
            int length = args[0].length();
            String nombre = args[0].substring(0, length - 4);
            String extension = args[0].substring(length - 4, length);
            //Creamos el archivo nuevo y un ArrayList para almacenar y ordenar las palabras.
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort" + extension));
            List<String> listaPalabras = new ArrayList<String>();
            String linea = "";

            //Se almacenan las palabras sin ordenar en el ArrayList.
            while (linea != null) {
                listaPalabras.add(linea);
                linea = br.readLine();
            }

            //Se ordenan las palabras en la lista y se escriben en el archivo nuevo.
            listaPalabras.remove(0); //Se borra la primera posición porque es un espacio en blanco.
            Collections.sort(listaPalabras);
            for(String str: listaPalabras) {
                bw.write(str + "\n");
            }

            br.close();
            bw.close();

            //Sale un mensaje de fichero creado con éxito.
            System.out.println("El nuevo archivo ha sido creado satisfactoriamente.");

        //Si hay un error al compilar, se imprimirá este mensaje junto al error correspondiente.
        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}
