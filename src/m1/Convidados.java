package m1;

import java.util.Scanner;

public class Convidados {

    /**
     * Lê o nome de 5 pessoas e armazena numa lista de convidados. Ao final, informa
     * qual o nome mais longo presente na lista.
     * 
     * @param args
     */

    public static void main(String[] args) {

        String[] listaConvidados = new String[5];
        Scanner sc = new Scanner(System.in);
        Integer posicao = 0, maiorTamanho = 0;

        System.out.println("\n######################## Lista de convidados #########################\n");

        System.out.println("Insira o nome de 5 convidados.");

        for (int i = 0; i < 5; i++) {
            System.out.printf("\nConvidado %d/5: ", i + 1);
            listaConvidados[i] = sc.nextLine();
        }

        System.out.println("\n###################### Nome mais longo da lista ######################\n");

        for (int i = 0; i < 5; i++) {
            if (listaConvidados[i].length() > maiorTamanho) {
                maiorTamanho = listaConvidados[i].length();
                posicao = i;
            }
        }

        System.out.printf("O nome mais longo da lista, com %d caracteres, é o do convidado(a) n°%d: %s%n", maiorTamanho,
                (posicao + 1), listaConvidados[posicao]);

        sc.close();

        System.out.println("\n################################ FIM #################################\n");

    }

}
