package br.com.voeairlines.treinamentopoo;

public class Algoritimo26 {
	double prestacao;
	double valor;
	double taxa;
	int tempo;
	
	public Algoritimo26(double v, double tx, int tm) {
		valor = v;
		taxa = tx;
		tempo = tm;
		
	}
	
	public double taxaJuros() {
		prestacao = valor +(valor*(taxa/100)*tempo);
		return prestacao;
	}
}
