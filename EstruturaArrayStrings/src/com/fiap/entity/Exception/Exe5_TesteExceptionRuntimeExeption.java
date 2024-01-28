package com.fiap.entity.Exception;

public class Exe5_TesteExceptionRuntimeExeption {

    public static void main(String[] args) {
         /*
          * Para criar uma exceção, basta criar uma classe que herde de Exception (checked) ou RuntimeException (unchecked).
          */

        try {
            int val = 10 / 0;
            System.out.println(val);
        }catch(Exception e) {

            // Vou criar uma Exceção
            throw new DivisaoPorZeroException();

        }

    }

}
