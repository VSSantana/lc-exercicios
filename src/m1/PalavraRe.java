package m1;

import java.util.Scanner;

public class PalavraRe {

    /**
     * Lê uma palavra e a escreve de volta ao contrário.
     * 
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.println("\n###################### INÍCIO ######################\n");

        System.out.print("Insira uma palavra: ");
        palavra = sc.next();

        System.out.println("\n###################### Palavra ao Contrário ######################\n");

        System.out.print("Palavra inserida de trás para frente: ");

        // Outra possibilidade teria sido criar um array de char e passar para ele a
        // palavra invertida.
        for (int i = palavra.length(); i != 0; i--) {
            System.out.print(palavra.charAt(i - 1));
        }

        sc.close();

        System.out.println("\n\n###################### FIM ######################\n");

    }

}
