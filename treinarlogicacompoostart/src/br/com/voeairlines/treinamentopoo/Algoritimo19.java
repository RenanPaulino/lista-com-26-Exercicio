package br.com.voeairlines.treinamentopoo;

public class Algoritimo19 {
	
	double lado;
	
	public Algoritimo19 (double ld ) {
		lado = ld;
	}
	
	public double perimetroQ() {
		double p = 4 * lado;
		return p;
	}
	public double areaQ() {
		double a = Math.pow(lado, 2);
		return a;
	}
	public double diagonalQ() {
		double d = Math.sqrt(Math.pow(lado, 2 ) + Math.pow(lado, 2));
		return d;
	}
}
