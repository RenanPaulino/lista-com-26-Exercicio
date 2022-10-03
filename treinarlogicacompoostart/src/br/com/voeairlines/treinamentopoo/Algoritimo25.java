package br.com.voeairlines.treinamentopoo;

public class Algoritimo25 {
	double volume;
	double altura;
	double raio;

	public Algoritimo25(double a, double r) {
		altura = a;
		raio = r;
	}

	public double volumeOleo() {
		volume = 3.14159 * Math.pow(raio, 2) * altura;
		return volume;
	}
}
