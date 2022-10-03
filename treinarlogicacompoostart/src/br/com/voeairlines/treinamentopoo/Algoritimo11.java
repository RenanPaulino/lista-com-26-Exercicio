package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo11 {
	
	Scanner leia = new Scanner(System.in);
	
	public double tercaParte() {
		System.out.print("Digite um valor:");
		double valor = leia.nextInt();
		double tercaP = valor /3;
		System.out.println("A terça parte de "+ valor + "é ");
		return tercaP;
	}
}
