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

  }
}
