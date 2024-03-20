package clases;
/**
 * Clase Ameba.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2024
 */
public class Ameba {
    
    //Atributos //////////

    //Peso en microgramos.
    private int peso;

    //Métodos //////////

    //Constructor
    public Ameba (){
        this.peso = 3;
    }

    /**
     * Método para que la ameba coma.
     * Al comer, va incrementando su peso; gasta un microgramo 
     * en el proceso de fagocitar y el resto hace que aumente de peso.
     * @param comida peso de la comida que consume.
     */
    public void come(int comida){
        this.peso +=  comida - 1;
    }

    /**
     * Método para que la ameba coma a otra ameba.
     * Al ser comida una ameba, su peso pasa a ser 0 microgramos.
     * @param a
     */
    public void come(Ameba a){
        this.peso += a.peso - 1;
        a.peso = 0;
    }

    /**
     * Método toString().
     */
    public String toString(){
        return "Soy una ameba y peso " + peso + " microgramos.";
    }
}
