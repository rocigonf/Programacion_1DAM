//8. Escribe un programa igual que el anterior pero con la pirámide invertida.

Algoritmo Dibujar_piramide_invertida
    Escribir "Voy a dibujar una pirámide invertida con asteriscos. Dime la altura que quieres que tenga."
    Leer altura
    base <- 1
    fila <- altura * 2 - 1
    espacio <- 0
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
FinAlgoritmo