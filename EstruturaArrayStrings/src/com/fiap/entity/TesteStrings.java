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

    /*
     * O resultado -1 indica que o caractere 'X' não está presente na String. O método indexOf também pode
     * ser utilizado para procurar por uma sequência de caracteres, para isso, basta passar uma palavra ao
     * invés do caractere.
     * A variável position1 deve armazenar o valor do índice do início da palavra "Faculdade".
     */
    String facul3 = "FIAP - A melhor Faculdade de Tecnologia";
    int position1 = facul3.indexOf("Faculdade");
    System.out.println("O índice da palavra \"Faculdade\" na String é " + position1);
    // O índice da palavra "Faculdade" na String é 16

    /* Caso o valor  não seja encontrado, será retornado o valor -1, e se tiver duas ocorrências Faculdades,
    Só será retornado o índice da primeira palavra.*/
    System.out.println("------------------------------------------------------------------------------------");

    /*
     * Outro método da classe String é o lastIndexOf, ele retorna o índice da última ocorrência de um caactére
     * ou palavra em uma String.
     * No exemplo abaixo, estamos procurando a última ocorrência do caractere 'a'.
     */
    String facul4 = "FIAP - A Melhor Faculdade de Tecnologia";
    int position2 = facul4.lastIndexOf('a');
    System.out.println("O índice do último caracter 'a' na string é " + position2);
    // O índice do último caracter 'a' na string é 38

    //Para procurar uma palavra, basta passá-la como parâmetro:
    String facu5 = "FIAP - A Melhor Faculdade de Tecnologia, Faculdade";
    int position3 = facu5.lastIndexOf("Faculdade");
    System.out.println("O índice da última palavra \"Faculdade\" na string é " + position3);

    /*
     * É possível criar uma String a partir de um trecho de outra String utilizando o método subString. Este método
     * recebe como parâmetro a posição inicial (inclusive) e posição final (inclusive) do conjunto de caracteres a
     * serem copiados da String original. O caractere da posição inicial será copiado para nova String , já o caractere
     * da última posição nao será copiado.
     */
    String facu6 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova = facu6.substring(16, 25);
    System.out.println("A nova string é: " + nova);
    // O resultado será uma nova String com a palavra "Faculdade", que está no índice 16 e finaliza na posição 24.
    // A nova string é: Faculdade

    /*
     * Podemos utilizar os métodos visto acima em conjunto com o método subString.Por exemplo, podemos utilizar
     * o métodoindexOf para retornar o índice da primeira ocorrência e criar uma nova String.     *
     */
    String facu7 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova2 = facu7.substring(facu7.indexOf('M'), 25);
    System.out.println("A nova string é: " + nova2);
    /*
     * O resultado da busca do índice do caractere 'M' será 9, dessa forma, a nova String será iniciada na posição 9
     * e terminará na posição 25.
     * A nova string é: Melhor Faculdade
     */

    /*
     * O método subString também aceita apenas a posição inicial do conjunto de caracteres a serem copiados da String
     * original. Assim, a nova String será criada da posição inicial informada, até o final da String original.
     */
    String facu8 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova3 = facu8.substring(16);
    System.out.println("A nova string é: " + nova3);
    // A nova string é: Faculdade de Tecnologia

    // Também é possível utilizar os métodos em conjunto:
    String facu9 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova4 = facu9.substring(facu9.lastIndexOf('T'));
    System.out.println("A nova string é: " + nova4);
    //A nova string é: Tecnologia

    /* Podemos converter os caracteres de uma string para maiúsculo ou minúsculo, para isso a classe string possui os métodos
     * toUpperCase e toLowerCase. Para transformar os caracteres de uma string para maiúsculo, podemos utilizar o método
     * toUpperCase e para minúsculo o método toLowerCase. Lembre-se que uma string é imutável, ou seja, ela não pode ser
     * alterada. Dessa forma, quando utilizamos esses métodos, uma nova string será criada com a alteração solicitada.     *
     */
    String facu10 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova5 = facu10.toUpperCase();
    System.out.println("A nova string é: " + nova5);
    //A nova string é: FIAP - A MELHOR FACULDADE DE TECNOLOGIA

    // Vamos realizar uma pequena alteração no exemplo anterior:
    /*
     * No código acima, o método toUpperCase é utilizado para transformar osaracteres em maiúsculo, porém o resultado da
     * transformação não é armazenada em nenhuma variável. Com isso, o resultado será a impressão da string original no
     * console. O método toUpperCase (ou toLowerCase) cria uma nova string com a modificação, sem alterar a string original.
     */
    String facu11 = "FIAP - A Melhor Faculdade de Tecnologia";
    facu11.toUpperCase();
    System.out.println("A nova string é: " + facu11);
    // O resultado será a string original

    // Agora, vamos desenvolver um exemplo com o método toLowerCase:

    String facu12 = "FIAP - A MELHOR FACULDADE DE TECNOLOGIA";
    String nova6 = facu12.toLowerCase();
    System.out.println("A nova string é: " + nova6);
    // O resultado será a nova string armazenada na variável nova com todas
    // as letras em minúsculas:
    //A nova string é: fiap - a melhor faculdade de tecnologia

    /*
     * Podemos substituir caracteres ou palavras de uma string original. O método replace recebe como parâmetros o caractere
     * ou palavra a ser substituída e a letra ou palavra para substituir. Esse método também cria uma nova string com a alteração:
     */
    String facu13 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova7 = facu13.replace('a', 'x');
    System.out.println("A nova string é: " + nova7);
    // A nova string é: FIAP - A Melhor Fxculdxde de Tecnologix

    // Se imprimirmos o valor da variável facu, a string original será exibida:

    String facu14 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova8 = facu14.replace('a', 'x');
    System.out.println("A nova string é: " + nova8);
    System.out.println("Valor da variável facu: " + facu14);
    // A nova string é: FIAP - A Melhor Fxculdxde de Tecnologix
    // Valor da variável facu: FIAP - A Melhor Faculdade de Tecnologia

    // É possível também substituir uma palavra em uma string:

    String facu15 = "FIAP - A Melhor Faculdade de Tecnologia";
    String nova9 = facu15.replace("Tecnologia", "São Paulo");
    System.out.println("A nova string é: " + nova9);
    System.out.println("Valor da variável facu: " + facu15);
    //A nova string é: FIAP - A Melhor Faculdade de São Paulo
   // Valor da variável facu: FIAP - A Melhor Faculdade de Tecnologia

    /*
     * O último método da classe string que será estudado será o método split. Este é um método muito útil, que separa o valor
     *  de uma string em várias strings separadas por um delimitador, que deve ser informado ao método:
     */
    String facu16 = "FIAP - A Melhor Faculdade de Tecnologia";
    String[] palavras = facu16.split(" ");
    for (String p : palavras) {
        System.out.println(p);
    }
    /*
    Este exemplo separa a string armazenada na variável facu em várias
    palavras separadas por um espaço. O resultado é armazenado em um vetor de
    strings. Após, utilizamos um laço de repetição para percorrer o vetor e imprimir
    o valor de seus elementos, o resultado será:
    */

    /* Como ficou:
    A
    Melhor
    Faculdade
    de
    Tecnologia
    */

    // Além de utilizar o espaço como delimitador, podemos utilizar qualquer
    // outro caractere ou palavra:

    String disciplinas = "LTP;Web;Algoritmos;Banco de Dados";
    String[] dis = disciplinas.split(";");
    for (String d : dis) {
        System.out.println(d);
    }
   }
   // Tecnologia
   // LTP
   // Web
   // Algoritmos
   // Banco de Dados


}
