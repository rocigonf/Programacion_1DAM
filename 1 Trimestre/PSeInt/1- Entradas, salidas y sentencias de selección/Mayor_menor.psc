//9. Escribe un programa que pida 3 números y los muestre de menor a mayor.
Algoritmo Mayor_menor
	Escribir "Dime tres números y te los mostraré de menor a mayor."
	Escribir "Primer número:"
	Leer num1
	Escribir "Segundo número:"
	Leer num2
	Escribir "Tercer número:"
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
