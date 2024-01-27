package com.fiap.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestCollection {

    public static void main(String[] args) {

        System.out.println("\n****************************** ARRAY LIST **********************************");
         /*
          * A ArrayList armazena seus elementos em um array interno para gerar uma lista. Essa lista cresce ou diminui
          *  dinamicamente no momento que um elemento é inserido ou excluido da lista. Apesar do nome ArrayList, não é
          *  um array, como visto anteriormente. ArrayList é uma implementação da interface List da API de Collections
          *  do Java, essa classe somente utiliza um array (também já visto neste capítulo) para armazenar os valores,
          *  porém, não podemos acessar diretamente esse array, pois é um atributo encapsulado.
          *
          * Para criar uma ArrayList, basta chamar o seu construtor: */

        //ArrayList<String> lista = new ArrayList<String>();
        //lista.add("LTP");
        //lista.add("WEB");
        //lista.add("ALGORÍTIMOS");

       //for (int i = 0; i < lista.size(); i++) {
           // System.out.println(lista.get(i));
      //  }
        /*
         * Vai devolver a lista
         * LTP
         * WEB
         * ALGORÍTIMOS
         */

        /*
         * No exemplo acima, declaramos uma ArrayList chamada lista e utilizamos o método add, passando como parâmetro um objeto,
         * para ser inserido na lista, esse objeto será adicionado ao final da lista.
         */

        /*
         * Outro método utilizado para inserir um elemento na lista é o set. Esse método adiciona um elemento em determinada posição
         * da lista, substituindo o valor existente nele, ou seja, quando quisermos inserir algo na primeira posição e essa já
         * estiver ocupada, utilizamos o método set determinando a posição desejada, que para o caso seria 0, já o objeto que estava
         * nessa posição é excluído da ArrayList:
         */
        /*
         * ArrayList<String> lista = new ArrayList<String>(); lista.add("LTP");
         * lista.add("WEB"); lista.add("CLOUD"); lista.add("Kubernets");
         * lista.remove(0);
         *
         * for (int i = 0; i < lista.size(); i++) { System.out.println(lista.get(i)); }
         */
         /*
          * Para procurar por um valor em uma ArrayList, podemos utilizar o método indexOf ou lastIndexOf, que são muito parecidos
          * com os métodos da classe string, visto anteriormente. Como uma lista pode conter elementos duplicados o primeiro método         *   indexOf retorna ao índice da primeira ocorrência encontrada
          * indexOf retorna ao índice da primeira ocorrência encontrada na lista:
          */

          ArrayList<String> lista = new ArrayList<String>();
          lista.add("LTP");
          lista.add("WEB");
          lista.add("CLOUD");
          lista.add("Kubernets");
          lista.add("WEB");

          int indice = lista.indexOf("WEB");
          int indice2 = lista.indexOf("Kubernets");

          System.out.println("\nO valor \"WEB\" está na posição: " + indice);
          System.out.println("O valor \"Kubernets\" está na posição: " + indice2);

          //O valor "WEB" está na posição: 1
          //O valor "Kubernets" está na posição: 3

          /*
           *  O método lastIndexOf() funciona de forma parecida com o método da classe string, recuperando o índice da última
           *  ocorrência na lista. E os dois métodos retornam o valor –1, caso o elemento procurado não esteja presente na lista.
           */

          System.out.println("\n******************************* HASHSET ************************************");


          /* Uma das principais implementações de Set é a classe HashSet, que armazena seus elementos em uma tabela hash.
           * É uma implementação bastante simples e eficiente, como mostra o exemplo a seguir:
           *
           */
          HashSet<Object> cursos = new HashSet<>();
          cursos.add("Java");
          cursos.add("Net");
          cursos.add("Android");
          cursos.add("Java");//Repetido, mas não será impresso na tela,

          System.out.println("\n Cursos: " + cursos);

          /*
           * A grande vantagem do Set é a performance nas operações de busca (método contais), em relação a List.
           * O resultado será -  Cursos: [Java, Net, Android]
           */

          System.out.println("\n******************************* Map e HashMap************************************");

          /**
           * Podemos armazenar informações em mapas, eles são muito úteis quando precisamos recuperar de forma rápida as informações
           * do objeto, para isso é preciso passar uma chave. Por exemplo, podemos armazenar o objeto Aluno em um mapa e utilizar o
           * RM como chave. Dessa forma, é possível informar o RM do aluno para recuperar o objeto que tem todas as informações do
           * aluno.
           * Podemos utilizar uma lista para isso? Claro que sim, o problema é que seria necessário percorrer todos os elementos da
           * lista para encontrar o aluno correto, deste modo, a performance seria comprometida, mesmo para pequenas listas.
           * Um mapa é composto por um par de chave e valor. As chaves não podem conter valores iguais, porém o valor sim.
           * A principal implementação de Map é a classe HashMap. */
          /*
           * O método put é utilizado para adicionar um elemento ao Mapa. Esse método recebe a chave e o valor a ser inserido:
           */

          HashMap<String, String> mapa = new HashMap<String, String>();
          System.out.println();//espaço, uma linha
          mapa.put("RM1234", "Thiago");
          mapa.put("RM4321", "João");

          System.out.println("Mapa: " + mapa); // Mapa: {RM4321=João, RM1234=Thiago}

          /*
           * Para adicionar os elementos no mapa, foram utilizados os pares rm e nome do aluno para a chave e valor, respectivamente.
          */

          System.out.println("\n******************************* Map - Recuperando com Get ************************************");

          /* Para recuperar um elemento do mapa, basta utilizar o método get passando a chave:*/
          System.out.println("\nRecuperar chave RM1234: " + mapa.get("RM1234"));


          System.out.println("\n******************************* Map - Remove ************************************");
          /**
           * As operações de inserir (put) e buscar (get) são as mais utilizadas em mapas. Também existem métodos para remover
           * um elemento do mapa. Já para excluir, utilizamos o método remove, que recebe como parâmetro a chave do elemento a
           * ser removido: */

          System.out.println("Removendo a chave RM1234");
          mapa.remove("RM1234");
          System.out.println(mapa); // Remove elemento

    }

}
