package br.com.voeairlines.treinamentopoo;

public class Algoritimo18 {

	double raio;
	public Algoritimo18 (double r) {
		raio = r;
	}
	
	public double perimetro() {
		double p = 3.14 *( 2 * raio );
		return p;
	}
	public double area() {
		double a = 3.14 * (Math.pow(raio, 2));
		return a;
	}
}
