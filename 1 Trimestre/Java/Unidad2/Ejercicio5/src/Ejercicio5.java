public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
    //Declaro la variable pesetas con la cantidad que deseo convertir.
	int pesetas = 6000000;
	
	//Una peseta equivale a 0,0060 euros.
	double euros = 0.0060;
	
	System.out.println(pesetas + " pesetas equivalen a " + (pesetas * euros) + " euros");
    }
}
