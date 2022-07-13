package m1;

import java.util.Scanner;

public class ImparMaiuscula {

    /**
     * Lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
     * A contagem considera o primeiro caractere da palavra como 1.
     * 
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.println("\n###################### INÍCIO ######################\n");

        System.out.print("Insira uma palavra: ");
        palavra = sc.next();

        System.out.println("\n################ Palavra Modificada ################\n");

        System.out.print("Palavra com posições ímpares capitalizadas: ");

        // Não consegui pensar em outra forma que não utilizasse charAt e usasse String.
        for (int i = 0; i < palavra.length(); i++) {
            if (((i + 1) % 2) == 0)
                System.out.print(palavra.charAt(i));
            else
                System.out.print(palavra.toUpperCase().charAt(i));
        }

        sc.close();

        System.out.println("\n\n######################## FIM #######################\n");

    }

}
