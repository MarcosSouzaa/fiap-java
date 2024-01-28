package com.fiap.entity.Exception;

import java.util.Scanner;

public class Exe3_TesteExceptionUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        try {

        // Realiza a divisão
        int divisao = numero1 / numero2;

        // Exibe o Resultado
        System.out.println("O resultado da divisão é: " + divisao);

        }catch(ArithmeticException e){
            System.err.println("Erro ao dividir!!");
        }

        sc.close();
    }

}
