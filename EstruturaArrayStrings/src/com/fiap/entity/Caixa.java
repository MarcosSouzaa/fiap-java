package com.fiap.entity;

public class Caixa {
    public static void main(String[] args) {

        // Declaramos um Array produtos da classe Produtos
        // estanciamos esse Array com 2 posições
        Produto[] produtos = new Produto[2];

        // para popular esse Array precisamos declarar e estanciar dois objetos Produto
        // setando os atributos que foram declarados na classe

        Produto prod1 = new Produto();
        prod1.setNome("Limão");
        prod1.setDescricao("Galego");
        prod1.setValor(4);

        Produto prod2 = new Produto();
        prod2.setNome("Maçã");
        prod2.setDescricao("Gala");
        prod2.setValor(5);

        /*
         * Para que possamos atribuir um valor a uma determinada posição de um array
         * precisamos utilizar esse array produtos criado no início e seu índice. e nele
         * atribuir o objeto que desejamos, nesse caso: prod1 ou prod2. Na 1ª posição do
         * Array produtos, atribuimos o endereço do objeto em memória, prod1. Na 2ª
         * posição do Array produtos, atribuimos o endereço do objeto em memória, prod2.
         */
        produtos[0] = prod1;
        produtos[1] = prod2;

        /**
         * utilizando o laço for, vamos criar uma condição que retorna o tamanho
         * (length) do array produtos o for vai iterar de zero enquanto i for menor que
         * o tamanho desse array. Imprimindo com o método sobrecarregado to String,
         * todas as informações da classe produtos em cada posição do índice i.
         */

//    for(int i = 0; i < produtos.length; i++) {
//
//        System.out.println(produtos[i].toString());
//

        /**
         * Utilizando o forEach Para cada variável de nome prod, do tipo Produto no
         * array produtos imprima com o método sobrecarregado toString.
         */

        for (Produto prod : produtos) {
            System.out.println(prod.toString());
        }

        // Array Multidimensional
        // 10 corredores com três prateleiras cada.
        Produto[][] localizacaoProdutos = new Produto[10][3];

        localizacaoProdutos[2][1] = prod1;
        localizacaoProdutos[2][2] = prod2;

        // No corredor de índice [0] e prateleira de índice [1], atribuímos a referência
        // ao produto 1:
        System.out
                .println("\nArray multidimensional_Impressão primeiro produto: " + localizacaoProdutos[2][1].getNome());
        System.out.println("Array multidimensional_Impressão segundo produto: " + localizacaoProdutos[2][2].getNome());

        System.out.println("\n---------------------------------------------------------------------------------------");

// Três formas de utilizarmos uma String
        System.out.println("\nTrês formas de utilizarmos uma String");

        // 1ª Forma) Declaração de uma String
        String nome;
        // Estanciamos essa variável
        nome = new String();
        // Inicializamos com um conteúdo “Maçã”
        nome = "Maçã";
        // vamos imprimir
        System.out.println("\nString forma 1 criando uma String nome, estanciando e depois passando o valor na String: " + nome);

        // 2ª Forma)
        // Esse trecho declara
        String nome2 = new String("Maçã"); // Esse trecho instancia e passa ao construtor dessa classe, o texto Maçã
                                            // para que ela seja inicializada através do construtor.
        System.out.println("\nString forma 2, criando uma String nome2 entanciando-a e passando o valor pelo constutor: " + nome2);

        // 3ª Forma)
        String nome3 = "Maçã";
        System.out.println("\nString forma 3, usando Pool de memória: " + nome3);

        System.out.println("-----------------------------------------------------------------------------------------");

        // Formatando a String para impressão:
        System.out.println("\nFormatando a String para impressão");

        //Usando CTRL \n
        String descricao = "\nTipo Gala \nA maçã mais doce do mercado. Aqui eu pulo a linha depois do Ctrl n. ";
        System.out.println(descricao);


        //Usando CTRL \t
        descricao = "\nTipo Gala \tA maçã mais doce do mercado. Aqui eu dou um espaço de tabulação depois do Ctrl t.";
        System.out.println(descricao);

        // Usamdo CTRL \""

        descricao = "\nTipo Gala \"A maçã mais doce do mercado\" Aqui eu coloco Ctrl + aspas duplas na frase.";
        System.out.println(descricao);

        System.out.println("\n-----------------------------------------------------------------------------------------");

        // Concatenando Strings
        System.out.println("\nConcatenando Strings\n");

        String produto = new String("Manga");
        String denominacao = new String();
        denominacao = "Tipo Espada, a manga mais doce do mercado";

        //Vai imprimir: Manga Tipo Espada, a manga mais doce do mercado.
        String propaganda = produto + " " + denominacao;
        System.out.println(propaganda);

        // usando concat() para concatenação
        // vai imprimir: Manga Tipo Espada, a manga mais doce do mercado.
        propaganda = produto.concat(" ").concat(denominacao);
        System.out.println(propaganda);

        // Vamos usar o operador de atribuição += para concatenar o sinal de exclamação
        // com a frase que concatenamos no passo anterior.
        propaganda += "!";
        System.out.println(propaganda);

    }
}
