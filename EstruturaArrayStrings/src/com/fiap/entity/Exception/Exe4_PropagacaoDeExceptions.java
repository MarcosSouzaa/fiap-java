package com.fiap.entity.Exception;

import java.io.FileWriter;
import java.io.IOException;

// Tipo Checked

public class Exe4_PropagacaoDeExceptions {

    public static void main(String[] args) throws IOException {
         /*
          * Propagação de exceções – Throws
          * Um método pode optar por não tratar a exceção e simplesmente propagá-la, ou melhor, delegar para o método que a chamou.
          * Dessa forma, podemos notificar o método que invocou outro método, que alguma exceção ocorreu.
          * No exemplo abaixo, ele vai tentar gravar um arquivo txt no driver d e vai dar erro de compilação.
          *
          * FileWriter fw = new FileWriter("d:\\nota.txt");
          *
          * Esse erro é do tipo CHECKED, ou seja, força o programador a tratar essa linha de código. E podemos tratá-la de duas formas:
          * Com um bloco TRY/CATCH ou utilizando THROWS e lançando essa excessão caso ocorra, para quem chamou a execução dessa linha.
          * Isso acontece adicionando throws na declaração do método.
          *
          * Portanto, a cláusula throws declara excessões que podem ocorrer, que podem ser lançadas de um determinado método. Forçando
          * Assim quem quem o chame, faça o tratamento de excessão do método chamador.
          * Ficaria assim:
          *
          *  public static void main(String[] args) throws IOException {
         */

        FileWriter fw = new FileWriter("d:\\nota.txt");

    }

}
