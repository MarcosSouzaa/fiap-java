package br.com.fiap.banco;

public class TesteUnitario {

    public static void main(String[] args) {

        Conta conta = new Conta();

        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(1111); // informações provenientes da suoerclasse conta
        cc.setNumero(2222);  // informações provenientes da suoerclasse conta
        cc.setTipo("Pessoa Física"); // informações específicas da classe contaCorrente
        cc.setChequeEspecial(1000);   // informações específicas da classe contaCorrente

        // Vou criar uma cariável do tipo Conta que vai apontar para um objeto contaCorrente
        // nesse caso só consigo acessar os atributos da superclasse
        Conta cc1 = new ContaCorrente();
        cc1.depositar(300); // esse depósito vai para conta principal

        // CAST
        // estou pegando a conta corrente do tipo Conta e diminuindo um nível dando acesso
        // aos atributos novamente da contaCorrente.
        ContaCorrente c1 = (ContaCorrente)cc;
        System.out.println("Saldo " + c1.getSaldoDisponivel());

        // Se conta é uma instância de contaCorrente
        if(conta instanceof ContaCorrente) {
        // Aqui estou forçando a transformação da variável conta para uma
        // variável contaCorrente não dará certo. Não estão na mesma hierarquia, não é instância
           ContaCorrente c2 = (ContaCorrente) conta;

         }

        System.out.println("Saldo conta corrente: R$" + cc.getSaldoDisponivel());
        System.out.println("Saldo na conta principal (teste): R$"+ cc1.getSaldo());

    }
}
