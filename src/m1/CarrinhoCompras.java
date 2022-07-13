package m1;

import java.util.Scanner;

public class CarrinhoCompras {

    /**
     * Lê o nome de 5 frutas e armazena num carrinho de compras. Ao final da entrada
     * dos 5 itens, exiba a lista completa.
     * 
     * @param args
     */

    public static void main(String[] args) {

        String[] intensCarrinho = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("\n###################### Carrinho de Compras ######################\n");

        System.out.println("Insira o nome de 5 itens.");

        for (int i = 0; i < 5; i++) {
            System.out.printf("\nItem %d/5: ", i + 1);
            intensCarrinho[i] = sc.nextLine();
        }

        System.out.println("\n###################### Itens do Carrinho ######################\n");

        // Poderia ter usado um foreach.
        for (int i = 0; i < 5; i++) {
            System.out.printf("O item %d/5 inserido foi: %s%n", (i + 1), intensCarrinho[i]);
        }

        sc.close();

        System.out.println("\n###################### FIM ######################\n");

    }

}