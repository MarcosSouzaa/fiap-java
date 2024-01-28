package com.fiap.entity.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

    public static void main(String[] args) {

        String nomeDoArquivo = "estoque.cvs";
        //Nesta versão, usei System.getProperty("user.dir") para obter o diretório de trabalho do usuário.
        String diretorio = System.getProperty("user.dir");//Foi salvo em D:\Development\ws-fiap_projetos\EstruturaArrayStrings\estoque.cvs
        String caminho = diretorio + "\\" + nomeDoArquivo;

        List<String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade");
        conteudo.add("Pera; 200; pct; R$ 5.40");
        conteudo.add("Morango; 400; cx; R$ 6.50");
        conteudo.add("Abacaxi; 280; un; R$5.00");

        gravarEstoque(nomeDoArquivo, caminho, conteudo);

    }

    private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

        // O Objeto FileWriter abre uma conexão de escrita
        FileWriter stream;
        PrintWriter print;

        try {
            // stream é uma conexão de escrita para o arquivo
            stream = new FileWriter(caminho);
            // a class PrintWriter escreverá no arquivo
            print = new PrintWriter(stream);

            // para cada linha contida dentro do conteúdo passada como parâmetro, escreva uma linha no arquivo.
            for(String linha : conteudo) {

                // O método println escreve uma linha no arquivo
                print.println(linha);
            }

            //close fecha o arquivo
            print.close();
            stream.close();

            System.out.println("O arquivo " + nomeDoArquivo + " Foi salvo em " + caminho);

        }catch(IOException e) {

            e.printStackTrace();
        }

    }

}
