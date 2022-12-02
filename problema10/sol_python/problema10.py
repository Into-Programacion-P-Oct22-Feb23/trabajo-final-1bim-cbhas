contador = float(0)
datos = float()
sumaNumeros = float(0)
media = float()
opcion = str("")
bandera = bool(True)

while bandera:
    datos = int(input("Ingresa un número cualquiera: "))

    sumaNumeros = sumaNumeros + datos
    opcion = str(input("Digite s para dejar de introducir números: "))
    contador = contador + 1

    if opcion == "s":
        bandera = False
 
media = sumaNumeros/contador
print(f"La media de todos los números ingresados es: {media}")