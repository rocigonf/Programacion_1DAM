//7. Escribe un programa que dibuje una pir�mide de altura N. Tendr�s que solicitar la altura de la pir�mide 
// y luego debes pintarla de la siguiente manera:

Algoritmo Dibujar_piramide
	Escribir "Voy a dibujar una pir�mide con asteriscos. Dime la altura que quieres que tenga."
	Leer altura
	base<-1
	fila<-1
	espacio<-altura-1
	Mientras base<=altura Hacer
		Para i<-1 Hasta espacio Con Paso 1 Hacer
			Escribir " " Sin Saltar
		FinPara
		
		//Comentario post correción: �Se podr�a llamar 'fila', 'numAsteriscos' o similar?
		Para i<-1 Hasta fila Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		Escribir " "
		base<-base+1
		espacio<-espacio-1
		fila<-fila+2
	Fin Mientras
FinAlgoritmo