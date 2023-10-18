Funcion rombo_superior(altura)
	base<-1
	fila<-1
	espacio<-altura-1
	Mientras base<=altura Hacer
		Para i<-1 Hasta espacio Con Paso 1 Hacer
			Escribir " " Sin Saltar
		FinPara
		Para i<-1 Hasta fila Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		Escribir " "
		base<-base+1
		espacio<-espacio-1
		fila<-fila+2
	Fin Mientras
FinFuncion

Funcion rombo_inferior(altura)
	altura <- altura - 1
    base <- 1
    fila <- altura * 2 - 1
    espacio <- 1
    Mientras base <= altura Hacer
        Para i <- 1 Hasta espacio Con Paso 1 Hacer
            Escribir " " Sin Saltar
        FinPara
        Para i <- 1 Hasta fila Con Paso 1 Hacer
            Escribir "*" Sin Saltar
        Fin Para
        Escribir " "
        base <- base + 1
        espacio <- espacio + 1
        fila <- fila - 2
    Fin Mientras
FinFuncion

Algoritmo Dibujar_Rombo
	Escribir "Introduce la altura de medio rombo: " Sin Saltar
	Leer altura
	rombo_superior(altura)
	rombo_inferior(altura)
FinAlgoritmo
