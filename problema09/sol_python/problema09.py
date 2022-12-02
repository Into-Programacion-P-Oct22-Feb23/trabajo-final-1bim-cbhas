mensaje = str("")
opcion = float()
tablaPositiva = float(12)
tablaNegativa = float(11)
contador = float(1)
termino1 = float(0)
termino2 = float(0)

opcion = float(input("Ingrese el valor de términos que quiere calcular\n "))

while (contador <= opcion):
    if (contador % 2 == 0):
        termino1 = termino1 + tablaNegativa
        mensaje = (f"{mensaje} -{termino1:.0f}")

    else:
        termino2 = termino2 + tablaPositiva
        mensaje = (f"{mensaje} +{termino2:.0f}")

    contador = contador + 1

print("S1 = " + mensaje + "\n")