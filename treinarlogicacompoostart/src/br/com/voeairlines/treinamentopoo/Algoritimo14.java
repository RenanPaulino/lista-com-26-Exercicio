package br.com.voeairlines.treinamentopoo;

public class Algoritimo14 {
	
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double reajuste() {
		double ReajusteSaldo = this.saldo * 0.01 + this.saldo;
		System.out.println("O reajuste do saldo de 1% é de: ");
		return ReajusteSaldo;
	}

}
