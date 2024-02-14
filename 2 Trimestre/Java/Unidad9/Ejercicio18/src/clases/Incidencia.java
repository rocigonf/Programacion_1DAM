package clases;

public class Incidencia {
    private int codigo;
    private String estado;
    private int puesto;
    private String problema;
    private String resolucion;
    private static int contCodigo = 1;
    private static int numPendientes = 0;

    public Incidencia(int puesto, String problema){
        this.puesto = puesto;
        this.problema = problema;
        this.estado = "Pendiente";
        this.codigo = contCodigo++;
        numPendientes++;
    }

    public void resuelve(String resolucion){
        this.resolucion = resolucion;
        this.estado = "Resuelto";
        numPendientes--;
    }

    public static int getPendientes(){
        return numPendientes;
    }

    //Incidencia 1 - Puesto: 105 - No tiene acceso a internet - Pendiente
    @Override
    public String toString(){
        return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - " + estado + (estado.equals("Resuelto") ? " - " + resolucion : ""); 
    }
}
