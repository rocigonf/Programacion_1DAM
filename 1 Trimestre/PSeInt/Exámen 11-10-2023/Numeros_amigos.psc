Algoritmo Numeros_amigos
	Definir num1, num2, divisor1, divisor2, suma1, suma2 Como Real
	Escribir "Introduzca un n�mero: " Sin Saltar
	Leer num1
	Escribir "Introduzca otro n�mero: " Sin Saltar
	Leer num2
	
	//Dividimos las variables en primeras y segundas para que el programa no se confunda.
	divisor1<-0
	divisor2<-0
	suma1<-0
	suma2<-0
	
	//Divisores del primer n�mero.
	Escribir "Los divisores propios de ",num1," son 1" Sin Saltar
	Para i<-1 Hasta num1-1 Con Paso 1 Hacer
		divisor1 <- divisor1 + 1
		Si num1 MOD divisor1 == 0 Entonces
			suma1 <- suma1 + divisor1
			Si divisor1 <> 1 Entonces
				Escribir Sin Saltar  ", ", divisor1
			FinSi 
		FinSi
	Fin Para
	Escribir " y la suma de los mismos es ", suma1, "."
	
	//Divisores del segundo n�mero.
	Escribir "Los divisores propios de ",num2," son 1" Sin Saltar
	Para i<-1 Hasta num2-1 Con Paso 1 Hacer
		divisor2 <- divisor2 + 1
		Si num2 MOD divisor2 == 0 Entonces
			suma2 <- suma2 + divisor2
			Si divisor2 <> 1 Entonces
				Escribir Sin Saltar  ", ", divisor2
			FinSi  
		FinSi
	Fin Para
	Escribir " y la suma de los mismos es ", suma2, "."
	
	//Comparamos los n�meros para saber si son amigos o no e imprimimos el resultado.
	Si suma1 = num2 O suma2 == num1 Entonces
		Escribir "Los dos n�meros S� son amigos."
	SiNo
		Escribir "Los dos n�meros NO son amigos."
	FinSi
FinAlgoritmo
