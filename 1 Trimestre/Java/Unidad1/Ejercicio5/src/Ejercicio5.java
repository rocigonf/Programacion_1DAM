package Unidad1.Ejercicio5.src;

public class Ejercicio5 {
    public static void main(String[] args) {
		String red = "\033[91m";
		String green = "\033[92m";
		String reset = "\033[39;49m";
		
        System.out.println("┌───────┬─────────┬─────────┬────────────┬─────────┬─────────┐");
		System.out.println("│       │  Lunes  │  Martes │  Miércoles │  Jueves │ Viernes │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ 15:15 │   " + green +"Nada" + reset + "  │   " + green + "Nada" + reset + "  │    " + green + "Nada" + reset + "    │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ 16:15 │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │    " + green + "Nada" + reset + "    │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ 17:15 │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │    " + red + "Prog" + reset + "    │   " + red + "Prog" + reset + "  │   " + red + "Prog" + reset + "  │");
		System.out.println("├───────┼─────────┴─────────┴────────────┴─────────┴─────────┤");
		System.out.println("│ 18:15 │                      DESCANSO                      │");
		System.out.println("├───────┼─────────┬─────────┬────────────┬─────────┬─────────┤");
		System.out.println("│ 18:30 │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │    " + red + "Prog" + reset + "    │   " + red + "Prog" + reset + "  │   " + red + "Prog" + reset + "  │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ 19:30 │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │    " + red + "Prog" + reset + "    │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │");
		System.out.println("├───────┼─────────┼─────────┼────────────┼─────────┼─────────┤");
		System.out.println("│ 20:30 │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │    " + red + "Prog" + reset + "    │   " + green + "Nada" + reset + "  │   " + green + "Nada" + reset + "  │");
		System.out.println("└───────┴─────────┴─────────┴────────────┴─────────┴─────────┘");
    }
}
