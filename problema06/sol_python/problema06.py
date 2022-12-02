contador   = float(2)
acumulador = float(1)
	
while contador <= 100:
    acumulador = acumulador + 1/contador
    contador = contador + 1
    
print(acumulador)