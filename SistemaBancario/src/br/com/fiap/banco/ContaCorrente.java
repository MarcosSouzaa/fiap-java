package br.com.fiap.banco;

public class ContaCorrente extends Conta {

    private String tipo;
    private double chequeEspecial;


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    /**
     * Usa o método getSaldo da classe conta
     * @return valor da conta mais o valor do cheque especial
     */
    public double getSaldoDisponivel() {
        return super.getSaldo()+ chequeEspecial;
    }
    /**
     * Sobrescrita de método que induz ao Polimorfismo
     * Vai usar o método da superclasse  acrescentando a taxa.
     */
    @Override
    public void retirar(double valor) {
        valor+= 10;
        super.retirar(valor);
    }
}

