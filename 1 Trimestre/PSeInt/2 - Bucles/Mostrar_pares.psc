//1. Escribe un programa que muestre en pantalla los n primeros n�meros pares. Solicitar el valor de n por pantalla.
Algoritmo Mostrar_pares
	Escribir "Voy a escribir n�meros pares. �Cu�ntos quieres?"
	Leer n
	//Le resto 1 a n porque en la ejecuci�n, por alguna raz�n siempre muestra uno de m�s.
	n<-n-1
	pares<-0
	Para i<-0 Hasta n Con Paso 1 Hacer
		pares<-pares+2
		Si pares MOD 2 == 0 Entonces
			Escribir pares
		FinSi
	Fin Para
FinAlgoritmo