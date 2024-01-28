package com.fiap.entity.Exception;

public class Exe2_ExcessoesUnchecked {

    public static void main(String[] args) {

        try {

            int val = 10/0 ;
            int[] valores = new int [3];
            System.out.println(valores[4]);

            String nome = null;
            System.out.println(nome.length());

            int numero = Integer.parseInt("zero");

        }catch(ArithmeticException e) { // exceção de erro Aritmético
            System.out.println("Não é possível dividir um número por zero!");
            //Será tratado nesse trecho de código
            // Mensagem com a lista de Erros
            System.out.println(e.getMessage());
            // Imprime a trilha de erros
            e.printStackTrace();


        }catch(ArrayIndexOutOfBoundsException e) { // Excessão de Erro de acesso indevido
            System.out.println("Não é possível acessar a posição 4 do Array!");


        }catch(NullPointerException e) {// Excessão do eero de acesso ou tentativa de acesso ao Objeto que não foi inicializado
            System.out.println("Não foi possível retornar o length. Variável nome não foi instanciada!");

        }catch(NumberFormatException e) {// Exceção de erro de formatação, não conseguiu transformar a String zero em um número inteiro
            System.out.println("Não foi possível relizar a conversão!");

        }catch(Exception e) {// Senenhum dos outros trechos conseguir tratar a conversão, esse trecho será responsável em fazê-lo
            System.out.println("Erro na execução do programa!");

        }finally { // Após o tratamento de excessão se ocorrrer ou não, o código passará por aqui.
            System.out.println("Sempre passará aqui!");
        }

        System.out.println("\nFim do tratamento das Excessões!");

    }

}
