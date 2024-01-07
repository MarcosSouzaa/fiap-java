package br.com.java;

public class TesteConta {
    
	public static void main(String[] args) {
		
		Conta cc = new Conta(1000, 50.0);			
		//cc.setNumero(50.0); No need. just the logic to execute		
		System.out.println(cc.recuperarSaldo());
    }
}
