package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo12 {

	Scanner leia = new Scanner(System.in);

	public double medAritimetica() {
		System.out.println("Digite 2 valores, aperte ENTER para insir cada valor:");

		double num1 = leia.nextDouble();
		double num2 = leia.nextDouble();

		double mP = (num1 + num2) / 2;
		System.out.println("Média");
		return mP;
	}

}
