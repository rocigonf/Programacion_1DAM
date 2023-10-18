//4. Escribe un programa que pida 2 números e indique si el primero es múltiplo del segundo.
Algoritmo Comprobar_multiplo
	Escribir "Dame dos números y te diré si el primero es múltiplo del segundo."
	Escribir "Escribe el primero:"
	Leer num1
	Escribir "Ahora escribe el segundo:"
	Leer num2
	Si num1 MOD num2 == 0 Entonces
		Escribir "El número ",num1, " es múltiplo de ",num2
	SiNo
		Escribir "El número ",num1, " no es múltiplo de ",num2
	FinSi
FinAlgoritmo
