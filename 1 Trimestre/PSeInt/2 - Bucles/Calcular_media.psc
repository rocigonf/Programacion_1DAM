//4. Realice un programa que solicite números y muestre el valor medio de los mismos. Tendrás que pedir cuántos números se van a 
//introducir para acto seguido ir solicitando los valores. Una vez leídos todos los valores debes mostrar el resultado
//de la media de los valores. Media = Suma de los valores dividido entre el número de valores.

Algoritmo Calcular_media
	Escribir "Dime números y calcularé la media de todos."
	Escribir "¿Cuántos números vas a decir?"
	Leer cantidad
	cantidad<-cantidad-1
	Para i<-0 Hasta cantidad Con Paso 1 Hacer
		Escribir "Introduce un número:"
		Leer num
		suma<-suma+num
	Fin Para
	media<-(suma / i)
	Escribir "La media de los números introducidos es: ",media
FinAlgoritmo
