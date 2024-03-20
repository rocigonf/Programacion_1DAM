package clases;
/**
 * Clase Revista que extiende a Publicacion.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Revista extends Publicacion{

    //Atributos //////////
    //Suprimo el aviso de que la variable numRevista no está en uso.
    @SuppressWarnings("unused")
    private int numRevista;

    //Métodos //////////

    //Constructor
    public Revista(String i, String t, int a, int n) {
        super(i, t, a);
        this.numRevista = n;
    }
}
