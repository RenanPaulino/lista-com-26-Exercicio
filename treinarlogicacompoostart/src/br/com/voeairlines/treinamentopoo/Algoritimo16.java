package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Algoritimo16 {
	Scanner leia = new Scanner(System.in);
	String nome;

	public Algoritimo16(String analizaNome) {

		nome = analizaNome;
	}

	public String analizandoString() {

		System.out.println(" ANALIZANDO O NOME: " + nome.toUpperCase());

		System.out.println("O primeiro caracter é: " + nome.charAt(0));
		System.out.println("O ultimo caracter é  " + nome.charAt(nome.length() - 1));
		System.out.print("Do primeiro até terceiro: ");

		for (int i = 0; i < 3; i++) {
			System.out.print(nome.charAt(i));
		}

		if (nome.length() >= 4) {
			System.out.println("\nO caracter da 4 posição é: " + nome.charAt(3));

		} else {
			System.out.println("\nO nome tem menos de 4 caracteres!");
		}

		System.out.print(" Tirando o primeiro caracter o nome fica: ");
		for (int i = 1; i < nome.length(); i++) {
			System.out.print(nome.charAt(i));
		}
		System.out.print("\nOs dois ultimos caracteres é: ");
		for (int i = 2; i >= 1; i--)
			System.out.print(nome.charAt(nome.length() - i));

		return " ";
	}

}
