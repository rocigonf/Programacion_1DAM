/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere 
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio4U2 {
    public static void main(String[] args) throws Exception {
    
    //Declaro la variable euros con la cantidad que deseo convertir.
	int euros = 34;
	
	//Un euro equivale a 166,386 pesetas.
	double pesetas = 166.386;
	
	System.out.println(euros + " euros equivalen a " + (euros * pesetas) + " pesetas");
    }
}
