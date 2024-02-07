package clases;

/**
 * Clase Libro que extiende a Publicacion e implementa la interfaz Prestable.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Libro extends Publicacion implements Prestable{
    
    //Atributos //////////
    private boolean prestado = false;

    //Métodos //////////

    //Constructor
    public Libro(String i, String t, int a){
        super(i, t, a);
    }

    /**
     * Presta el libro en caso de que no esté ya prestado.
     */
    @Override
    public void presta() {
        if (this.prestado) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        } else{
            this.prestado = true;
        }
        
    }

    /**
     * Devuelve el libro.
     */
    @Override
    public void devuelve() {
        this.prestado = false;
        
    }

    /**
     * Devuelve true o false según si el libro está o no prestado.
     */
    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    /**
     * Método toString().
     * Devuelve "prestado" o "no prestado" después de los datos del libro según sea true o false.
     */
    @Override
    public String toString(){
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }
}
