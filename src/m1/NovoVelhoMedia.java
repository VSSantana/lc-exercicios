package m1;

import java.util.Scanner;

public class NovoVelhoMedia {

    /**
     * Lê nome e idade de 5 pessoas e ao final informa quem é o mais novo, o mais
     * velho e qual a média de idade.
     * 
     * @param args
     */

    public static void main(String[] args) {

        String[] listaNome = new String[5];
        Integer[] listaIdade = new Integer[5];
        Scanner sc = new Scanner(System.in);
        Integer posicaoMaisVelho = 0, posicaoMaisNovo = 0, idadeMaior, idadeMenor;
        Double mediaIdade = 0d;

        System.out.println("\n######################## Aging #########################\n");

        System.out.println("Insira o nome e idade de 5 pessoas.");

        for (int i = 0; i < listaNome.length; i++) {
            System.out.printf("\nPessoa %d/5 - nome: ", (i + 1));
            listaNome[i] = sc.nextLine();
            System.out.printf("\nPessoa %d/5 - idade: ", (i + 1));
            listaIdade[i] = Integer.parseInt(sc.nextLine());
            System.out.println("");
        }

        System.out.println("\n###################### Saída ######################\n");

        idadeMenor = listaIdade[0];
        idadeMaior = listaIdade[0];

        for (int i = 0; i < listaIdade.length; i++) {

            if (listaIdade[i] < idadeMenor) {
                posicaoMaisNovo = i;
                idadeMenor = listaIdade[i];
            }

            if (listaIdade[i] > idadeMaior) {
                posicaoMaisVelho = i;
                idadeMaior = listaIdade[i];
            }

            mediaIdade = mediaIdade + listaIdade[i];

        }

        mediaIdade = mediaIdade / 5;

        System.out.printf("A pessoa mais nova da lista é %s com %d anos de idade.%n",
                listaNome[posicaoMaisNovo],
                idadeMenor);

        System.out.printf("A pessoa mais velha da lista é %s com %d anos de idade.%n", listaNome[posicaoMaisVelho],
                idadeMaior);

        System.out.printf("A média de idade das pessoas é de %.2f anos.%n", mediaIdade);

        sc.close();

        System.out.println("\n################################ FIM #################################\n");

    }

}
