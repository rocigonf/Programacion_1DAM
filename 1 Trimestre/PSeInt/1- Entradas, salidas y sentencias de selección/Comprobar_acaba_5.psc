//8. Escribe un programa que determine si el número introducido termina en 5 (positivo o negativo)

Algoritmo Comprobar_acaba_5
	Escribir "Escribe un número:"
		Leer num
		Si num MOD 5 = 0 Y num MOD 10 <> 0 Entonces
			Escribir "El número ", num, " sí acaba en 5."
		SiNo
			Escribir "El número ", num, " no acaba en 5."
		Fin Si
FinAlgoritmo
