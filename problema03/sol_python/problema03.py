nombreEmpleado = str()
tipoEmpleado = int()
horasTrabajadas = float()
cuotaHora = float()
multiplicador = float(0)
subtotal = float()
total = float()

nombreEmpleado = str(input("Ingrese el  nombre del empleado:"))
horasTrabajadas = float(input("Ingrese el número de horas trabajadas:"))
cuotaHora = float(input("Ingrese la cuota por hora:"))

if horasTrabajadas > 40:
    subtotal = cuotaHora * 40
    tipoEmpleado = int(input("Ingrese el tipo de empleado:"))
    horasTrabajadas = horasTrabajadas - 40

    if tipoEmpleado == 1:
        multiplicador = 1.5

    if tipoEmpleado == 2:
        multiplicador = 2        

    if  tipoEmpleado == 3:
        multiplicador = 2.5       

    if  tipoEmpleado == 4:
        multiplicador = 3       

    multiplicador = multiplicador * cuotaHora
    multiplicador = horasTrabajadas * multiplicador
    total = multiplicador + subtotal    

else:
    total = horasTrabajadas * cuotaHora

print(f"El sueldo del empleado: {nombreEmpleado} es de: $ {total}")