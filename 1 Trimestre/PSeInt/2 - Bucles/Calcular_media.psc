//4. Realice un programa que solicite n�meros y muestre el valor medio de los mismos. Tendr�s que pedir cu�ntos n�meros se van a 
//introducir para acto seguido ir solicitando los valores. Una vez le�dos todos los valores debes mostrar el resultado
//de la media de los valores. Media = Suma de los valores dividido entre el n�mero de valores.

Algoritmo Calcular_media
	Escribir "Dime n�meros y calcular� la media de todos."
	Escribir "�Cu�ntos n�meros vas a decir?"
	Leer cantidad
	
	//Comentario post correción: En lugar de restarle a 'cantidad' una unidad, puedes comenzar el bucle PARA en 1 (en lugar de 0) y te ahorras una operaci�n.
	cantidad<-cantidad-1
	Para i<-0 Hasta cantidad Con Paso 1 Hacer
		Escribir "Introduce un n�mero:"
		Leer num
		suma<-suma+num
	Fin Para
	media<-(suma / i)
	Escribir "La media de los n�meros introducidos es: ",media
FinAlgoritmo
