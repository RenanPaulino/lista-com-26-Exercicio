package br.com.voeairlines.treinamentopoo;

public class Algoritimo21 {
	double area;
	double base;
	double altura;

	public Algoritimo21(double a, double b) {

		altura = a;
		base = b;
	}

	public double areaTriangulo() {
		area = base * altura / 2;
		return area;
	}
}
