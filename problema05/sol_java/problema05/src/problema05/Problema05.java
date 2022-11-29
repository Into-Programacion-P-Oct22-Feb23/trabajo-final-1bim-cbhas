/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double abcisa;
        double ordenada;
        String cuadrante = "";

        System.out.println("Ingrese el valor de x o de la abcisa");
        abcisa = entrada.nextDouble();

        System.out.println("Ingrese el valor de y o de la ordenada");
        ordenada = entrada.nextDouble();

        if (abcisa == 0 || ordenada == 0) {
            System.out.println("La coordenada no se encuentra en "
                    + "ningun cuadrante ya que se encuentran en las "
                    + "coordenadas 0 de la línea y o de la línea x");
        } else {
            if (abcisa > 0 && ordenada > 0) {
                cuadrante = "Se encuentra en el primer cuadrante (+, +)";
            }
            if (abcisa < 0 && ordenada > 0) {
                cuadrante = "Se encuentra en el segundo cuadrante (-, +)";
            }
            if (abcisa < 0 && ordenada < 0) {
                cuadrante = "Se encuentra en el tercer cuadrante (-, -)";
            }
            if (abcisa > 0 && ordenada < 0) {
                cuadrante = "Se encuentra en el cuadrante cuadrante (+, -)";
            }
            System.out.printf("%s", cuadrante);
        }

    }

}
