package br.com.voeairlines.treinamentopoo;

public class Algoritimo22 {
	double area;
	double dMaior;
	double dMenor;

	public Algoritimo22(double a, double b) {

		dMaior = a;
		dMenor = b;
	}

	public double areaLosango() {
		area = dMaior * dMenor / 2;
		return area;
	}

}
