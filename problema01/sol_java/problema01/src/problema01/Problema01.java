/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        entrada.useLocale(Locale.US);

        double ladoA;
        double ladoB;
        double ladoC;
        double total;

        System.out.println("Ingrese el valor de A: ");
        ladoA = entrada.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        ladoB = entrada.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        ladoC = entrada.nextDouble();

        total = ladoA + ladoB + ladoC;

        if (total == 180) {

            if (ladoA == 90 || ladoB == 90 || ladoC == 90) {
                System.out.println("Es un triángulo rectángulo");

            }
            if (ladoA > 90 || ladoB > 90 || ladoC > 90) {
                System.out.println("Es un triángulo obtusángulo");

            }
            if (ladoA < 90 && ladoB < 90 && ladoC < 90) {
                System.out.println("Es un triángulo acutángulo");

            }
        } else {

            System.out.println("Error, la suma de los ángulos de un "
                    + "triángulo siempre da 180 grados, pero la suma de los"
                    + " ángulos ingresados es " + total);
        }
    }
}