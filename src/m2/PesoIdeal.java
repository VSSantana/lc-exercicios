package m2;

import java.util.Scanner;

public class PesoIdeal {

    /**
     * Lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e ao final
     * informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
     * 
     * @param args
     */

    public static void main(String[] args) {

        ImcCalc imc = new ImcCalc();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n######################## IMC #########################\n");

        System.out.println("Insira o nome, altura e peso de 5 pessoas.");

        for (int i = 0; i < imc.getListaNome().length; i++) {
            System.out.printf("\nPessoa %d/5 - nome: ", (i + 1));
            imc.setListaNomePosicao(sc.nextLine(), i);
            System.out.printf("\nPessoa %d/5 - altura: ", (i + 1));
            imc.setListaAlturaPosicao(Double.parseDouble(sc.nextLine()), i);
            System.out.printf("\nPessoa %d/5 - peso: ", (i + 1));
            imc.setListaPesoPosicao(Double.parseDouble(sc.nextLine()), i);
            System.out.println("");
        }

        System.out.println("\n###################### Saída ######################\n");

        imc.calculaImc();

        for (int i = 0; i < imc.getListaNome().length; i++) {

            if (imc.getListaImcPosicao(i) < 18.5 || imc.getListaImcPosicao(i) > 25) {
                System.out.printf("%s está fora do peso ideal com um IMC de %.2f.%n", imc.getListaNomePosicao(i),
                        imc.getListaImcPosicao(i));
            }

        }

        sc.close();

        System.out.println("\n################################ FIM #################################\n");

    }

}
