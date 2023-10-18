//5. Escribe los n primeros números de la sucesión de Fibonacci. (1 1 2 3 5 8 13 ?) 
//Tendrás que solicitar cuántos números de la sucesión de Fibonacci se quieren mostrar.

Algoritmo Sucesion_Fibonacci
	Escribir "Dime cuántos números de la sucesión de Fibonacci quieres que escriba: "
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
