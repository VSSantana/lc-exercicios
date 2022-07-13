package m1;

import java.util.Scanner;

public class EntradaSaida {
    /**
     * Recebe dois números inteiros e retorna e informa o resultado das operações
     * soma, subtração, multiplicação e divisão.
     * O resultado é influenciado pela ordem em que os números são inseridos.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer primeiroNumero = 0, segundoNumero = 0;
        Boolean entradaValida = false;

        System.out.println("\n###################### Entrada de Dados ######################\n");

        do {
            try {
                System.out.print("Insira o primeiro número inteiro: ");
                primeiroNumero = Integer.parseInt(sc.nextLine());
                entradaValida = true;
            } catch (Exception e) {
                System.err.println("Entrada incompatível com o tipo esperado.");
            }
        } while (entradaValida != true);

        entradaValida = false;

        do {
            try {
                System.out.print("Insira o segundo número inteiro: ");
                segundoNumero = Integer.parseInt(sc.nextLine());
                entradaValida = true;
            } catch (Exception e) {
                System.err.println("Entrada incompatível com o tipo esperado.");
            }
        } while (entradaValida != true);

        System.out.println("\n###################### Saída de Dados ######################\n");

        // Isso poderia ter sido feito diretamente na impressão, mas não gosto dessa
        // abordagem caso precise reutilizar estes valores.
        Integer soma = primeiroNumero + segundoNumero;
        Integer subtracao = primeiroNumero - segundoNumero;
        Integer multiplicacao = primeiroNumero * segundoNumero;
        Double divisao = (double) primeiroNumero / segundoNumero;

        System.out.println("A soma dos números " + primeiroNumero + " e " + segundoNumero + " é: " + soma);
        System.out.println("A subtração de " + primeiroNumero + " por " + segundoNumero + " é: " + subtracao);

        System.out.printf("A multiplicaçã de %d por %d é: %d%n", primeiroNumero, segundoNumero,
                multiplicacao);
        System.out.printf("A divisão de %d por %d é: %.2f%n", primeiroNumero, segundoNumero, divisao);

        sc.close();

        System.out.println("\n###################### FIM ######################\n");
    }
}