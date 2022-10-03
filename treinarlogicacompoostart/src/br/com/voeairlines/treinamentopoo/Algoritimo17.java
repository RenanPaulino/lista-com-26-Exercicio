package br.com.voeairlines.treinamentopoo;

public class Algoritimo17 {

	int base;
	int altura;

	public Algoritimo17(int b, int a) {
		base = b;
		altura = a;
	}

	public int perimietro() {
		int p = 2 * (base * altura);
		return p;
	}

	public int area() {
		int a = base * altura;
		return a;
	}

	public double diagonal() {
		double d = Math.sqrt((Math.pow(base, 2) + Math.pow(altura, 2)));
		return d;
	}
}
