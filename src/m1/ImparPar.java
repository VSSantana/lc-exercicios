package m1;

import java.util.Scanner;

public class ImparPar {

    /**
     * Lê 5 números. Ao final, escreva primeiros todos os ímpares, depois todos os
     * pares.
     * 
     * @param args
     */

    public static void main(String[] args) {

        Integer[] numeros = new Integer[5];
        Integer flagImpressaoCabecalho = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n###################### Par e Ímpar ######################\n");

        System.out.println("Insira 5 números inteiros.");

        // Outra forma seria ter separado em listas diferentes já na entrada.
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nNúmero %d/5: ", i + 1);
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < 5; i++) {
            if (flagImpressaoCabecalho == 0) {
                flagImpressaoCabecalho++;
                System.out.println("\n###################### Números ímpares inseridos ######################\n");
            }
            if ((numeros[i] % 2) != 0)
                System.out.printf("O número ímpar %d foi inserido.%n", numeros[i]);
        }

        flagImpressaoCabecalho = 0;

        for (int i = 0; i < 5; i++) {
            if (flagImpressaoCabecalho == 0) {
                flagImpressaoCabecalho++;
                System.out.println("\n###################### Números pares inseridos ######################\n");
            }
            if ((numeros[i] % 2) == 0)
                System.out.printf("O número par %d foi inserido.%n", numeros[i]);
        }

        sc.close();

        System.out.println("\n###################### FIM ######################\n");

    }

}
