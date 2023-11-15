import java.util.Scanner;

/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 * 
 * @author Rocío Alejandra Gonfaus Luengo 2023
 */
public class Ejercicio10U4 {
    public static void main (String[] args) {
		
        //Inicializamos el Scanner.
		Scanner dato = new Scanner(System.in);
		
        //Pedimos los datos.
		System.out.print("Por favor, introduzca su mes de nacimiento: ");
		String mes = dato.nextLine();
		
		System.out.print("Ahora introduzca su día de nacimiento: ");
		int dia = dato.nextInt();

        //Cerramos el Scanner para evitar un error de fuga de memoria.
        dato.close();
		
		switch (mes.toLowerCase()) {
			case "enero":
				if ((dia >= 1) && (dia <= 19)) {
					System.out.println("Eres capricornio");
				} else if ((dia >= 20) && (dia <= 31)){
					System.out.println("Eres acuario");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "febrero":
				if ((dia >= 1) && (dia <= 18)) {
					System.out.println("Eres acuario");
				} else if ((dia >= 19) && (dia <= 31)){
					System.out.println("Eres piscis");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "marzo":		
				if ((dia >= 1) && (dia <= 20)) {
					System.out.println("Eres piscis");
				} else if ((dia >= 21) && (dia <= 31)){
					System.out.println("Eres aries");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "abril":
				if ((dia >= 1) && (dia <= 19)) {
					System.out.println("Eres aries");
				} else if ((dia >= 20) && (dia <= 31)){
					System.out.println("Eres tauro");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "mayo":
				if ((dia >= 1) && (dia <= 20)) {
					System.out.println("Eres tauro");
				} else if ((dia >= 21) && (dia <= 31)){
					System.out.println("Eres géminis");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "junio":
				if ((dia >= 1) && (dia <= 20)) {
					System.out.println("Eres géminis");
				} else if ((dia >= 21) && (dia <= 31)){
					System.out.println("Eres cáncer");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "julio":
				if ((dia >= 1) && (dia <= 22)) {
					System.out.println("Eres cáncer");
				} else if ((dia >= 23) && (dia <= 31)){
					System.out.println("Eres leo");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "agosto":
				if ((dia >= 1) && (dia <= 22)) {
					System.out.println("Eres leo");
				} else if ((dia >= 23) && (dia <= 31)){
					System.out.println("Eres virgo");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "septiembre":
				if ((dia >= 1) && (dia <= 22)) {
					System.out.println("Eres virgo");
				} else if ((dia >= 23) && (dia <= 31)){
					System.out.println("Eres libra");
				} else {
					System.out.println("Introduzca un día correcto");
				}
			break;
			case "octubre":
                if ((dia >= 1) && (dia <= 22)) {
                    System.out.println("Eres libra");
                } else if ((dia >= 23) && (dia <= 31)){
                    System.out.println("Eres escorpio");
                } else {
                    System.out.println("Introduzca un día correcto");
                }
			break;
			case "noviembre":
                if ((dia >= 1) && (dia <= 21)) {
                    System.out.println("Eres escorpio");
                } else if ((dia >= 22) && (dia <= 31)){
                    System.out.println("Eres sagitario");
                } else {
                    System.out.println("Introduzca un día correcto");
                }
			break;
			case "diciembre":
                if ((dia >= 1) && (dia <= 21)) {
                    System.out.println("Eres sagitario");
                } else if ((dia >= 22) && (dia <= 31)){
                    System.out.println("Eres capricornio");
                } else {
                    System.out.println("Introduzca un día correcto");
                }
			break;
			default:
				System.out.println("Mes inexistente.");
		}
		
	}
}
