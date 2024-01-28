package com.fiap.entity.Exception;

public class Exe1_TrabalhandoException {

    public static void main(String[] args) {

         try {

             // Trecho onde a exceção pode ocorrer
             int val = 10/0;
             System.out.println(val);

             // captura da excessão
         }catch(Exception e){

             // Tratamento da exceção
             e.printStackTrace();

         }

    }

}
