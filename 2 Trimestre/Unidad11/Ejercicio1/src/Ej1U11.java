import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ej1U11 {

    //Creamos la función esPrimo() utilizando la variable numIntroducido.
    public static boolean esPrimo(int numIntroducido){
        //Creamos la variable booleana "esPrimo", la cual por defecto es verdadera.
        boolean esPrimo = true;
        for (int i = 2; i < numIntroducido; i++) {
            if ((numIntroducido % i) == 0) {
                //Si no es primo, la variable esPrimo cambia a "false".
                esPrimo = false;
            }
        }
        return esPrimo;
    }

//MAIN
    public static void main(String[] args) {
        try {
            //Creamos un archivo nuevo.
            /*Si necesitamos que el archivo esté en una ruta específica podemos utilizar: 
             * FileWriter file = new FileWriter("ruta\\primos.dat");
             * BufferedWriter bw = new BufferedWriter(file);*/
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            
            //Usando la funcion esPrimo, se comprueban los números del 1 al 500 uno a uno dentro de un bucle y se van almacenando.
            for (int i = 1; i < 501; i++) {
                if (esPrimo(i) == true) {
                    bw.write(i + "\n");
                }
            }
            //Se cierra el BufferedWriter para asegurar que se guarde el archivo.
            bw.close();

            //Sale un mensaje de fichero creado con éxito.
            System.out.println("Archivo primos.dat creado con éxito.");

        //Si hay un error al compilar, se imprimirá este mensaje.
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
            System.err.println(ioe.getMessage());
        }
    }
}