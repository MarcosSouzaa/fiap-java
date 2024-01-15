package usandoScanner;

import java.util.Scanner;

public class UsoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[4];

        for (int i = 0; i < 4; i++) {

            System.out.print("Digite a nota do aluno: ");

            if(notas[i] > 10 ) {
                System.out.println("\nERRO! Digite um valor até 10!\n");
            }

            notas[i] = sc.nextFloat();
        }

        for (float nota : notas) {
            System.out.print("\nNotas digitada: " + nota);

            if (nota >= 7 && nota <= 10) {
                System.out.print(" - Aprovado");
            } else if(nota < 7 && nota >= 5 ) {
                System.out.print(" -  Em Recuperação");
        }else {
            System.out.print(" -  Reprovado");
        }
        sc.close();
    }

    }
}
