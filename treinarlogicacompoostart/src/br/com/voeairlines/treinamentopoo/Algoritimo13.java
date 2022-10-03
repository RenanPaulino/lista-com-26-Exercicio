package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo13 {

	Scanner leia = new Scanner(System.in);

	public double medPonderada() {
		System.out.println("Digite 4 valores, aperte ENTER para insir cada valor:");
		// leia.nextInt();
		double num1 = leia.nextDouble();
		double num2 = leia.nextDouble();
		double num3 = leia.nextDouble();
		double num4 = leia.nextDouble();
		double mP = (num1 * 1 + num2 * 2 + num3 * 3 + num4 * 4) / 4;
		return mP;
	}

}
