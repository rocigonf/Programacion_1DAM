//3. Escribe un programa que determine si el n�mero introducido tiene 3 d�gitos o no.
Algoritmo Comprobar_numero_3dig
	Escribir "Escribe un n�mero"
	Leer num1
	Si num1>=100 Y num1<=999 O num1<=-100 Y num1>=-999 Entonces
		Escribir "El n�mero ",num1, " tiene 3 d�gitos."
	SiNo
		Escribir "El n�mero ",num1, " no tiene 3 d�gitos."
	Fin Si
FinAlgoritmo
