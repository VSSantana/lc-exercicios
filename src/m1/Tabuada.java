package m1;

import java.util.Scanner;

public class Tabuada {
    /**
     * Informa a tabuada de um número informado (entre 1-10).
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer numeroBase = 0;
        Boolean entradaValida = false;

        System.out.println("\n###################### INÍCIO ######################\n");

        do {
            try {
                System.out.print("Insira um número inteiro entre 1 e 10 para obter sua tabuada: ");
                numeroBase = Integer.parseInt(sc.nextLine());
                if (numeroBase > 0 && numeroBase < 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("Entrada incompaível com o esperado.");
            }
        } while (entradaValida != true);

        entradaValida = false;

        System.out.printf("\n###################### Tabuada do %d ######################\n\n", numeroBase);

        System.out.printf("%d x 1: %d\n", numeroBase, (numeroBase * 1)); // Operação desnecessária.
        System.out.printf("%d x 2: %d\n", numeroBase, (numeroBase * 2));
        System.out.printf("%d x 3: %d\n", numeroBase, (numeroBase * 3));
        System.out.printf("%d x 4: %d\n", numeroBase, (numeroBase * 4));
        System.out.printf("%d x 5: %d\n", numeroBase, (numeroBase * 5));
        System.out.printf("%d x 6: %d\n", numeroBase, (numeroBase * 6));
        System.out.printf("%d x 7: %d\n", numeroBase, (numeroBase * 7));
        System.out.printf("%d x 8: %d\n", numeroBase, (numeroBase * 8));
        System.out.printf("%d x 9: %d\n", numeroBase, (numeroBase * 9));
        System.out.printf("%d x 10: %d\n", numeroBase, (numeroBase * 10));

        sc.close();

        System.out.println("\n###################### FIM ######################\n");
    }

}
