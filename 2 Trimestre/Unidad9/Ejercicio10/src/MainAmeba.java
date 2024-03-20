/**
 * Programa que prueba la clase Ameba.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
import clases.Ameba;
public class MainAmeba {
    public static void main(String[] args) throws Exception {
        Ameba a1 = new Ameba();
        a1.come(2);
        System.out.println(a1);
        Ameba a2 = new Ameba();
        a2.come(4);
        System.out.println(a2);
        a1.come(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.come(3);
        System.out.println(a2);
    }
}
