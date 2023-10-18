Algoritmo Dibujar_rectangulo
	Definir num_menu, altura, base Como Real
	altura<-0
	base<-0
	Mientras num_menu <> 5 Hacer
		Escribir "--------------------------Menú--------------------------"
		Escribir "      Seleccione una de las siguientes opciones.      "
		Escribir " 1. Introduzca la dimensión de la base del rectángulo."
		Escribir " 2. Introduzca la dimensión de la altura del rectángulo."
		Escribir " 3. Pinta el rectángulo."
		Escribir " 4. Intercambia base por altura."
		Escribir " 5. Salir"
		Escribir "--------------------------------------------------------"
		Leer num_menu
		Segun num_menu Hacer
			1:
				//Pedimos la base del rectángulo.
				Escribir "Introduce la base del rectángulo: "
				Leer base
			2:
				//Pedimos la altura del rectángulo.
				Escribir "Introduce la altura del rectángulo: "
				Leer altura
			3:
				//Dibujamos el rectángulo. Las variables que por defecto serían i y j, las he llamado fila y columna para que esté más claro.
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
				//Lo mismo que el 3, pero intercambiando la base y la altura del rectángulo.
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
				Escribir "Número erróneo."
		Fin Segun
	FinMientras
FinAlgoritmo
