package usandoScanner;

import java.util.Scanner;

public class UsandoWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double notaTotal = 0;
        double valorDaNota = 0;
        while (true) {
            double nota;
            System.out.println("Insira uma Nota: ");
            while (true) { // enquanto não digitar um número válido, continua no while
                try {
                    nota = Double.parseDouble(input.nextLine().replace(",", "."));
                    break; // se chegou aqui é porque o número é válido, então posso sair do while
                } catch (NumberFormatException e) {
                    // número inválido
                    System.out.println("\nDigite um número válido\n");
                }
            }

            // se for -1, sai do while mais externo
            if (nota == -1)
                break;

            if (nota < 0.0 || nota > 10.0) {
                System.out.println("Digite um valor válido!");
            } else {
                notaTotal += nota;
                valorDaNota++;
            }
        }

    }

}
