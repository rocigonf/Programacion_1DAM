//5. Escribe un programa que determine si el n�mero introducido termina en 0 (positivo o negativo)

Algoritmo Comprobar_acaba_0
	Escribir "Escribe un n�mero:"
	Leer num
	Si num MOD 10 = 0 Entonces
		Escribir "El n�mero ", num, " s� acaba en 0."
	SiNo
		Escribir "El n�mero ", num, " no acaba en 0."
	Fin Si
FinAlgoritmo
