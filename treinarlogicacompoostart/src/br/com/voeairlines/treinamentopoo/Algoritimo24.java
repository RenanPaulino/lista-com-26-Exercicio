package br.com.voeairlines.treinamentopoo;

public class Algoritimo24 {

	int celsios;
	double fahrenheit;

	public Algoritimo24(int c) {

		celsios = c;
	}

	public double conversaoC_F() {
		fahrenheit = celsios * 1.8 + 32;
		return fahrenheit;
	}

}
