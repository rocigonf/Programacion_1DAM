//6. Escribe un programa que calcule el factorial de un número. Tendrás que solicitar el número para acto seguido 
// mostrar el factorial del mismo. Factorial de n = (n)*(n-1)*(n-2)*...*(1)

Algoritmo Calcular_factorial
	Escribir "Escribe un número y te diré su factorial:"
	leer numfact
	factorial<-1
	num<-numfact
	Mientras numfact>0 Hacer
		factorial<-factorial*numfact
		numfact<-numfact-1
	Fin Mientras
	Escribir "El factorial de ",num, " es: ",factorial
FinAlgoritmo