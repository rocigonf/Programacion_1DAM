//10. Escribe un programa que determine si un número es primo o no. Un número es primo si solo tiene dos divisores: 1 y el mismo.

Algoritmo Es_Primo
	Escribir "Introduce un número y te diré si es primo o no: "
	Leer num
	Si num==1 Entonces
		Escribir "El número introducido no es primo." //Porque solo tiene un divisor.
	SiNo 
		primo<- Verdadero
		Para i<-2 Hasta num / 2 Hacer
			Si num MOD i = 0 Entonces
				primo<- Falso
			FinSi
		Fin Para
		Si primo = Verdadero Entonces
			Escribir "El número ",num," es primo."
		SiNo
			Escribir "El número ",num," no es primo."
		FinSi
	FinSi
FinAlgoritmo
