package estruturas;

public class Exe1RepeticaoWhile {

    public static void main(String[] args) {
        int qtProdutos = 5;
        int registro = 0;

        /**
         * Vou registrar um produto enquanto ele for menor que 5 e mostrar a informação
         * na tela. Pensando em checkout de mercado.
         */
        while(registro < qtProdutos) {
            registro ++ ;

            System.out.println("O produto número: " + registro + " foi registrado");
        }

    }

}
