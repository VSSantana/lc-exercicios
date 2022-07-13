package m1;

import java.util.Scanner;

public class PolegadasCentimetros {
    /**
     * Realiza conversão de medidas de polegadas em centímetros.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double comprimentoPolegadas = 0d;
        Boolean entradaValida = false;

        System.out.println("\n###################### INÍCIO ######################\n");

        do {
            try {
                System.out.print("Insira um valor de comprimento em polegadas (Ex.: 7.92): ");
                comprimentoPolegadas = Double.parseDouble(sc.nextLine());
                entradaValida = true;
            } catch (Exception e) {
                System.err.println("Entrada incompaível com o esperado.");
            }
        } while (entradaValida != true);

        entradaValida = false;

        System.out.println("\n###################### Comprimento em Centímetros ######################\n");

        Double comprimentoCentimetros = comprimentoPolegadas * 2.54;

        System.out.printf("%.2f polegadas equivale a %.2f centímetros.\n", comprimentoPolegadas,
                comprimentoCentimetros);

        sc.close();

        System.out.println("\n###################### FIM ######################\n");
    }
}
