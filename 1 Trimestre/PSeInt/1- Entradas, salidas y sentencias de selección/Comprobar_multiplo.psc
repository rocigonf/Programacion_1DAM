//4. Escribe un programa que pida 2 n�meros e indique si el primero es m�ltiplo del segundo.
Algoritmo Comprobar_multiplo
	Escribir "Dame dos n�meros y te dir� si el primero es m�ltiplo del segundo."
	Escribir "Escribe el primero:"
	Leer num1
	Escribir "Ahora escribe el segundo:"
	Leer num2
	Si num1 MOD num2 == 0 Entonces
		Escribir "El n�mero ",num1, " es m�ltiplo de ",num2
	SiNo
		Escribir "El n�mero ",num1, " no es m�ltiplo de ",num2
	FinSi
FinAlgoritmo
