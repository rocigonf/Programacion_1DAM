//10. Escribe un programa que calcule el aumento al sueldo de un empleado; 
//si el sueldo es mayor a 500.000? su aumento será del 12%, pero si su sueldo es menor, el aumento será del 15%.
Algoritmo Calcular_sueldo
	Escribir "¿Cuál es tu sueldo?"
	Leer sueldo
	Si sueldo>500000 Entonces
		aumento<-(sueldo*0.12)
		Escribir "Te corresponde un aumento de ", aumento, " euros. El total del sueldo es de: ",aumento+sueldo
	SiNo
		aumento<-(sueldo*0.15)
		Escribir "Te corresponde un aumento de ", aumento, " euros. El total del sueldo es de: ",aumento+sueldo
	FinSi
FinAlgoritmo
