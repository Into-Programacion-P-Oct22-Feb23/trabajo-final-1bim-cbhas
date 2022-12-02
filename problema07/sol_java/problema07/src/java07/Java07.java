package java07;

import java.util.Scanner;

public class Java07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese el número");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            if (numero >= 2) {

                while (numero != 0) {
                    suma = suma + numero;
                    numero = numero - 2;
                }
                System.out.println(suma);
            } else {

                System.out.println("Su número es menor a 2, por lo tanto no se puede realizar la operación");

            }

        } else {

            System.out.println("Tu número no es par");

        }
    }

}