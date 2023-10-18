//3. Escribe un programa que determine si el número introducido tiene 3 dígitos o no.
Algoritmo Comprobar_numero_3dig
	Escribir "Escribe un número"
	Leer num1
	Si num1>=100 Y num1<=999 O num1<=-100 Y num1>=-999 Entonces
		Escribir "El número ",num1, " tiene 3 dígitos."
	SiNo
		Escribir "El número ",num1, " no tiene 3 dígitos."
	Fin Si
FinAlgoritmo
