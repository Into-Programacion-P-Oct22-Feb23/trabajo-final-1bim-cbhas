/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombreEmpleado;
        int tipoEmpleado;
        double horasTrabajadas;
        double cuotaHora;
        double multiplicador = 0;
        double subtotal;
        double total;

        System.out.println("Ingrese el nombre el nombre del empleado:");
        nombreEmpleado = entrada.nextLine();

        System.out.println("Ingrese el número de horas trabajadas:");
        horasTrabajadas = entrada.nextDouble();

        System.out.println("Ingrese la cuota por hora::");
        cuotaHora = entrada.nextDouble();

        if (horasTrabajadas > 40) {
            subtotal = cuotaHora * 40;
            System.out.println("Ingrese el tipo de empleado:");
            tipoEmpleado = entrada.nextInt();
            horasTrabajadas = horasTrabajadas - 40;

            if (tipoEmpleado == 1) {
                multiplicador = 1.5;

            }

            if (tipoEmpleado == 2) {
                multiplicador = 2;
            }

            if (tipoEmpleado == 3) {
                multiplicador = 2.5;
            }

            if (tipoEmpleado == 4) {
                multiplicador = 3;
            }
            multiplicador = multiplicador * cuotaHora;
            multiplicador = horasTrabajadas * multiplicador;
            total = multiplicador + subtotal;

        } else {
            total = horasTrabajadas * cuotaHora;
        }
        System.out.printf("\n\nEl sueldo del empleado, %s, es $%.2f\n",
                nombreEmpleado,
                total);

    }

}
