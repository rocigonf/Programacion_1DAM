//5. Escribe un programa que determine si el número introducido termina en 0 (positivo o negativo)

Algoritmo Comprobar_acaba_0
	Escribir "Escribe un número:"
	Leer num
	Si num MOD 10 = 0 Entonces
		Escribir "El número ", num, " sí acaba en 0."
	SiNo
		Escribir "El número ", num, " no acaba en 0."
	Fin Si
FinAlgoritmo
