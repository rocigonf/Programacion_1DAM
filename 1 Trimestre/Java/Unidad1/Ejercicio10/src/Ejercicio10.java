public class Ejercicio10 {
    public static void main (String[] args) {
		
		String ROJO = "\u001B[31m";
		String BLANCO = "\u001B[37m";
		String NEGRO = "\033[90m";
		String RESET = "\u001B[0m";
		
		System.out.println(BLANCO + "■■■■■■■■■■■■■");
		System.out.println(BLANCO + "■■■" + NEGRO + "■■■" + BLANCO + "■" + NEGRO + "■■■" + BLANCO + "■" + BLANCO + "■■" + RESET);
		System.out.println(BLANCO + "■■" + NEGRO + "■" + ROJO + "■■■" + NEGRO + "■" + ROJO +  "■■■" + NEGRO + "■" + BLANCO + "■■" + RESET);
		System.out.println(BLANCO + "■■" + NEGRO + "■" + ROJO + "■■■■■■■" + NEGRO + "■" + BLANCO + "■■" + RESET);
		System.out.println(BLANCO + "■■■" + NEGRO + "■" + ROJO + "■■■■■" + NEGRO + "■" + BLANCO + "■■■" + RESET);
		System.out.println(BLANCO + "■■■■" + NEGRO + "■" + ROJO + "■■■" + NEGRO + "■" + BLANCO + "■■■■" + RESET);
		System.out.println(BLANCO + "■■■■■" + NEGRO + "■" + ROJO + "■" + NEGRO + "■" + BLANCO + "■■■■■" + RESET);
		System.out.println(BLANCO + "■■■■■■" + NEGRO + "■" + BLANCO + "■■■■■■" + NEGRO);
		System.out.println(BLANCO + "■■■■■■■■■■■■■");
	}
}
