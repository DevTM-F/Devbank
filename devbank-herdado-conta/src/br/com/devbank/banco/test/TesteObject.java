package br.com.devbank.banco.test;

import br.com.devbank.banco.modelo.Cliente;
import br.com.devbank.banco.modelo.Conta;
import br.com.devbank.banco.modelo.ContaCorrente;
import br.com.devbank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(6);
//		System.out.println(false);
		
		Conta cc = new ContaCorrente(22, 33);
		Conta cp = new ContaPoupanca(33, 22);	
		Cliente cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		//println(cliente);
		
	}
	
	static void println() {}
	static void println(int a) {}
	static void println(boolean valor) {}
	static void println(Conta conta) {}

}
