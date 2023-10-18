//1. Escribe un programa que pida el nombre, los apellidos y el sexo y muestre en la salida: Bienvenido, Sr./Sra. "Nombre y apellidos"
Algoritmo Datos_persona
	Escribir "Por favor, introduzca su nombre."
	Leer nombre
	Escribir "A continuación introduzca sus apellidos."
	Leer apellidos
	Escribir "Ahora introduzca su género. (H o M)"
	Leer sexo
	Segun sexo Hacer
		"H":
			Escribir "Bienvenido, Sr. ",nombre," ",apellidos
		"M":
			Escribir "Bienvenida, Sra. ",nombre, " ",apellidos
		De Otro Modo:
			Escribir "No he entendido tu género."
	Fin Segun
FinAlgoritmo
