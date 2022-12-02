abcisa = float()
ordenada = float()
cuadrante = str("") 

abcisa = float(input("Ingrese el valor de x o de la abcisa: "))
ordenada = float(input("Ingrese el valor de y o de la ordenada: "))

if abcisa == 0   or ordenada == 0:
    print("La coordenada no se encuentra en ningun cuadrante ya que se encuentran en las coordenadas 0 de la línea y o de la línea x")

else:
    if abcisa > 0 and ordenada > 0:
        cuadrante = "Se encuentra en el primer cuadrante (+, +)"

    if abcisa < 0 and ordenada > 0:
        cuadrante = "Se encuentra en el primer cuadrante (-, +)"

    if abcisa < 0 and ordenada < 0:
        cuadrante = "Se encuentra en el primer cuadrante (-, -)"

    if abcisa > 0 and ordenada < 0:
        cuadrante = "Se encuentra en el primer cuadrante (+, -)"

    print(cuadrante)                 