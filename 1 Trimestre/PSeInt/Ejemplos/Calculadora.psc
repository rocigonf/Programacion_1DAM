//Funciones matem�ticas
Funcion resultado <- suma ( sumando1, sumando2 )
	resultado<-sumando1 + sumando2
Fin Funcion
Funcion resultado <- resta ( minuendo, sustraendo )
	resultado<-minuendo - sustraendo
Fin Funcion
Funcion resultado <- multiplicacion ( multiplicando, multiplicador )
	resultado<-multiplicando * multiplicador
Fin Funcion
Funcion resultado <- division (dividendo, divisor)
	resultado<-dividendo / divisor
FinFuncion
//Comienza programa
Algoritmo Calculadora
	Escribir "Bienvenido a mi calculadora"
	Repetir
		Escribir "Elige una opci�n:"
		Escribir "1- Suma"
		Escribir "2- Resta"
		Escribir "3- Multiplicaci�n"
		Escribir "4- Divisi�n"
		Leer menu_num
		
		Segun menu_num Hacer
			1:
				Escribir "Introduce el primer sumando"
				Leer num1
				Escribir "Introduce el segundo sumando"
				Leer num2
				resultado<-suma(num1,num2)
				Escribir "La suma de ",num1, " y ",num2, " es ", resultado
			2:
				Escribir "Introduce el minuendo"
				Leer num1
				Escribir "Introduce el sustraendo"
				Leer num2
				resultado<-resta(num1,num2)
				Escribir "La resta de ",num1, " menos ",num2, " es ", resultado
			3:
				Escribir "Introduce el primer n�mero"
				Leer num1
				Escribir "Introduce el segundo n�mero"
				Leer num2
				resultado<-multiplicacion(num1,num2)
				Escribir "La multiplicaci�n de ",num1, " por ",num2, " es ", resultado
			4:
				Escribir "Introduce el dividendo"
				Leer num1
				Escribir "Introduce el divisor"
				Leer num2
				resultado<-division(num1,num2)
				Escribir "La divisi�n de ",num1, " entre ",num2, " es ", resultado
			De Otro Modo:
				Escribir "Ha introducido una opci�n incorrecta."
	Fin Segun
	Hasta Que menu_num>=1 Y menu_num<=4
	
FinAlgoritmo
