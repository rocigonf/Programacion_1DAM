//8. Escribe un programa que determine si el n�mero introducido termina en 5 (positivo o negativo)

Algoritmo Comprobar_acaba_5
	Escribir "Escribe un n�mero:"
		Leer num
		Si num MOD 5 = 0 Y num MOD 10 <> 0 Entonces
			Escribir "El n�mero ", num, " s� acaba en 5."
		SiNo
			Escribir "El n�mero ", num, " no acaba en 5."
		Fin Si
FinAlgoritmo
