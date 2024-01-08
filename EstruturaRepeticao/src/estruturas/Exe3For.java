package estruturas;

public class Exe3For {

    public static void main(String[] args) {

        int qtProdutos = 5;
//
//        for(int i = 0; i < qtProdutos; i++) {
//            System.out.println("O caixa registrou o produto: " + i);
//        }

        /**
         * A estrutura do For tem uma variável interna que tem um contador iniciado com zero Int i = 0;
         * Uma condição que será executada enquanto ela for satisfeita: i < qtProdutos;
         * E o incremento dessa variável interna:i++
         */
        for(int i = 1; i <= qtProdutos; i++) {
            System.out.println("O caixa registrou o produto: " + i);
        }
    }
}
