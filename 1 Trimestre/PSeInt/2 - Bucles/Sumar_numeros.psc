//3. Escribe un programa que sume los n primeros números. Tendrás que solicitar cuántos números habrá que sumar.

Algoritmo Sumar_numeros
		Escribir "Voy a sumar la cantidad de números que me digas empezando por el 0. ¿Cuántos números quieres que sume?"
		Leer n
		//Le resto 1 a n porque en la ejecución, por alguna razón siempre muestra uno de más.
		suma<-0
		Para i<-0 Hasta n Con Paso 1 Hacer
			suma<-suma+i
		Fin Para
		Escribir "La suma de los ", n, " primeros números es: ", suma
FinAlgoritmo