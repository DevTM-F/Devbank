package br.com.devbank.banco.test;

import br.com.devbank.banco.modelo.Conta;
import br.com.devbank.banco.modelo.ContaCorrente;
import br.com.devbank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
	
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.quantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		
		System.out.println(ref.getNumero());
	}

}
