/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una variable.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 * 
 */
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {

        //Declaramos las variables de la base imponible y el IVA (21%).
        int baseImp = 657;
        double IVA = 1.21;

        //Sin casting.
		double decimales = baseImp * IVA;
		
		//Con casting.
		int total;
		total = (int) (baseImp * IVA);
		
		System.out.println("El precio sin IVA es de " + baseImp + " euros y el precio con IVA es de " + total + " euros");
		System.out.println("Sin casting el resultado total es de " + decimales + " euros");
    }
}
