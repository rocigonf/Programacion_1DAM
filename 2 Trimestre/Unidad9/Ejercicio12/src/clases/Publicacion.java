package clases;

/**
 * Clase Publicacion.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Publicacion {
    
    //Atributos //////////
    private String isbn;
    private String titulo;
    private int añoPublicacion;

    public Publicacion(String i, String t, int a) {
        this.isbn = i;
        this.titulo = t;
        this.añoPublicacion = a;
    }

    @Override
    public String toString(){
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicación: " + añoPublicacion;
    }
}
