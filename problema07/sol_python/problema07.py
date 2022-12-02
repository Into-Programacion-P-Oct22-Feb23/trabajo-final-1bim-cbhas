numero = int()
suma = int()

numero = int(input("Ingrese el número: "))

if numero % 2 == 0:
    if numero >= 2:
        while numero != 0:
            suma = suma + numero
            numero = numero - 2

        print(suma)
    else:
         print("Su número es menor a 2, por lo tanto no se puede realizar la operación")
    
else:
    print("Tu número no es par")