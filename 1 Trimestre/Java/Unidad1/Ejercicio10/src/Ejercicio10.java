public class Ejercicio10 {
    public static void main (String[] args) {
		
		String ROJO = "\u001B[31m";
		String BLANCO = "\u001B[37m";
		String RESET = "\u001B[0m";
		
		System.out.println(BLANCO + "■■■■■■■■■■■■■");
		System.out.println(BLANCO + "■■■" + ROJO + "■■■" + BLANCO + "■" + ROJO + "■■■" + BLANCO + "■" + BLANCO + "■■" + RESET);
		System.out.println(BLANCO + "■■" + ROJO + "■" + BLANCO + "■■■" + ROJO + "■" + BLANCO +  "■■■" + ROJO + "■" + BLANCO + "■■" + RESET);
		System.out.println(BLANCO + "■■" + ROJO + "■" + BLANCO + "■■■■■■■" + ROJO + "■" + BLANCO + "■■" + RESET);
		System.out.println(BLANCO + "■■■" + ROJO + "■" + BLANCO + "■■■■■" + ROJO + "■" + BLANCO + "■■■" + RESET);
		System.out.println(BLANCO + "■■■■" + ROJO + "■" + BLANCO + "■■■" + ROJO + "■" + BLANCO + "■■■■" + RESET);
		System.out.println(BLANCO + "■■■■■" + ROJO + "■" + BLANCO + "■" + ROJO + "■" + BLANCO + "■■■■■" + RESET);
		System.out.println(BLANCO + "■■■■■■" + ROJO + "■" + BLANCO + "■■■■■■" + ROJO);
		System.out.println(BLANCO + "■■■■■■■■■■■■■");
	}
}
