//9. Escribe un programa que pida 3 n�meros y los muestre de menor a mayor.
Algoritmo Mayor_menor
	Escribir "Dime tres n�meros y te los mostrar� de menor a mayor."
	Escribir "Primer n�mero:"
	Leer num1
	Escribir "Segundo n�mero:"
	Leer num2
	Escribir "Tercer n�mero:"
	Leer num3	
	Si num1>num2 Y num1>num3 Entonces
		Si num2>num3 Entonces
			Escribir "El orden de menor a mayor es: ", num3, " < ", num2, " < ", num1
		SiNo 
			Escribir "El orden de menor a mayor es: ", num2, " < ",num3, " < ", num1
		FinSi
	SiNo
		Si num2>num3 Entonces
			Escribir "El orden de menor a mayor es: ", num1, " < ", num3, " < ", num2
		SiNo
			Escribir "El orden de menor a mayor es: ", num1, " < ", num2, " < ", num3
		FinSi
	FinSi
FinAlgoritmo
