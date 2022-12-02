package problema09;

import java.util.Locale;
import java.util.Scanner;

public class Problema09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String mensaje = "";
        double opcion;
        double tablaPositiva = 12;
        double tablaNegativa = 11;
        double contador = 1;
        double termino1 = 0;
        double termino2 = 0;

        System.out.println("Ingrese el valor de términos que quiere calcular");
        opcion = entrada.nextDouble();

        while (contador <= opcion) {

            if (contador % 2 == 0) {
                termino1 = termino1 + tablaNegativa;
                mensaje = String.format("%s -%.0f",
                        mensaje,
                        termino1);

            } else {
                termino2 = termino2 + tablaPositiva;
                mensaje = String.format("%s +%.0f",
                        mensaje,
                        termino2);
            }

            contador = contador + 1;

        }
        System.out.print("S1 = " + mensaje + "\n");
    }
}
