package m1;

import java.util.Scanner;

public class Imc {

    /**
     * Lê nome, altura e peso de 5 pessoas, calcula o IMC de cada um e ao final
     * informa se alguém está fora do peso ideal (o IMC ideal é entre 18,5 e 25).
     * 
     * @param args
     */

    public static void main(String[] args) {

        String[] listaNome = new String[5];
        Double[] listaAltura = new Double[5];
        Double[] listaPeso = new Double[5];
        Double[] listaImc = new Double[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("\n######################## IMC #########################\n");

        System.out.println("Insira o nome, altura e peso de 5 pessoas.");

        for (int i = 0; i < listaNome.length; i++) {
            System.out.printf("\nPessoa %d/5 - nome: ", (i + 1));
            listaNome[i] = sc.nextLine();
            System.out.printf("\nPessoa %d/5 - altura: ", (i + 1));
            listaAltura[i] = Double.parseDouble(sc.nextLine());
            System.out.printf("\nPessoa %d/5 - peso: ", (i + 1));
            listaPeso[i] = Double.parseDouble(sc.nextLine());
            System.out.println("");
        }

        System.out.println("\n###################### Saída ######################\n");

        for (int i = 0; i < listaNome.length; i++) {

            listaImc[i] = (listaPeso[i]) / (listaAltura[i] * listaAltura[i]);

        }

        for (int i = 0; i < listaImc.length; i++) {

            if (listaImc[i] < 18.5 || listaImc[i] > 25) {
                System.out.printf("%s está fora do peso ideal com um IMC de %.2f.%n", listaNome[i], listaImc[i]);
            }

        }

        sc.close();

        System.out.println("\n################################ FIM #################################\n");

    }

}
