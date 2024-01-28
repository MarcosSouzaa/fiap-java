package com.fiap.entity;

import java.util.ArrayList;

public class UsandoGenerics {

    public static void main(String[] args) {

        /*
         * Até o momento nós armazenamos qualquer tipo de objeto nas coleções. Com isso,
         * podemos misturar os objetos dentro de uma mesma coleção.
         */

        /*
         * ArrayList lista = new ArrayList();
         *
         * Aluno aluno = new Aluno(); lista.add("FIAP"); // String lista.add(2); //
         * Integer lista.add(aluno);
         *
         * System.out.println(lista.get(0)); System.out.println(lista.get(1));
         * System.out.println(lista.get(2));
         */
        // Esse é o Print:
        /*
         * FIAP 2 com.fiap.entity.Aluno@5aaa6d82
         */

        /*
         * E para recuperar o elemento da lista? O método get retorna um objeto e,
         * depois, é preciso realizar um cast. Mas com uma coleção com objetos
         * diferentes, será complicado realizá-lo. A partir do Java 5, podemos utilizar
         * o recurso de Generics para restringir os tipos de dados aceitos por
         * referência genérica. Dessa forma, somente o tipo determinado no Generic será
         * permitido inserir na lista, e não qualquer objeto. O Generic permite a
         * verificação do tipo em tempo de compilação e deixa o código mais limpo, pois
         * não é necessário realizar um cast.
         */

       ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Thiago");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("João");

     // Adiciona os clientes à lista
        listaCliente.add(cliente1);
        listaCliente.add(cliente2);


        for (int i = 0; i < listaCliente.size(); i++) {
           Cliente cli = listaCliente.get(i);
           System.out.println(cli.getNome());

           // Vai printar: Thiago e Jõao

          // Podemos utilizar o operador for-each para percorrer a lista

             //for(Cliente cliente : listaCliente) {
             //System.out.println(cliente.getNome());
        // }


      }

   }
}
