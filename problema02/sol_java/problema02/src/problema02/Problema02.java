/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cantidad;
        double precioU;
        double subtotal; 
        double descuento = 0;
        double total;

        System.out.println("Ingrese la cantidad de trajes que va a comprar: ");
        cantidad = entrada.nextInt();

        System.out.println("Ingrese el precio unitario del traje: ");
        precioU = entrada.nextDouble();

        subtotal = cantidad * precioU;

        if (cantidad == 1) {
            descuento = 20;
        }

        if (cantidad == 2) {
            descuento = 25;
        }
        
        if (cantidad == 3) {
            descuento = 40;
        }
        
        if (cantidad > 3) {
            descuento = 50;
        }
        
        descuento = (subtotal * descuento) / 100;
        total = subtotal - descuento;
        
        System.out.printf("Subtotal: %.2f\nDescuento: %.2f\nTotal: %.2f\n"
                ,subtotal
                ,descuento
                ,total);

    }

}