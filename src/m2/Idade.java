package m2;

import java.util.Scanner;

public class Idade {
    /**
     * Lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais
     * velho e qual a média de idade.
     * 
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaPessoa listaPessoa = new ListaPessoa();

        System.out.println("\n######################## Aging #########################\n");

        System.out.println("Insira o nome e idade de 5 pessoas.");

        for (int i = 0; i < listaPessoa.getListaNome().length; i++) {
            System.out.printf("\nPessoa %d/5 - nome: ", (i + 1));
            listaPessoa.setListaNomePosicao(sc.nextLine(), i);
            System.out.printf("\nPessoa %d/5 - idade: ", (i + 1));
            listaPessoa.setListaIdadePosicao(Integer.parseInt(sc.nextLine()), i);
            System.out.println("");
        }

        System.out.println("\n###################### Saída ######################\n");

        Integer posicaoMaisNovo = listaPessoa.getPosicaoMaisNovo();
        Integer posicaoMaisVelho = listaPessoa.getPosicaoMaisVelho();

        System.out.printf("A pessoa mais nova da lista é %s com %d anos de idade.%n",
                listaPessoa.getListaNomePosicao(posicaoMaisNovo),
                listaPessoa.getListaIdadePosicao(posicaoMaisNovo));

        System.out.printf("A pessoa mais velha da lista é %s com %d anos de idade.%n",
                listaPessoa.getListaNomePosicao(posicaoMaisVelho),
                listaPessoa.getListaIdadePosicao(posicaoMaisVelho));

        System.out.printf("A média de idade das pessoas é de %.2f anos.%n", listaPessoa.getMediaIdade());

        sc.close();

        System.out.println("\n################################ FIM #################################\n");

    }
}
