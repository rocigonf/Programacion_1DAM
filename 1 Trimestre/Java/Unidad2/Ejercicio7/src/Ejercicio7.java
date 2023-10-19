public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        char a1 = 'B';
		char a2 = 'u';
		char a3 = 'e';
		char a4 = 'n';
        char a5 = 'a';
        char a6 = 's';
        char a7 = 't';
        char a8 = 'r';
        char a9 = 'd';
		
		String frase1 = ", ¿cómo estás?";
		
		
		//Imprimo el texto usando printf porque usando println no se pueden concatenar variables de tipo char ya que se suman.
		System.out.printf("%s%s%s%s%s%s %s%s%s%s%s%s", a1, a2, a3, a4, a5, a6, a7, a5, a8, a9, a3, a6 + frase1);
    }
}
