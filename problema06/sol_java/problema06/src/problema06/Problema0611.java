/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema06;

/**
 *
 * @author cbhas y bleaitenti
 */
public class Problema0611 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double contador = 3;
        double acumuladora = 1;

        do {
            acumuladora = acumuladora + 1 / contador;
            contador = contador + 2;

        } while (contador <= 100);

        System.out.printf("La suma total es:\t\n %f\n", acumuladora);

    }

}
