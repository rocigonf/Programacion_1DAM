//1. 11. Escribe un programa que calcule el precio total de la compra de zapatos para una tienda que tiene una promoción de
//descuento para vender al por mayor, esta dependerá del número de zapatos que se compren. Si son más de diez, se les dará un 
//10% de descuento sobre el total de la compra; si el número de zapatos es mayor de veinte pero menor de treinta, se le otorga 
//un 20% de descuento; y si son más treinta zapatos se otorgará un 40% de descuento. El precio de cada zapato es de 80 euros.

//+10 zapatos = 10%
//20>zapatos<30 = 20%
//+30 zapatos = 40%
//Zapatos = 80?

Algoritmo Compra_zapatos
	Escribir "Calculadora del precio total de zapatos. A partir de 11 zapatos se le aplicará un descuento."
	Escribir "Introduce el número de zapatos a comprar."
	Leer num_zapatos
	precio<-num_zapatos*80
	Si num_zapatos>10 Y num_zapatos<=20 Entonces
		descuento<-precio*0.1
		Escribir "Le corresponde un 10% de descuento."
		Escribir "El precio total es de: ", descuento+precio
	SiNo 
		Si num_zapatos>20 Y num_zapatos<=30 Entonces
			descuento<-precio*0.2
			Escribir "Le corresponde un 20% de descuento."
			Escribir "El precio total es de: ", descuento+precio
		SiNo
			Si num_zapatos>30 Entonces
				descuento<-precio*0.4
				Escribir "Le corresponde un 40% de descuento."
				Escribir "El precio total es de: ", descuento+precio
			FinSi
		FinSi
	FinSi
FinAlgoritmo
