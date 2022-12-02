package problema04;

import java.util.Locale;
import java.util.Scanner;

public class Problema04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double num1;
        double num2;
        double num3;
        double mayor = 0;

        System.out.println("Ingrese el primer número: ");
        num1 = entrada.nextDouble();

        System.out.println("Ingrese el segundo  número: ");
        num2 = entrada.nextDouble();

        System.out.println("Ingrese el tercer  número: ");
        num3 = entrada.nextDouble();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Error, los valores están repetidos");

        } else {
            if (num1 > num2 && num1 > num3) {
                mayor = num1;
            }

            if (num2 > num1 && num2 > num3) {
                mayor = num2;
            }

            if (num3 > num1 && num3 > num2) {
                mayor = num3;
            }

            System.out.println("El número más alto, entre los tres es: "
                    + mayor);
        }

    }

}
