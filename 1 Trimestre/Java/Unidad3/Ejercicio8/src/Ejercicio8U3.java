/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
import java.util.Scanner;
public class Ejercicio8U3 {
    public static void main(String[] args) throws Exception {
        
        //Inicializamos el Scanner.
        Scanner dato = new Scanner(System.in);
        System.out.println("Calculadora de salario semanal. Introduzca el nº de horas trabajadas esta semana.");
        int horas = dato.nextInt();

        //Cerramos el Scanner para evitar errores de fugas de memoria.
        dato.close();

        int salario = horas * 12;

        System.out.println("El salario semanal para " + horas + " horas trabajadas es de " + salario + " euros.");
    }
}
