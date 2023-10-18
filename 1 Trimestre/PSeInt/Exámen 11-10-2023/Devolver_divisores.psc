Algoritmo Devolver_divisores
	Definir num, divisor, suma Como Real
	Escribir Sin Saltar "Introduce un número y te diré sus divisores: "
	Leer num
	divisor<-0
	suma<-0
	Escribir "Los divisores propios de ",num," son 1" Sin Saltar
	Para i<-1 Hasta num-1 Con Paso 1 Hacer
		divisor <- divisor + 1
		Si num MOD divisor == 0 Entonces
			suma <- suma + divisor
			Si divisor <> 1 Entonces
				Escribir Sin Saltar  ", ", divisor
			FinSi
		FinSi
	Fin Para
	Escribir " y la suma de los mismos es ", suma, "."
FinAlgoritmo
