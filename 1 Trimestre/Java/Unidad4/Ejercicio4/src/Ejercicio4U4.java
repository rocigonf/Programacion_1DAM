/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio4U4 {
    public static void main(String[] args) throws Exception {

        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);

        //Pedimos las horas trabajadas semanalmente por teclado.
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana");
        int horas = dato.nextInt();

        //Cerramos el Scanner para evitar errores de fuga de memoria.
        dato.close();

        int salario;

        //Se comprueba si el número es mayor o igual a 41 horas y se calcula el sueldo correspondiente.
        if (horas >=41){
            salario = horas * 16;
        } else{
            salario = horas * 12;
        }
        System.out.printf("El sueldo semanal que le corresponde es de %s euros.", salario);
    }
}
