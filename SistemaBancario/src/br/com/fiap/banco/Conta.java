package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Marcos Souza
 * @version 1.0
 */
public class Conta implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // Attributes
    private int agencia;
    private int numero;
    private double saldo;

    // Default Constructor
    public Conta() {

    }

    // Class Constructor
    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Depositar da Classe conta
     * @param valor a ser depositado
     */
    public void depositar(double valor) {
        this.saldo += valor; // or  this.saldo = this.saldo + valor
    }

    /**
     * Retira um valor do saldo da conta
     * @param valor que será retirado
     * @see depositar
     */
    public void retirar(double valor) {
        this.saldo -= valor;
    }

    /**
     * Verifica o saldo da conta
     * @return valor do saldo da conta
     */
    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
