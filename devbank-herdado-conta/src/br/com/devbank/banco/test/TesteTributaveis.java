package br.com.devbank.banco.test;

import br.com.devbank.banco.modelo.CalculadorDeImposto;
import br.com.devbank.banco.modelo.ContaCorrente;
import br.com.devbank.banco.modelo.seguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);

		seguroDeVida seguro = new seguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);

		System.out.println(calc.getTotalImposto());

	}

}
