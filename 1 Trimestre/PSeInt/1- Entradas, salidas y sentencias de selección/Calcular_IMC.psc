//7. Escribe un programa que pida la altura y el peso y muestre el imc de esa persona.
Algoritmo Calcular_IMC
	Escribir "Esto es una calculadora del Índice de Masa Corporal (IMC)"
	Escribir "Introduce tu peso en kg:"
	Leer peso
	Escribir "Ahora introduce tu estatura en metros (ej. 150cm se escribiría: 1.50):"
	Leer estatura
	IMC<- peso/(estatura^2)
	Escribir "Tu IMC es ",IMC
FinAlgoritmo
