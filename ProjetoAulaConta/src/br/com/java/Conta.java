package br.com.java;

public class Conta {
	//Attributes common to all accounts 
	// characteristics of the Accounts Class
	
	private int numero;
	private double saldo; 
	
	public Conta() {
		
	}
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double recuperarSaldo() { //modify public and returns a double type
		return saldo;
	}
	
	public void depositar(double valor) { // modify public no return (void)
		saldo = saldo + valor;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;		
	}
	
	public int getNumero() {
		return numero;
	}
}
