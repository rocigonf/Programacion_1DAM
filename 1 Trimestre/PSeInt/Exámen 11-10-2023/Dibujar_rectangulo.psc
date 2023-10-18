Algoritmo Dibujar_rectangulo
	Definir num_menu, altura, base Como Real
	altura<-0
	base<-0
	Mientras num_menu <> 5 Hacer
		Escribir "--------------------------Men�--------------------------"
		Escribir "      Seleccione una de las siguientes opciones.      "
		Escribir " 1. Introduzca la dimensi�n de la base del rect�ngulo."
		Escribir " 2. Introduzca la dimensi�n de la altura del rect�ngulo."
		Escribir " 3. Pinta el rect�ngulo."
		Escribir " 4. Intercambia base por altura."
		Escribir " 5. Salir"
		Escribir "--------------------------------------------------------"
		Leer num_menu
		Segun num_menu Hacer
			1:
				//Pedimos la base del rect�ngulo.
				Escribir "Introduce la base del rect�ngulo: "
				Leer base
			2:
				//Pedimos la altura del rect�ngulo.
				Escribir "Introduce la altura del rect�ngulo: "
				Leer altura
			3:
				//Dibujamos el rect�ngulo. Las variables que por defecto ser�an i y j, las he llamado fila y columna para que est� m�s claro.
				Para fila <- 1 Hasta altura Con Paso 1 Hacer
                    Para columna <- 1 Hasta base Con Paso 1 Hacer
                        Si fila = 1 O fila = altura O columna = 1 O columna = base Entonces
                            Escribir Sin Saltar "* "
						SiNo
                            Escribir Sin Saltar "  "
                        Fin Si
                    Fin Para
                    Escribir " "
                Fin Para
			4:
				//Lo mismo que el 3, pero intercambiando la base y la altura del rect�ngulo.
				Para fila <- 1 Hasta base Con Paso 1 Hacer
                    Para columna <- 1 Hasta altura Con Paso 1 Hacer
                        Si fila = 1 O fila = base O columna = 1 O columna = altura Entonces
                            Escribir Sin Saltar "* "
						SiNo
                            Escribir Sin Saltar "  "
                        Fin Si
                    Fin Para
                    Escribir " "
                Fin Para
			5:
				Escribir "Fin del programa."
			De Otro Modo:
				Escribir "N�mero err�neo."
		Fin Segun
	FinMientras
FinAlgoritmo
