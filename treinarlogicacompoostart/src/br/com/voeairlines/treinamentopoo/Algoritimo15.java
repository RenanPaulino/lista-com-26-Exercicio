package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo15 {

	Scanner leia = new Scanner(System.in);

	double salMinimo;
	double watts;
	double valorWatts;
	double valorPagar;
	double valorDescontado;

	public Algoritimo15(double sm, double wts) {

		salMinimo = sm;
		watts = wts;
	}

	public double custoWatts() {

		valorWatts = (salMinimo / 7) / 100;
		return valorWatts;
	}

	public double valorConta() {

		valorPagar = watts * valorWatts;
		return valorPagar;
	}

	public double comDesconto() {

		valorDescontado = valorPagar - valorPagar * 0.10;
		return valorDescontado;
	}

}
