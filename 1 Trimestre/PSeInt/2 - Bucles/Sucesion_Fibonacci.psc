//5. Escribe los n primeros n�meros de la sucesi�n de Fibonacci. (1 1 2 3 5 8 13 ?) 
//Tendr�s que solicitar cu�ntos n�meros de la sucesi�n de Fibonacci se quieren mostrar.

Algoritmo Sucesion_Fibonacci
	Escribir "Dime cu�ntos n�meros de la sucesi�n de Fibonacci quieres que escriba: "
	Leer num
	fib1<-1
	fib2<-1
	Para i<-1 Hasta num Hacer
		Escribir fib1
		fib3<-fib1+fib2
		fib1<-fib2
		fib2<-fib3
	FinPara
FinAlgoritmo
