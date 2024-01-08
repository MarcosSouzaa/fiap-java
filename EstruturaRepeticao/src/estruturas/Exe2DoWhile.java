package estruturas;

public class Exe2DoWhile {

    public static void main(String[] args) {

        int qtProdutos = 5;
        int registros = 0;

        /**
         * O do executa a condição de teste para no final executar a condição while
         * Faz o primeiro registro e imprime na tela, em seguida, entra na condição
         * verifica se é menor que a qtProdutos. Se for, retorna para o Do e faz o
         * segundo registro, incrementa + 1 e volta para verificação até que ela seja
         * satisfeita.
         * Quando o número de registro se tornar maior qu qtProdutos ele sai da condição
         * e encerra o laço.
         */
        do {
            registros ++;
            System.out.println("O caixa registrou o produto: " + registros);

        }while(registros < qtProdutos);

    }

}
