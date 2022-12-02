
cantidad = int()  
precioU = float()   
subtotal = float()
descuento = float()
total   = float()

cantidad = int(input("Ingrese la cantidad de trajes que va a comprar: "))
precioU = float(input("Ingrese el precio unitario del traje: "))

subtotal = cantidad * precioU

if cantidad == 1:
    descuento = 20

if cantidad == 2:
    descuento = 25

if cantidad == 3:
    descuento = 40 

if cantidad > 3:
    descuento = 50
 
descuento = (subtotal * descuento) / 100
total = subtotal - descuento

print(f"Subtotal:{subtotal}\nDescuento: {descuento}\nTotal:{total}\n")