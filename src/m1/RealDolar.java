package m1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RealDolar {
    /**
     * Recebe a cotação do dólar do dia e, seguida recebe um valor em reais. A saída
     * é a quantia em dólares.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double cotacaoDolar = 0d, valorReais = 0d, valorDolares = 0d;
        Boolean entradaValida = false;
        Locale ptbr = new Locale("pt", "BR");

        System.out.println("\n###################### INÍCIO ######################\n");

        do {
            try {
                System.out.print("Insira a cotação do dólar para o dia (Ex.: 5.90): ");
                cotacaoDolar = Double.parseDouble(sc.nextLine());
                entradaValida = true;
            } catch (Exception e) {
                System.err.println("Entrada incompaível com o esperado.");
            }
        } while (entradaValida != true);

        entradaValida = false;

        do {
            try {
                System.out.print("Insira o valor em Reais para realizar a conversão (Ex.: 100.20): ");
                valorReais = Double.parseDouble(sc.nextLine());
                entradaValida = true;
            } catch (Exception e) {
                System.err.println("Entrada incompaível com o esperado.");
            }
        } while (entradaValida != true);

        entradaValida = false;

        System.out.println("\n###################### Conversão para Dólar ######################\n");

        valorDolares = valorReais / cotacaoDolar;

        System.out.printf("O valor de %s equivale a %s na cotação de %s-%s.\n", FormatacaoMonetaria(valorReais, ptbr),
                FormatacaoMonetaria(valorDolares, Locale.US), FormatacaoMonetaria(1d, Locale.US),
                FormatacaoMonetaria(cotacaoDolar, ptbr));

        sc.close();

        System.out.println("\n###################### FIM ######################\n");
    }

    private static String FormatacaoMonetaria(Double valor, Locale local) {
        return NumberFormat.getCurrencyInstance(local).format(valor);
    }

}
