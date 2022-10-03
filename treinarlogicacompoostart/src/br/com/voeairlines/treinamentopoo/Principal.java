package br.com.voeairlines.treinamentopoo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Professor digit de 1 a 26");
		int op = leia.nextInt();
		switch (op) {

		case 1: {
			Algoritimo01 alg1 = new Algoritimo01();
			System.out.println(alg1.imprimirMensagem());
			break;
		}
		case 2: {
			Algoritimo02 alg2 = new Algoritimo02();
			System.out.println(alg2.meuNome());
			break;
		}
		case 3: {
			Algoritimo03 alg3 = new Algoritimo03();
			System.out.println(alg3.produto());
			break;
		}
		case 4: {
			Algoritimo04 alg4 = new Algoritimo04();
			System.out.println(alg4.media());
			break;
		}
		case 5: {
			Algoritimo05 alg5 = new Algoritimo05();

			System.out.println("Informe o numero inteiro");
			int num = leia.nextInt();
			System.out.println(alg5.numInteiro(num));
			break;
		}
		case 6: {
			Algoritimo06 alg6 = new Algoritimo06();

			System.out.println("Informe dois valores inteiros");
			int n1 = leia.nextInt();
			System.out.print("segundo é ...");
			int n2 = leia.nextInt();
			System.out.println(alg6.doiNumInteiro(n1, n2));
			break;
		}
		case 7: {
			Algoritimo07 alg7 = new Algoritimo07();
			System.out.println("Informe um valor ");
			int antDepois = leia.nextInt();
			System.out.println(alg7.antesNumDepois(antDepois));
			break;
		}
		case 8: {
			Algoritimo08 alg8 = new Algoritimo08();
			leia.nextLine();
			System.out.println("Digite Nome, Endereço e Telefone");
			System.out.print("Nome...");
			String nome = leia.nextLine();
			System.out.print("Endereço...");
			String end = leia.nextLine();
			System.out.print("Telefone...");
			String tel = leia.nextLine();

			alg8.dados(nome, end, tel);

			System.out.println(alg8.dadosImprimir());
			break;
		}
		case 9: {
			Algoritimo09 alg9 = new Algoritimo09();

			System.out.println("Digite primeiro valor");
			int num1 = leia.nextInt();
			System.out.println("Digite segundo valor");
			int num2 = leia.nextInt();
			System.out.println(alg9.resSoma(num1, num2));
			break;
		}
		case 10: {
			Algoritimo10 algo10 = new Algoritimo10();

			System.out.println("Digite primeiro valor");
			int num1 = leia.nextInt();
			System.out.println("Digite segundo valor");
			int num2 = leia.nextInt();
			System.out.println("O produto de " + num1 + " e " + num2 + " = " + algo10.resProduto(num1, num2));
			break;
		}
		case 11: {
			Algoritimo11 algo11 = new Algoritimo11();
			System.out.println(algo11.tercaParte());
			break;
		}
		case 12: {
			Algoritimo12 algo12 = new Algoritimo12();
			System.out.println(algo12.medAritimetica());
			break;
		}
		case 13: {
			Algoritimo13 algo13 = new Algoritimo13();
			System.out.println(algo13.medPonderada());
			break;
		}
		case 14: {
			Algoritimo14 algo14 = new Algoritimo14();
			System.out.print("Informe o saldo atual:");
			double saldo = leia.nextDouble();
			algo14.setSaldo(saldo);
			System.out.println(algo14.reajuste());
			break;
		}
		case 15: {
			System.out.println("Informe o valor do salario minimo: ");
			double salMinimo = leia.nextDouble();
			System.out.println("Informe o valor gasto em quilowatts:");
			double watts = leia.nextDouble();

			Algoritimo15 algo15 = new Algoritimo15(salMinimo, watts);
			System.out.printf("O valor de cada quilowatts é de %.2f Watts \n", algo15.custoWatts());
			System.out.printf("O valor da conta R$%.2f \n", algo15.valorConta());
			System.out.printf("Valor com desconto R$%.2f", algo15.comDesconto());
			break;
		}
		case 16: {
			leia.nextLine();
			System.out.println("Digite um nome com ao menos 4 caracteres:");
			String nome = leia.nextLine();

			Algoritimo16 algo16 = new Algoritimo16(nome);
			System.out.println(algo16.analizandoString());
			break;
		}
		case 17: {
			System.out.print("Entre com o valor base: ");
			int base = leia.nextInt();
			System.out.print("Entre com o valor altura: ");
			int altura = leia.nextInt();

			Algoritimo17 algo17 = new Algoritimo17(base, altura);
			System.out.println("O valor do perimetro é : " + algo17.perimietro());
			System.out.println("O valor da área é: " + algo17.area());
			System.out.printf("O valor do diagonal é de: %.2f ", algo17.diagonal());
			break;
		}
		case 18: {
			System.out.print("Entre com valor do raio: ");
			double raio = leia.nextDouble();

			Algoritimo18 algo18 = new Algoritimo18(raio);
			System.out.printf("O valor do perimetro é de: %.2f ", algo18.perimetro());
			System.out.printf("\nO valor da área é de : %.2f ", algo18.area());
			break;
		}
		case 19: {
			System.out.print("Informe o tamanho lado do quadrado: ");
			double lado = leia.nextDouble();

			Algoritimo19 algo19 = new Algoritimo19(lado);
			System.out.printf("\nO perimetro do quadrado é de : %.2f", algo19.perimetroQ());
			System.out.printf("\nA área do quadrado é de : %.2f", algo19.areaQ());
			System.out.printf("\nA diagonal do quadrado é de : %.2f", algo19.diagonalQ());
			break;
		}
		case 20: {
			System.out.println("Informe o valor de A: ");
			int a = leia.nextInt();
			System.out.println("Informe o valor de B: ");
			int b = leia.nextInt();
			System.out.println("Informe o valor de c: ");
			int c = leia.nextInt();

			Algoritimo20 algo20 = new Algoritimo20(a, b, c);
			System.out.printf("O valor do diagonal do retangulo: %.2f", algo20.diagonalParale());
			break;
		}
		case 21: {
			System.out.print("Informe a base do triangulo:");
			double b = leia.nextDouble();
			System.out.print("Informa a altura do triangulo:");
			double a = leia.nextDouble();

			Algoritimo21 algo21 = new Algoritimo21(a, b);
			System.out.printf("Area do triangulo: %.2f", algo21.areaTriangulo());
			break;
		}
		case 22: {
			System.out.print("Informe a diagonal maior:");
			double b = leia.nextDouble();
			System.out.print("Informa a diagonal menor:");
			double a = leia.nextDouble();

			Algoritimo21 algo22 = new Algoritimo21(a, b);
			System.out.printf("Area do triangulo: %.2f", algo22.areaTriangulo());
			break;
		}
		case 23: {
			Algoritimo23 algo23 = new Algoritimo23();

			leia.nextLine();
			System.out.println("Informe o nome:");
			algo23.setNome(leia.nextLine());
			System.out.println("Informe a idade:");
			algo23.setIdade(leia.nextInt());

			System.out.println("Nome: " + algo23.getNome());
			System.out.println("Idade: " + algo23.getIdade());
			break;
		}
		case 24: {
			System.out.println("Informe o valor do grau em Celsius");
			int c = leia.nextInt();

			Algoritimo24 algo24 = new Algoritimo24(c);

			System.out.println(c + "Celsius = " + algo24.conversaoC_F() + " Fahrenheit");
			break;
		}
		case 25: {
			System.out.print("Informe o raio da lata: ");
			double r = leia.nextDouble();
			System.out.print("Informe a altura da lata: ");
			double a = leia.nextDouble();

			Algoritimo25 algo25 = new Algoritimo25(a, r);

			System.out.println("O volume é de : " + algo25.volumeOleo());
			break;
		}
		case 26: {
			System.out.print("Informem o valor da divida R$: ");
			double v = leia.nextDouble();
			System.out.print("Informe o valor a taxa: % ");
			double tx = leia.nextDouble();
			System.out.print("Quantos dias de atraso: ");
			int tm = leia.nextInt();

			Algoritimo26 algo26 = new Algoritimo26(v, tx, tm);

			System.out.println("O valor com juros é de R$" + algo26.taxaJuros());

		}
		}
		leia.close();
	}
}
