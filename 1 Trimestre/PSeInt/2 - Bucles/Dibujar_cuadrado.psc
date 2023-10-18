//9. Escribe un programa que dibuje un cuadrado de altura N de la siguiente manera.

Algoritmo Dibujar_cuadrado
    Escribir "Voy a dibujar un cuadrado hueco de asteriscos. Introduce la altura que quieres que tenga:"
    Leer altura
    Para fila<-1 Hasta altura Hacer
        Para col<-1 Hasta altura Hacer
            Si fila=1 O fila=altura O col=1 O col=altura Entonces
                Escribir "* " Sin Saltar
            Sino
                Escribir "  " Sin Saltar
            Fin Si
        Fin Para
        Escribir " "
    Fin Para
FinAlgoritmo