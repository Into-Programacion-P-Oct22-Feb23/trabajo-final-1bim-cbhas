
yardas = float(0)
pulgadas = float(0)
pies = float(0) 

contador = 1
mensaje = ""
metros = int(input("Ingresa el número de metros: \n"))



while contador <= metros:
    yardas = contador * 1.094
    pulgadas = contador * 39.37
    pies = contador * 3.28
    mensaje = (f"{mensaje}{contador:.2f}\t{yardas:.2f}\t{pulgadas:.2f}\t  {pies:.2f}\n")
    contador = contador + 1
    
print("Metros\tYardas\tPulgadas  Pies")
print(mensaje)



