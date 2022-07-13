package m1;

import java.util.Scanner;

public class CelsiusFarenheit {
    /**
     * Converte temperaturas de Celsius para Farenheit.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double temperaturaCelsius = 0d;
        Boolean entradaValida = false;

        System.out.println("\n###################### INÍCIO ######################\n");

        do {
            try {
                System.out.print("Insira um valor de temperatura em graus celsius (Ex.: 27.9): ");
                temperaturaCelsius = Double.parseDouble(sc.nextLine());
                entradaValida = true;
            } catch (Exception e) {
                System.err.println("Entrada incompaível com o esperado.");
            }
        } while (entradaValida != true);

        entradaValida = false;

        System.out.println("\n###################### Temperatura em Farenheit ######################\n");

        Double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.printf("A temperatura %.1f°C equivale a %.1f°F.\n", temperaturaCelsius, temperaturaFarenheit);

        sc.close();

        System.out.println("\n###################### FIM ######################\n");
    }
}
