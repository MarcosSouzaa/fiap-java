package com.fiap.entity;

public class TesteStrings {

    public static void main(String[] args) {

        /*
         * Comparação de strings
   A comparação de strings deve ser realizada através de métodos, cujos principais métodos para comparação são:
 − Equals(string): verifica a igualdade do valor das strings.
 − EqualsIgnoreCase(string): verifica a igualdade do valor das strings sem diferenciar as letras maiúsculas e
   minúsculas. Não devemos utilizar o operador == para comparar strings, pois esse operador compara o endereço
   de memória que a string está alocada, ao invés do valor armazenado na string. Como no exemplo a seguir:
         */

         /*
   As duas variáveis têm o mesmo valor, porém estão alocadas em endereços de
   memória diferentes. Dessa forma, o resultado será “As strings são diferentes”,
   pois o operador == compara o endereço de memória e não o valor.
      */

        String nome = new String("FIAP");
        String nome2 = new String("FIAP");

        if(nome == nome2) {
            System.out.println("As Strings são iguais.");
        }else {
            System.out.println("As Strings são diferentes.");
        } // As Strings são diferentes.

      /*
    Agora, se inicializar as strings sem instanciá-las, os valores serão
    alocados em um pool de strings. Dessa forma, se os valores forem iguais, elas
    vão compartilhar o mesmo espaço de memória no pool, fazendo com que o
    operador == funcione!
     */

    String nome3 = "FIAP";
    String nome4 = "FIAP";

    if(nome3 == nome4) {
        System.out.println("As Strings são iguais.");
    }else {
        System.out.println("As Strings são diferentes.");
    }// As Strings são iguais.

    /*
    Porém, se uma das duas variáveis for instanciada (new), o operador == não vai funcionar.
    O exemplo abaixo resulta em “As strings são diferentes”:
    */

    String nome5 = "FIAP";
    String nome6 = new String ("FIAP");
    if(nome5 == nome6) {
        System.out.println("As Strings são iguais.");
    }else {
        System.out.println("As Strings são diferentes.");
    } //As Strings são diferentes.

    String nome7 = "FIAP";
    String nome8 = new String("FIAP");
    if(nome7.equals(nome8)) {
        System.out.println("As Strings são iguais.");
    }else {
        System.out.println("As Strings são diferentes.");
    } //As Strings são iguais.

    /*
    Como faremos se houver a necessidade em comparar se as strings são diferentes?
    Para isso não precisamos de um método específico. Basta adicionar na comparação
    o operador de negação (!) e, dessa forma, a comparação será o contrário, ou seja,
    ao invés de ser igual, será diferente.
    */
    String nome9 = "FIAP";
    String nome10 = new String("FIAP");

    if(!nome9.equals(nome10)) {
        System.out.println("As Strings são iguais.");
    }else {
        System.out.println("As Strings são diferentes.");
    } //As Strings são diferentes.

    /*
     * Método equalIgnoreCase:
     * Compara o conteúdo de duas Strings, mas não diferencia os caractéres maiúsculo e minúsculos.
     * Assim sendo, a String "FIAP" e igual a String "fiap"
     */
    String nome11 = "fiap";
    String nome12 = new String("FIAP");
    if(nome11.equalsIgnoreCase(nome12)) {
        System.out.println("As Strings são iguais.");
    }else {
        System.out.println("As Strings são diferentes.");
    } // As Strings são iguais, podemos usar o operador de negação aqui também (!nome11.equalsIgnoreCase(nome12))

    /*
     * Podemos verificar se uma String começa com uma sequência de caractéres específica. O método startsWith
     * recebe a palavra a ser procurada.
     */

    String facu = "FIAP - A melhor faculdade de Tecnologia";
    if(facu.startsWith("FIAP")) {
        System.out.println("A String começa com FIAP.");
    }else {
        System.out.println("A String não começa com FIAP");
    }// A String começa com FIAP.

    /*
     * Também podemos verificar se uma String termina com uma sequência de caracteres específica. O método
     * que realiza essa função é o endsWith, que também recebe a palavra a ser procurada.
     * Esse método também diferencia as letras maiúsculas das minúsculas
     */
    String facul = "FIAP - A melhor faculdade de Tecnologia";
    if(facul.endsWith("gia")) {
        System.out.println("A String termina com gia.");
    }else {
        System.out.println("A String não termina com gia");
    }// A String termina com gia.

    /*
     * Assim como podemos recuperar o tamanho de um vetor, em uma String, podemos recuperar a quantidade
     * de caracteres através do método length. Porém na String , o length é um método, assim deve terminar
     * com abre e fecha parênteses
     */
    String faculd = "FIAP - A melhor faculdade de Tecnologia";
    int caracteres = faculd.length();
    System.out.println("A String possui " + caracteres + " caracteres.");
    // A String possui 39 caracteres.

    /*
     * O método para obter um caractere da String é o charAt. Este método recebe a posição do caractere
     * que será recuperado
     */
    String faculda = "FIAP - A melhor faculdade de Tecnologia";
    char caracter = faculda.charAt(1);
    System.out.println("O segundo caracter da string é " + caracter);
    //  O segundo caracter da string é I

    /*
     * Outro método muito interessante da classe String é o indexOf. Esse método permite localizar a primeira
     * ocorrência de um caractere ou palavra em uma String. Dessa forma, ser for localizado o caractere ou a
     * palavra procurada, o método retorna à posição (indice) da primeira ocorrência da palavra ou .
     * Caso contrário, o valor -1 é retornado, indicando assim que a String não possui o valor procurado.
     * No exemplo abaixo, estamos procurando a primeira ocorrência do caractere 'a'.
     */
    String faculdade = "FIAP - A melhor faculdade de Tecnologia";
    int posicao = faculdade.indexOf('a');
    System.out.println("O índice do caracter 'a' na string é " + posicao);
   // O índice do caracter 'a' na string é 17 considerando que começa sempre por zero

    // Buscando caracter que não existe na String
    String faculdade2 = "FIAP - A Melhor Faculdade de Tecnologia";
    int position = faculdade2.indexOf('x');
    System.out.println("O índice do caracter 'x' na string é " + position);
    // O índice do caracter 'x' na string é -1

   }

}
