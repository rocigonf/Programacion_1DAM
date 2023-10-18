Funcion rombo_superior(altura)
    para fila <- 1 hasta altura Con Paso 1 Hacer
        Para espacios<-1 Hasta altura - fila Con Paso 1 Hacer
            escribir " " Sin Saltar
        Fin Para
        Para asteriscos<-1 Hasta 2 * fila - 1 Con Paso 1 Hacer
            Si asteriscos = 1 O asteriscos = 2 * fila - 1 Entonces
                escribir "*" Sin Saltar
            Sino
                escribir " " Sin Saltar
            Fin Si
        Fin Para
        escribir ""
    FinPara
Fin Funcion

Funcion rombo_inferior(altura)
    para fila <- altura-1 hasta 1 Con Paso -1 Hacer
        Para espacios<-1 Hasta altura - fila Con Paso 1 Hacer
            escribir " " Sin Saltar
        Fin Para
        Para asteriscos<-1 Hasta 2 * fila - 1 Con Paso 1 Hacer
            Si asteriscos = 1 O asteriscos = 2 * fila - 1 Entonces
                escribir "*" Sin Saltar
            Sino
                escribir " " Sin Saltar
            Fin Si
        Fin Para
        escribir ""
    FinPara
Fin Funcion

Algoritmo Dibujar_rombo_hueco
    Escribir "Dime la altura de medio rombo"
    Leer altura
    rombo_superior(altura)
    rombo_inferior(altura)
FinAlgoritmo