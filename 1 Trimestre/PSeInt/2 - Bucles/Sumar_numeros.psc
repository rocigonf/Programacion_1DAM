//3. Escribe un programa que sume los n primeros n�meros. Tendr�s que solicitar cu�ntos n�meros habr� que sumar.

Algoritmo Sumar_numeros
		Escribir "Voy a sumar la cantidad de n�meros que me digas empezando por el 0. �Cu�ntos n�meros quieres que sume?"
		Leer n
		//Le resto 1 a n porque en la ejecuci�n, por alguna raz�n siempre muestra uno de m�s.
		suma<-0
		Para i<-0 Hasta n Con Paso 1 Hacer
			suma<-suma+i
		Fin Para
		Escribir "La suma de los ", n, " primeros n�meros es: ", suma
FinAlgoritmo