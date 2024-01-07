package br.com.fiap.banco;

public class TesteUnitario2 {

    public static void main(String[] args) {

        // Polimorfismo
        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.retirar(100);

        // Retirada com cobrança da taxa de 10
        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.retirar(100);

        // o método de retirada será da classe contaCrrente por causa da sobreescrita
        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.retirar(100);

        System.out.println("Saldo Conta 1: " + conta1.getSaldo());
        System.out.println("Saldo Conta 2: " + conta2.getSaldo());
        System.out.println("Saldo Conta 3: " + conta3.getSaldo());
    }

}
