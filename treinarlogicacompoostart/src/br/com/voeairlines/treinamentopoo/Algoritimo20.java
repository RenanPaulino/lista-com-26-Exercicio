package br.com.voeairlines.treinamentopoo;

public class Algoritimo20 {

	int a;
	int b;
	int c;

	public Algoritimo20(int a1, int b1, int c1) {
		a = a1;
		b = b1;
		c = c1;

	}

	public double diagonalParale() {
		double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		return d;
	}
}
