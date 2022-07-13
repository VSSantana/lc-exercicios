package m1;

import java.util.Scanner;

public class MenorMaiorMedia {

    /**
     * Lê 5 números e informa o maior, o menor e a média deles.
     * 
     * @param args
     */

    public static void main(String[] args) {

        Integer[] numeros = new Integer[5];
        Integer maior = 0, menor = 0;
        Double media = 0d;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n###################### Menor, Maior e Média ######################\n");

        System.out.println("Insira 5 números inteiros.");

        for (int i = 0; i < 5; i++) {
            System.out.printf("\nNúmero %d/5: ", i + 1);
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("\n########################## Estatísticas ##########################\n");

        menor = numeros[0];

        // Sem uso de MIN e MAX.
        for (int i = 0; i < 5; i++) {

            if (numeros[i] > maior)
                maior = numeros[i];

            if (numeros[i] < menor)
                menor = numeros[i];

            media = media + numeros[i];

        }

        media = media / 5;

        System.out.printf("O menor número inserido foi %d, o maior %d e a média dos 5 igual a %.2f.%n", menor, maior,
                media);

        sc.close();

        System.out.println("\n############################### FIM ##############################\n");

    }

}
