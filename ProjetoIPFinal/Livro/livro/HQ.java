package Livro.livro;

import Livro.exception.AnoInvalidoException;

public class HQ extends Livro{
	private int raridade;
	public HQ (String titulo, int ano) throws AnoInvalidoException {
		super (titulo, ano);
		this.raridade = 2018 - ano;
		this.calcularPreco(this.raridade);
	}
	public void calcularPreco(int raridade) {
		Double valor = 2.0*raridade;
		this.setPreco(valor);
	}
}