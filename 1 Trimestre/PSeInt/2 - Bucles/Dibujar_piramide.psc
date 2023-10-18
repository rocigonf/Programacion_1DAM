//7. Escribe un programa que dibuje una pirámide de altura N. Tendrás que solicitar la altura de la pirámide 
// y luego debes pintarla de la siguiente manera:

Algoritmo Dibujar_piramide
	Escribir "Voy a dibujar una pirámide con asteriscos. Dime la altura que quieres que tenga."
	Leer altura
	base<-1
	fila<-1
	espacio<-altura-1
	Mientras base<=altura Hacer
		Para i<-1 Hasta espacio Con Paso 1 Hacer
			Escribir " " Sin Saltar
		FinPara
		Para i<-1 Hasta fila Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		Escribir " "
		base<-base+1
		espacio<-espacio-1
		fila<-fila+2
	Fin Mientras
FinAlgoritmo